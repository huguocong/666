<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/15
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html >
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理</title>
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../plugins/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <script src="../plugins/jquery-2.2.3.min.js"></script>
    <script src="../plugins/bootstrap.min.js"></script>
    <script type="text/javascript" >
        $(document).ready(function(){
            $("#xiaoX").change(function(){
                var xiao=$(this).val();
                $.post("/tema/find1",{xiao:xiao},function (data) {
                  //  alert(JSON.stringify(data));
                    $("#tema").html("<option value=''>-请选择-");
                    $(data).each(function (index,c) {
                        $("#tema").append("<option value='"+c.number+"'>"+c.number)
                    });
                },"json");
            });
        });


        //保存
        function save(){
            var formObject = {};
            var formArray =$("#addfrom").serializeArray();
            $.each(formArray,function(i,item){
                formObject[item.name] = item.value;
            });
            //alert(JSON.stringify(formObject));
            $.ajax({
                type: "POST",   //提交的方法
                url: "/tema/add", //提交的地址
                data: JSON.stringify(formObject),// 序列化表单值
                contentType: 'application/json',
                success:function(Result){
                    alert(Result.message);
                    //window.location.reload();
                    window.location="/tema/finddate?n=1"
                },
                error:function(result){
                    alert("error");
                }
            });
        }

        //全选和全不选
        function checkAll(){
           //获得当前第一个checkbox的状态
            var check1 = document.getElementById("check1");
            //得到当前checked状态
            var checked = check1.checked;
           //	获得所有分类项的checkbox
          //	var checks = document.getElementsByTagName("input");
            var checks = document.getElementsByName("checkone");
            //alert(checks.length);
            for(var i = 0; i < checks.length; i++){
             //	修改每一个checkbox的状态
                var checkone = checks[i];
                checkone.checked = checked;
            }
        }

        //删除
        function del() {
            var checks = document.getElementsByName("checkone");
            var ids=[];
         /*   checks.each(function () {
                if(checks[i].checked){
                    // s+=checks[i].value+',';  字符串
                    s.push($(this).val());
                }
            })*/
            for(var i=0;i<checks.length;i++){
                if(checks[i].checked){
                  ids.push(checks[i].value);
                }
            }
           // alert(ids);
            $.ajax({
                url:"/tema/del",
                type: "get",
                data:{'ids':ids},
                traditional:true,//用传统方式序列化数据
                success:function (result) {
                    alert(result.message);
                   // window.location.reload();
                    window.location="/tema/finddate?n=1"
                },
                error:function () {
                    alert('操作错误');
                }
            })
        }

    /*   $('#de').click(function () {
           var s=[];
           var checks = document.getElementsByName("checkone");
           $(checks).each(function () {
               if (checks.checked) {
                   s.push($(this).val());
               }
           });
           alert(s);
       })*/

    </script>

</head>
<body class="hold-transition skin-red sidebar-mini" >
<!-- .box-body -->
<div class="box-header with-border">
    <h3 class="box-title">管理</h3>
</div>

<div class="box-body" >

    <!-- 数据表格 -->
    <div class="table-box">

        <!--工具栏-->
        <div class="pull-left">
            <div class="form-group form-inline">
                <div class="btn-group">
                    <button type="button" class="btn btn-default" title="输入今日特码" data-toggle="modal" data-target="#editModal" > 新建</button>
                    <button type="button" class="btn btn-default" title="删除" id="de"  onclick="del()">删除</button>
                </div>
            </div>
        </div>
        <div class="box-tools pull-right">
            <div class="has-feedback">
                <a href="/tema/finddate?n=1" class="btn btn-default" title="今日特码" > 今日特码</a>
                <a href="/tema/finddate?n=0" class="btn btn-default" title="往期特码" >往期特码</a>
            </div>
        </div>
        <!--工具栏/-->

        <!--数据列表-->
        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
            <thead>
            <tr>
                <th class="" style="padding-right:0px">
                    <input id="check1" type="checkbox" class="icheckbox_square-blue" onclick="checkAll()" >
                </th>
                <th class="sorting">生肖</th>
                <th class="sorting">号码</th>
                <th class="sorting">日期</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${tema}" var="s">
            <tr >
                <td><input  type="checkbox" value="${s.id}" name="checkone" ></td>
                <td>${s.xiao}</td>
                <td>${s.tema}</td>
                <td> <fmt:formatDate value="${s.date}"/></td>

            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>

<!-- 编辑窗口 -->
<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">编辑</h3>
            </div>
            <div class="modal-body">
                <form id="addfrom" >
                <table class="table table-bordered table-striped"  width="800px">
                    <tr>

                        <td></td>

                        <td> <select class="form-control" name="xiao" id ="xiaoX" >
                            <option value="" >-请选择 -
                            <option value="猪" >猪
                            <option value="狗" >狗
                            <option value="鸡" >鸡
                            <option value="猴" >猴
                            <option value="牛" >牛
                            <option value="羊" >羊
                            <option value="马" >马
                            <option value="蛇" >蛇
                            <option value="龙" >龙
                            <option value="兔" >兔
                            <option value="虎" >虎
                            <option value="鼠" >鼠
                        </select></td>

                        <td>
                            <select  class="form-control" name="tema" id="tema">
                                <option value="" >-请选择 -
                            </select></td>
                    </tr>
                </table>
            </div>
            <div class="modal-footer">
                <button class="btn btn-success" data-dismiss="modal" aria-hidden="true" onclick="save()" >保存</button>
                <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">关闭</button>
            </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>


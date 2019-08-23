<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/15
  Time: 17:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html >
<head>
    <meta http-equiv="Content-Type" content="text/html; charset="utf-8" >
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>管理</title>
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <link rel="stylesheet" href="../plugins/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <script src="../plugins/jquery-2.2.3.min.js"></script>
    <script src="../plugins/bootstrap.min.js"></script>
    <script src="../plugins/jquery-1.11.3.min.js"></script>
    <script src="../js/xiao.js"></script>

    <script type="text/javascript">
        function post(id){
            $.post("/xiao/findOne",{id:id},function(data){
                if (data==null){
                    alert("失败");
                }else {
                    //alert(JSON.stringify(data));
                    $("#id").val(data.id);
                    //$("#xiaoId").text(data.number);
                    $("#xiaoId").val(data.number);
                    $("#xiaoX").val(data.name);

                }

            });
        }


        function save(){
           // const formData = $('#update-xiao').serialize();
         //   var formData = $('#update-xiao').serializeArray();
            var formObject = {};
            var formArray =$("#update-xiao").serializeArray();
            $.each(formArray,function(i,item){
                formObject[item.name] = item.value;
            });
         //   formData = decodeURIComponent(formData,true);
          //  alert( JSON.stringify(formObject));
            $.ajax({
                type: "POST",   //提交的方法
                url: "/xiao/save", //提交的地址
                data: JSON.stringify(formObject),// 序列化表单值
             //   dataType: "text",     //SpringMVC利用注解@ResponseBody返回String时，浏览器显示200状态码，并且响应头为json格式，
                                       // 格式ajax不认为它是json，所以一直执行错误方法后来把dataType=“json”去掉就OK了！
                contentType: 'application/json',
                success:function(Result){
                  alert(Result.message);
                  window.location.reload();
                },
                error:function(result){
                    alert("error");
                }

            });
        }



    </script>

</head>
<body class="hold-transition skin-red sidebar-mini" >
<!-- .box-body -->
<div class="box-header with-border">
    <h3 class="box-title">管理</h3>
</div>

<div class="box-body">

    <!-- 数据表格 -->
    <div class="table-box">

        <!--工具栏-->
        <div class="pull-left">
            <div class="form-group form-inline">
                <div class="btn-group">
                    <a href="/xiao/qian" type="button" class="btn btn-default" title="前移" >前移</a>
                    <a href="/xiao/hou" type="button" class="btn btn-default" title="后移" >后移</a>
                </div>
            </div>
        </div>
        <div class="box-tools pull-right">
            <div class="has-feedback">
            </div>
        </div>
        <!--工具栏/-->

        <!--数据列表-->
        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
            <thead>
            <tr>
                <th class="" style="padding-right:0px">
                    <input id="selall" type="checkbox" class="icheckbox_square-blue">
                </th>

                <th class="sorting">号码</th>
                <th class="sorting">生肖</th>

                <th class="text-center">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${xiao}" var="stu">
            <tr>
                <td><input  type="checkbox" ></td>
                <td>${stu.number}</td>
                <td >${stu.name}</td>

                <td class="text-center">
                    <button class="btn bg-olive btn-xs" data-toggle="modal" data-target="#editModal" onclick="post('${stu.id}')" >修改</button>

                </td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
        <!--数据列表/-->
    </div>
    <!-- 数据表格 /-->

    <!-- 编辑窗口 -->
    <div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog" >
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h3 id="myModalLabel">编辑</h3>
                </div>
                <form id="update-xiao" >
                <div class="modal-body">

                    <table class="table table-bordered table-striped"  width="800px">
                        <tr>
                            <td> <input id="id" name="id"  type="hidden"></td>
                            <td><input type="text" class="form-control" id="xiaoId"  name="number" ></input></td>
                            <td>
                                <select class="form-control" name="name" id ="xiaoX" >
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
                                </select>

                            </td>
                        </tr>
                    </table>

                </div>
                <div class="modal-footer">
                    <button class="btn btn-success" data-dismiss="modal" aria-hidden="true" onclick="save()">保存</button>
                    <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">关闭</button>
                </div>
                </form>
            </div>
        </div>
    </div>

</body>
</html>


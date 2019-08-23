
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
    <link rel="stylesheet" href="../css/hu.css">
    <script type="text/javascript">

        //保存
        function save(){
            var formObject = {};
            var formArray =$("#addfrom").serializeArray();
            alert(formArray);
            alert(JSON.stringify(formArray));
            $.each(formArray,function(i,item){
                if (item.name === "haoma"||item.name === "monny") {
                    var i=1;
                    if(item.name==="haoma"){
                        "t"+i;
                       // alert(k);

                    }
                    var textvalue={};
                   $.each(item,function (j,it) {
                       textvalue[it.name]=it.value;
                   })



                   formObject["text"]=[item];
                }else {
                    formObject[item.name] = item.value;
                }

            });
             alert(JSON.stringify(formObject));
          /*  $.ajax({
                type: "POST",   //提交的方法
                url: "/user/add", //提交的地址
                data: JSON.stringify(formObject),// 序列化表单值
                contentType: 'application/json',
                success:function(Result){
                    alert(Result);
                    window.location.reload();
                },
                error:function(result){
                    alert("error");
                }
            });*/
        }

      /*  $(document).ready(function() {
            $("#addhao").click(function () {
               alert("ss");

               var c=document.getElementById("tablehao");
                var z=c.rows[0].cells;//如果不是空表，首先获得表格有多少列，先获取再插入新行
                var x=c.insertRow(0);
                for(var i=0;i<z.length;i++){//依次向新行插入表格列数的单元格
                    var y=x.insertCell(i);
                    y.innerHTML="new cell"+i;
                }

            })
        })*/

        var rowCount=1;
        //添加行
        function addRow(){
            rowCount++;
            var newRow='<tr id="trhao'+rowCount+'">' +
                '<td><input type="checkbox" class="icheckbox_square-blue" ></td>' +
                '<td ><input type="text" class="form-control" name="haoma"  ></td>' +
                '<td ><input type="text" class="form-control"  name="monny" ></td>' +
                '<td><button type="button" class="btn btn-default" title="删除" onclick="delRow('+rowCount+')"> 删除</button></td></tr>';
            $('#tablehao').append(newRow);
        }

        //删除行
        function delRow(rowIndex){
            $("#trhao"+rowIndex).remove();
            rowCount--;
        }
/*
        function add(){
            alert("s");
            var $td = $("#trhao").clone();       //增加一行,克隆第一个对象
            $(".hu").append($td);
            $("table tr:last").find(":input").val('');   //将尾行元素克隆来的保存的值清空
        }
        function del(){
            $("table tr:not(:first):not(:first):last").remove();//移除最后一行,并且保留前两行
        }*/


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
                    <button type="button" class="btn btn-default" title="新建下注" data-toggle="modal" data-target="#editModal" >新建下注</button>
                    <button type="button" class="btn btn-default" title="删除" >删除</button>
                </div>
            </div>
        </div>
        <div class="box-tools pull-right">
            <div class="has-feedback">
                <button type="button" class="btn btn-default" title="计算" >计算结果</button>
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

                <th class="sorting">姓名</th>
                <th class="sorting">买码{"号码":"金额/元"}</th>
                <th class="sorting">应付/元</th>
                <th class="sorting">实付/元</th>
                <th class="sorting">结果/元</th>
                <th class="sorting">日期</th>

                <th class="text-center">操作</th>
            </tr>
            </thead>
            <tbody>
            <tr ng-repeat="entity in list">
                <td><input  type="checkbox" ng-click="updateSelection($event,entity.id)"></td>
                <td>张三</td>
                <td>{“11”：“[猪,01]”,“12”：“[狗,02]”}</td>
                <td>23</td>
                <td>10</td>
                <td></td>
                <td>2019/08/16</td>
                <td class="text-center">
                    <button type="button" class="btn bg-olive btn-xs" data-toggle="modal" data-target="#editModal" ng-click="findOne(entity.id)" >修改</button>
                </td>
            </tr>
            </tbody>
        </table>
        <!--数据列表/-->
    </div>
    <!-- 数据表格 /-->
    <!-- 分页 -->
    <tm-pagination conf="paginationConf"></tm-pagination>
</div>
<!-- /.box-body -->

<!-- 编辑窗口 -->
<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">编辑</h3>
            </div>
            <div class="modal-body">
                <form id="addfrom">
                <table class="table table-bordered table-striped"  width="800px">
                    <tr>
                        <td>姓名</td>
                        <td><input name="name"  class="form-control"  placeholder="" ></td>
                    </tr>
                    <tr>
                        <td>特码</td>
                        <td name="text">
                            <div class="btn-group">
                                <button type="button" class="btn btn-default" title="新增扩展属性" id="addhao" onclick="addRow()">增加</button>
                            </div>
                            <table class="table table-bordered table-striped hu"   width="800px" id="tablehao">
                                <thead>
                                <tr>
                                    <td><input type="checkbox" class="icheckbox_square-blue"></td>
                                    <td>号码</td>
                                    <td>金额/元</td>
                                    <td>操作</td>
                                </tr>
                                </thead>
                                <tbody>
                                <tr id="trhao0">
                                    <td><input type="checkbox" class="icheckbox_square-blue" ></td>
                                    <td><input type="text" class="form-control" placeholder="请输入号码" name="haoma" ></td>
                                    <td><input type="text" class="form-control" placeholder="请输入金额"  name="monny"  ></td>
                                    <td><button type="button" class="btn btn-default" title="删除"> 删除</button></td>
                                </tr>
                                </tbody>
                            </table>

                        </td>

                    </tr>
                    <tr>
                        <td>已付金额</td>
                       <td><input  class="form-control" name="shifu" id="shifu"  placeholder="" ></td>
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


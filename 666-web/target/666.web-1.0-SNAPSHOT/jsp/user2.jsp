
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!--     页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>用户管理</title>
    <!--  Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <link rel="stylesheet" href="AnglaJS/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="AnglaJS/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="AnglaJS/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="AnglaJS/css/style.css">
    <script src="AnglaJS/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="AnglaJS/plugins/bootstrap/js/bootstrap.min.js"></script>

    <link rel="stylesheet" href="AnglaJS/plugins/select2/select2.css" />
    <link rel="stylesheet" href="AnglaJS/plugins/select2/select2-bootstrap.css" />
    <script src="AnglaJS/plugins/select2/select2.min.js" type="text/javascript"></script>
    <script type="text/javascript" src="AnglaJS/plugins/angularjs/angular.min.js">  </script>
    <script src="AnglaJS/plugins/angularjs/pagination.js"></script>
    <link rel="stylesheet" href="AnglaJS/plugins/angularjs/pagination.css">
    <script type="text/javascript" src="AnglaJS/js/base_pagination.js">  </script>
 <script type="text/javascript" src="AnglaJS/js/service/userService.js">  </script><!-- 必须写到typeTemplateController.js前面,base_pagination.js的后面 -->

    <script type="text/javascript" src="AnglaJS/js/controller/baseController.js"></script>
    <script type="text/javascript" src="AnglaJS/js/controller/userController.js">  </script>

</head>

<body class="hold-transition skin-red sidebar-mini"
      ng-app="pinyougou"  ng-controller="userController" ng-init="findToday()"> <!-- !!!!!!!!!!!!!!!!!!!!!!!!!!!!记得要调用 -->


<div class="box-header with-border">
    <h3 class="box-title">用户管理</h3>
</div>

<div class="box-body">

    <!--数据表格 -->
    <div class="table-box">

        <!--        工具栏 -->
        <div class="pull-left">
            <div class="form-group form-inline">
                <div class="btn-group">
                    <button type="button" class="btn btn-default" title="新建" data-toggle="modal" data-target="#editModal"
                            ng-click="entity={customAttributeItems:[]}" ><i class="fa fa-file-o"></i> 新建下注</button>
                    <button type="button" class="btn btn-default" title="删除" ng-click="dele()">
                        <i class="fa fa-trash-o"></i> 删除</button>
               </div>
            </div>
        </div>
        <div class="box-tools pull-right">
            <div class="has-feedback">
                <button class="btn btn-default" >往期账单</button>
            </div>
            <div class="has-feedback">
                <button class="btn btn-default" >今日下注</button>
            </div>
            <div class="has-feedback">
                用户名称：<input ng-model="searchEntity.name" >
                <button class="btn btn-default" ng-click="reloadList()">查询</button>
            </div>
        </div>
        <!--      工具栏/ -->

        <!--    数据列表 -->
        <table id="dataList" class="table table-bordered table-striped table-hover dataTable">
            <thead>
            <tr>
                <th class="" style="padding-right:0px">
                    <input id="selall" type="checkbox" class="icheckbox_square-blue"  >
                </th>
                <th class="sorting">姓名</th>
                <th class="sorting">买码{"号码":"金额/元"}</th>
                <th class="sorting">应付/元</th>
                <th class="sorting">实付/元</th>
                <th class="sorting">结果/元</th>
                <th class="sorting">日期</th>
            </tr>
            </thead>
            <tbody>

            <tr ng-repeat="entity in list">
                <td><input  type="checkbox"  ng-click="updateSelection($event,entity.id)"></td>
                <td>{{entity.name}}</td>
                <td>{{jsonToString(entity.text,'text')}}</td>
                <td>{{entity.yingfu}}</td>
                <td>{{entity.shifu}}</td>
                <td>{{entity.result}}</td>
                <td>{{entity.date}}</td>
                <td class="text-center">
                    <button type="button" class="btn bg-olive btn-xs" data-toggle="modal" data-target="#editModal" ng-click="findOne(entity.id)" >修改</button>
                </td>
            </tr>
            </tbody>
        </table>
        <!--        数据列表/
                 分页 -->
        <tm-pagination conf="paginationConf"></tm-pagination>

    </div>
    <!--      数据表格 / -->




</div>
<!--   /.box-body -->

<!-- 编辑窗口-->
<div class="modal fade" id="editModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog" >
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h3 id="myModalLabel">商品类型模板编辑</h3>
            </div>
            <div class="modal-body">

                <table class="table table-bordered table-striped"  width="800px">
                    <tr>
                        <td>商品类型</td>
                        <td><input  class="form-control" placeholder="商品类型" ng-model="entity.name">  </td>
                    </tr>
                    <tr>
                        <td>关联品牌</td>
                        <td>
                            <input select2  select2-model="entity.brandIds"
                                   config="brandList" multiple placeholder="选择品牌（可多选）" class="form-control"
                                   type="text" ng-click="findBrandList()"/>
                        </td>
                    </tr>
                    <tr>
                        <td>关联规格</td>
                        <td>
                            <input select2  select2-model="entity.specIds"
                                   config="specList" multiple placeholder="选择规格（可多选）"
                                   class="form-control" type="text" ng-click="findSpecList()"/>
                        </td>
                    </tr>

                    <tr>
                        <td>扩展属性</td>
                        <td>
                            <div class="btn-group">
                                <button type="button" class="btn btn-default" title="新增扩展属性" ng-click="addTableRow()"><i class="fa fa-file-o"></i> 新增扩展属性</button>

                            </div>
                            <table class="table table-bordered table-striped"  width="800px">
                                <thead>
                                <tr>
                                    <td><input type="checkbox" class="icheckbox_square-blue"></td>
                                    <td>属性名称</td>
                                    <td>操作</td>
                                </tr>
                                </thead>
                                <tbody>
                                <tr ng-repeat="pojo in entity.customAttributeItems">
                                    <td><input type="checkbox" class="icheckbox_square-blue" ></td>
                                    <td><input class="form-control" placeholder="属性名称" ng-model="pojo.text"></td>   <!--  ng-model这里是点不是杠 -->
                                    <td><button type="button" class="btn btn-default" title="删除" ng-click="deleTableRow($index)"><i class="fa fa-trash-o"></i> 删除</button></td>
                                </tr>

                                </tbody>

                            </table>

                        </td>
                    </tr>

                </table>

            </div>
            <div class="modal-footer">
                <button class="btn btn-success" data-dismiss="modal" aria-hidden="true" ng-click="save()">保存</button>
                <button class="btn btn-default" data-dismiss="modal" aria-hidden="true">关闭</button>
            </div>
        </div>
    </div>
</div>

</body>

</html>

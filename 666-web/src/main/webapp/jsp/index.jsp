<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/8/15
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>小葱计算管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

    <link rel="stylesheet" href="../plugins/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">

    <script src="../plugins/jquery-2.2.3.min.js"></script>
  <%--  <script src="../plugins/jQueryUI/jquery-ui.min.js"></script>--%>
    <script src="../plugins/bootstrap.min.js"></script>

    <script src="../plugins/app.min.js"></script>


    <script type="text/javascript">
        function SetIFrameHeight(){
            var iframeid=document.getElementById("iframe"); //iframe id
            if (document.getElementById){
                iframeid.height =document.documentElement.clientHeight;
            }
        }

    </script>

</head>

<body class="hold-transition skin-green sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <header class="main-header">
        <!-- Logo -->
        <a href="index.jsp" class="logo">
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>小葱计算管理系统</b></span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <li class="dropdown messages-menu">

                    </li>
                    <!-- Notifications: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu">


                    </li>
                    <!-- Tasks: style can be found in dropdown.less -->
                    <li class="dropdown tasks-menu">

                    </li>
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">


                    </li>

                </ul>
            </div>
        </nav>
    </header>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p> 胡郭聪</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>

            <!-- /.search form -->


            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu"  >
                <li class="header">菜单</li>
                <li id="admin-index"><a href="index.jsp" ><i class="fa fa-dashboard"></i> <span>首页</span></a></li>
                <li id="admin-index"><a href="/xiao/findAll" target="iframe"><i class="fa fa-dashboard"></i> <span>生肖</span></a></li>
                <li id="admin-index"><a href="tema.jsp" target="iframe"><i class="fa fa-dashboard"></i> <span>特码</span></a></li>
                <li id="admin-index"><a href="ping.html" target="iframe"><i class="fa fa-dashboard"></i> <span>平码</span></a></li>
                <li id="admin-index"><a href="yonghu.html" target="iframe"><i class="fa fa-dashboard"></i> <span>用户</span></a></li>
                <li id="admin-index"><a href="shubiao.html" target="iframe"><i class="fa fa-dashboard"></i> <span>汇表</span></a></li>





            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">
        <iframe width="100%" id="iframe" name="iframe"	onload="SetIFrameHeight()"
                frameborder="0" src="home.jsp"></iframe>


    </div>



</div>

</body>

</html>

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-19 02:53:30 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xiao_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html >\r\n");
      out.write("<head>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=\"utf-8\" >\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <title>管理</title>\r\n");
      out.write("    <meta content=\"width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no\" name=\"viewport\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/AdminLTE.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../plugins/_all-skins.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/style.css\">\r\n");
      out.write("    <script src=\"../plugins/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("    <script src=\"../plugins/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"../plugins/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/xiao.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        function post(id){\r\n");
      out.write("            $.post(\"/xiao/findOne\",{id:id},function(data){\r\n");
      out.write("                if (data==null){\r\n");
      out.write("                    alert(\"失败\");\r\n");
      out.write("                }else {\r\n");
      out.write("                    //alert(JSON.stringify(data));\r\n");
      out.write("                    $(\"#id\").val(data.id);\r\n");
      out.write("                    //$(\"#xiaoId\").text(data.number);\r\n");
      out.write("                    $(\"#xiaoId\").val(data.number);\r\n");
      out.write("                    $(\"#xiaoX\").val(data.name);\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function save(){\r\n");
      out.write("           // const formData = $('#update-xiao').serialize();\r\n");
      out.write("         //   var formData = $('#update-xiao').serializeArray();\r\n");
      out.write("            var formObject = {};\r\n");
      out.write("            var formArray =$(\"#update-xiao\").serializeArray();\r\n");
      out.write("            $.each(formArray,function(i,item){\r\n");
      out.write("                formObject[item.name] = item.value;\r\n");
      out.write("            });\r\n");
      out.write("         //   formData = decodeURIComponent(formData,true);\r\n");
      out.write("          //  alert( JSON.stringify(formObject));\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type: \"POST\",   //提交的方法\r\n");
      out.write("                url: \"/xiao/save\", //提交的地址\r\n");
      out.write("                data: JSON.stringify(formObject),// 序列化表单值\r\n");
      out.write("             //   dataType: \"text\",     //SpringMVC利用注解@ResponseBody返回String时，浏览器显示200状态码，并且响应头为json格式，\r\n");
      out.write("                                       // 格式ajax不认为它是json，所以一直执行错误方法后来把dataType=“json”去掉就OK了！\r\n");
      out.write("                contentType: 'application/json',\r\n");
      out.write("                success:function(Result){\r\n");
      out.write("                  alert(Result.message);\r\n");
      out.write("                  window.location.reload();\r\n");
      out.write("                },\r\n");
      out.write("                error:function(result){\r\n");
      out.write("                    alert(\"error\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"hold-transition skin-red sidebar-mini\" >\r\n");
      out.write("<!-- .box-body -->\r\n");
      out.write("<div class=\"box-header with-border\">\r\n");
      out.write("    <h3 class=\"box-title\">管理</h3>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"box-body\">\r\n");
      out.write("\r\n");
      out.write("    <!-- 数据表格 -->\r\n");
      out.write("    <div class=\"table-box\">\r\n");
      out.write("\r\n");
      out.write("        <!--工具栏-->\r\n");
      out.write("        <div class=\"pull-left\">\r\n");
      out.write("            <div class=\"form-group form-inline\">\r\n");
      out.write("                <div class=\"btn-group\">\r\n");
      out.write("                    <a href=\"/xiao/qian\" type=\"button\" class=\"btn btn-default\" title=\"前移\" >前移</a>\r\n");
      out.write("                    <a href=\"/xiao/hou\" type=\"button\" class=\"btn btn-default\" title=\"后移\" >后移</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"box-tools pull-right\">\r\n");
      out.write("            <div class=\"has-feedback\">\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!--工具栏/-->\r\n");
      out.write("\r\n");
      out.write("        <!--数据列表-->\r\n");
      out.write("        <table id=\"dataList\" class=\"table table-bordered table-striped table-hover dataTable\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr>\r\n");
      out.write("                <th class=\"\" style=\"padding-right:0px\">\r\n");
      out.write("                    <input id=\"selall\" type=\"checkbox\" class=\"icheckbox_square-blue\">\r\n");
      out.write("                </th>\r\n");
      out.write("\r\n");
      out.write("                <th class=\"sorting\">号码</th>\r\n");
      out.write("                <th class=\"sorting\">生肖</th>\r\n");
      out.write("\r\n");
      out.write("                <th class=\"text-center\">操作</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("        </table>\r\n");
      out.write("        <!--数据列表/-->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- 数据表格 /-->\r\n");
      out.write("\r\n");
      out.write("    <!-- 编辑窗口 -->\r\n");
      out.write("    <div class=\"modal fade\" id=\"editModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\" >\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\r\n");
      out.write("                    <h3 id=\"myModalLabel\">编辑</h3>\r\n");
      out.write("                </div>\r\n");
      out.write("                <form id=\"update-xiao\" >\r\n");
      out.write("                <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                    <table class=\"table table-bordered table-striped\"  width=\"800px\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td> <input id=\"id\" name=\"id\"  type=\"hidden\"></td>\r\n");
      out.write("                            <td><input type=\"text\" class=\"form-control\" id=\"xiaoId\"  name=\"number\" ></input></td>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <select class=\"form-control\" name=\"name\" id =\"xiaoX\" >\r\n");
      out.write("                                    <option value=\"\" >-请选择 -\r\n");
      out.write("                                    <option value=\"猪\" >猪\r\n");
      out.write("                                    <option value=\"狗\" >狗\r\n");
      out.write("                                    <option value=\"鸡\" >鸡\r\n");
      out.write("                                    <option value=\"猴\" >猴\r\n");
      out.write("                                    <option value=\"牛\" >牛\r\n");
      out.write("                                    <option value=\"羊\" >羊\r\n");
      out.write("                                    <option value=\"马\" >马\r\n");
      out.write("                                    <option value=\"蛇\" >蛇\r\n");
      out.write("                                    <option value=\"龙\" >龙\r\n");
      out.write("                                    <option value=\"兔\" >兔\r\n");
      out.write("                                    <option value=\"虎\" >虎\r\n");
      out.write("                                    <option value=\"鼠\" >鼠\r\n");
      out.write("                                </select>\r\n");
      out.write("\r\n");
      out.write("                            </td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button class=\"btn btn-success\" data-dismiss=\"modal\" aria-hidden=\"true\" onclick=\"save()\">保存</button>\r\n");
      out.write("                    <button class=\"btn btn-default\" data-dismiss=\"modal\" aria-hidden=\"true\">关闭</button>\r\n");
      out.write("                </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /jsp/xiao.jsp(118,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/jsp/xiao.jsp(118,12) '${xiao}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${xiao}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /jsp/xiao.jsp(118,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("stu");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("            <tr>\r\n");
          out.write("                <td><input  type=\"checkbox\" ></td>\r\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu.number}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("                <td >");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("                <td class=\"text-center\">\r\n");
          out.write("                    <button class=\"btn bg-olive btn-xs\" data-toggle=\"modal\" data-target=\"#editModal\" onclick=\"post('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stu.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("')\" >修改</button>\r\n");
          out.write("\r\n");
          out.write("                </td>\r\n");
          out.write("            </tr>\r\n");
          out.write("            ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}

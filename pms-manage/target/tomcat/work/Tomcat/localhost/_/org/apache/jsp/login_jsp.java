/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-05 07:25:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no\">\r\n");
      out.write("<meta name=\"format-detection\" content=\"telephone=no\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>停车管理系统_用户登录</title>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"./static/css/common/normalize_dd5983a.css~v=1.2.0.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"./static/css/common/public_2347803.css~v=1.2.0.css\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"./static/css/web/account/login_704b305.css~v=1.2.0.css\" />\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"./static/js/common/jquery-1.11.3.min_6163309.js~v=1.2.0\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"./static/js/common/jquery.cookie_a5283b2.js~v=1.2.0\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"static/js/common/common.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("function login(){\r\n");
      out.write("\t\r\n");
      out.write("\tvar e=$(\"#j-tel\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tvar s=$(\"#j-pwd\").val();\r\n");
      out.write("\t\r\n");
      out.write("\t var data = \"{'tel':\"+e+\",'password':'\"+s+\"'}\";\r\n");
      out.write("\t var url = URL+\"index_user.jsp\";\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\t url: URL+\"user/login\",\r\n");
      out.write("\t\t type: \"POST\",\r\n");
      out.write("\t\t data:'data='+data,\r\n");
      out.write("\t\t success: function(data){\r\n");
      out.write("\t\t\t if(data.code==200){\r\n");
      out.write("\t\t\t\t $.cookie('carId', data.carId);\r\n");
      out.write("\t\t\t\t $.cookie('id', data.id);\r\n");
      out.write("\t\t\t\t $.cookie('username', data.username);\r\n");
      out.write("\t\t\t\t window.location.href=url;\r\n");
      out.write("\t\t\t }else{\r\n");
      out.write("\t\t\t\t $(\".login_fall\").show();\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t },\r\n");
      out.write("\t\t dataType: \"json\"\r\n");
      out.write("\t\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"login_layer login_supernatant\">\r\n");
      out.write("\t\t<span class=\"vertical_middle\"></span>\r\n");
      out.write("\t\t<div class=\"login_box clearfix\" id=\"login_box\">\r\n");
      out.write("\t\t\t<div class=\"login_title\">\r\n");
      out.write("\t\t\t\t<div class=\"login_logo\">\r\n");
      out.write("\t\t\t\t\t<img src=\"img/logo1.jpg\" alt=\"考虫\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<span>用户登录</span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"login_tel\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" value=\"\" id=\"j-tel\"\r\n");
      out.write("\t\t\t\t\tclass=\"account_number account_input\" placeholder=\"手机号\"\r\n");
      out.write("\t\t\t\t\tautocomplete=\"off\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"login_pwd\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" value=\"\" id=\"j-pwd\"\r\n");
      out.write("\t\t\t\t\tclass=\"account_password account_input\" placeholder=\"密码\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<a href=\"javascript:;\" id=\"j-login-btn\" class=\"login_btn\" onclick=\"login()\">登录</a>\r\n");
      out.write("\t\t\t<div class=\"login_hint clearfix\">\r\n");
      out.write("\t\t\t\t<!-- <a href=\"forget.html~forget.html\" class=\"forget_pwd float_left\">忘记密码？</a> -->\r\n");
      out.write("\t\t\t\t<a href=\"register.jsp\" class=\"skip_register float_right\">注册账号></a>\r\n");
      out.write("\t\t\t\t<a href=\"forgotPWD.jsp\" class=\"skip_register float_left\">忘记密码?</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"j-login-fall\" class=\"login_fall\">密码错误</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-04-05 03:30:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("    <title>Home</title>\r\n");
      out.write("    <!-- Bootstrap Styles-->\r\n");
      out.write("    <link href=\"assets/css/bootstrap.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- FontAwesome Styles-->\r\n");
      out.write("    <link href=\"assets/css/font-awesome.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Morris Chart Styles-->\r\n");
      out.write("    <link href=\"assets/js/morris/morris-0.4.3.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Custom Styles-->\r\n");
      out.write("    <link href=\"assets/css/custom-styles.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!-- Google Fonts-->\r\n");
      out.write("    <link href='http://fonts.useso.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> \r\n");
      out.write("     \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"wrapper\">\r\n");
      out.write("        <nav class=\"navbar navbar-default top-navbar\" role=\"navigation\">\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".sidebar-collapse\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\"><i class=\"fa fa-gear\"></i> <strong>HYBRID</strong></a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"nav navbar-top-links navbar-right\">\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa fa-envelope fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-messages\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>John Doe</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Today</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem Ipsum has been the industry's standard dummy text ever since the 1500s...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem Ipsum has been the industry's standard dummy text ever since an kwilnw...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <strong>John Smith</strong>\r\n");
      out.write("                                    <span class=\"pull-right text-muted\">\r\n");
      out.write("                                        <em>Yesterday</em>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div>Lorem Ipsum has been the industry's standard dummy text ever since the...</div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>Read All Messages</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-messages -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa fa-tasks fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-tasks\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 1</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">60% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-success\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\r\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (success)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 2</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">28% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-info\" role=\"progressbar\" aria-valuenow=\"28\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 28%\">\r\n");
      out.write("                                            <span class=\"sr-only\">28% Complete</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 3</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">60% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\r\n");
      out.write("                                            <span class=\"sr-only\">60% Complete (warning)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <p>\r\n");
      out.write("                                        <strong>Task 4</strong>\r\n");
      out.write("                                        <span class=\"pull-right text-muted\">85% Complete</span>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                    <div class=\"progress progress-striped active\">\r\n");
      out.write("                                        <div class=\"progress-bar progress-bar-danger\" role=\"progressbar\" aria-valuenow=\"85\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 85%\">\r\n");
      out.write("                                            <span class=\"sr-only\">85% Complete (danger)</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>See All Tasks</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-tasks -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa fa-bell fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-alerts\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-comment fa-fw\"></i> New Comment\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 min</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-twitter fa-fw\"></i> 3 New Followers\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">12 min</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-envelope fa-fw\"></i> Message Sent\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 min</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-tasks fa-fw\"></i> New Task\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 min</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <i class=\"fa fa-upload fa-fw\"></i> Server Rebooted\r\n");
      out.write("                                    <span class=\"pull-right text-muted small\">4 min</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a class=\"text-center\" href=\"#\">\r\n");
      out.write("                                <strong>See All Alerts</strong>\r\n");
      out.write("                                <i class=\"fa fa-angle-right\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-alerts -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\" aria-expanded=\"false\">\r\n");
      out.write("                        <i class=\"fa fa-user fa-fw\"></i> <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu dropdown-user\">\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-user fa-fw\"></i> User Profile</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-gear fa-fw\"></i> Settings</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-sign-out fa-fw\"></i> Logout</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                    <!-- /.dropdown-user -->\r\n");
      out.write("                </li>\r\n");
      out.write("                <!-- /.dropdown -->\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!--/. NAV TOP  -->\r\n");
      out.write("        <nav class=\"navbar-default navbar-side\" role=\"navigation\">\r\n");
      out.write("\t\t<div id=\"sideNav\" href=\"\"><i class=\"fa fa-caret-right\"></i></div>\r\n");
      out.write("            <div class=\"sidebar-collapse\">\r\n");
      out.write("                <ul class=\"nav\" id=\"main-menu\">\r\n");
      out.write("\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"active-menu\" href=\"index.jsp\"><i class=\"fa fa-dashboard\"></i> 首页</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    \r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"table1.jsp\"><i class=\"fa fa-table\"></i> 停车场使用情况</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"form.jsp\"><i class=\"fa fa-edit\"></i> Forms </a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </nav>\r\n");
      out.write("        <!-- /. NAV SIDE  -->\r\n");
      out.write("        <div id=\"page-wrapper\">\r\n");
      out.write("            <div id=\"page-inner\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <h1 class=\"page-header\">\r\n");
      out.write("                            停车场管理系统 <small>Parking management system</small>\r\n");
      out.write("                        </h1>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /. PAGE INNER  -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /. PAGE WRAPPER  -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- /. WRAPPER  -->\r\n");
      out.write("    <!-- JS Scripts-->\r\n");
      out.write("    <!-- jQuery Js -->\r\n");
      out.write("    <script src=\"assets/js/jquery-1.10.2.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Js -->\r\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\"></script>\r\n");
      out.write("\t \r\n");
      out.write("    <!-- Metis Menu Js -->\r\n");
      out.write("    <script src=\"assets/js/jquery.metisMenu.js\"></script>\r\n");
      out.write("    <!-- Morris Chart Js -->\r\n");
      out.write("    <script src=\"assets/js/morris/raphael-2.1.0.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/js/morris/morris.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t<script src=\"assets/js/easypiechart.js\"></script>\r\n");
      out.write("\t<script src=\"assets/js/easypiechart-data.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t <script src=\"assets/js/Lightweight-Chart/jquery.chart.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("    <!-- Custom Js -->\r\n");
      out.write("    <script src=\"assets/js/custom-scripts.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

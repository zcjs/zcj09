package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>登录页面</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap.css \" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/css/bootstrap-responsive.css \" rel=\"stylesheet\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/bootstrap/js/jquery-1.4.3.js\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tbody\r\n");
      out.write("\t{\r\n");
      out.write("\t\tpadding-top: 200px;\r\n");
      out.write("\t\tpadding-bottom: 40px;\r\n");
      out.write("\t\tbackground-image: url(\"./images/cg.jpg\");\r\n");
      out.write("\t\tbackground-position: center;\r\n");
      out.write("\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-signin-heading\r\n");
      out.write("\t{\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t}\r\n");
      out.write("\t.input-block-level{\r\n");
      out.write("\t\twidth: 240px;\r\n");
      out.write("\t\theight: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t.me\r\n");
      out.write("\t{\r\n");
      out.write("\t\tmargin-top:-150px;\r\n");
      out.write("\t\tmargin-left:200px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.container\r\n");
      out.write("\t{\r\n");
      out.write("\t\tmargin-top: 200px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"me\">\r\n");
      out.write("<h1>10914 朱春杰</h1>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t\t<form action=\"login\" class=\"form-signin-heading\" >\r\n");
      out.write("\t\t<h1>电影租赁管理系统</h1>\r\n");
      out.write("\t\t<input type=\"text\" name=\"uname\" id=\"uname\" class=\"input-block-level\" placeholder=\"请输入用户名...\"><br/>\r\n");
      out.write("\t\t<input type=\"password\" name=\"pwd\" id=\"pwd\" class=\"input-block-level\" placeholder=\"请输入密码...\"><br/>\r\n");
      out.write("\t\t<br/>\r\n");
      out.write("\t\t<button class=\"btn btn-large btn-primary\" type=\"submit\">登录</button>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

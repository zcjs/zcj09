package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class all_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>显示全部</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"bootstrap/js/jquery-1.4.3.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("\t\t$.post(\"all2.do\",function(data){\r\n");
      out.write("\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\tfor(var i = 0;i<data.length;i++){\r\n");
      out.write("\t\t\t\thtml+=\"<tr><td>\"+data[i].first_name+\"</td><td>\"+data[i].last_name+\"</td><td>\"+data[i].address_id+\"</td><td>\"+data[i].email+\"</td><td>\"+data[i].customer_id+\"</td><td>\"+data[i].last_update+\"</td></tr>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$(\"#content\").html(html);\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<body>\r\n");
      out.write("<a href=\"add.jsp\" style=\"text-decoration: none\">增加用户</a>\r\n");
      out.write("   <center><input type=\"button\" id=\"btn\" value=\"查询\"/></center>\r\n");
      out.write("\t<table align=\"center\" width=\"500\" border=\"1\" height=\"180\"\r\n");
      out.write("\t\tbordercolor=\"white\"  cellpadding=\"1\" cellspacing=\"1\">\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td>first_name</td>\r\n");
      out.write("\t\t\t<td>last_name</td>\r\n");
      out.write("\t\t\t<td>address_id</td>\r\n");
      out.write("\t\t\t<td>email</td>\r\n");
      out.write("\t\t\t<td>customer_id</td>\r\n");
      out.write("\t\t\t<td>last_update</td>\r\n");
      out.write("\t\t\t<td>操作</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tbody id=\"content\"></tbody>\r\n");
      out.write("\r\n");
      out.write("\t</table>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\r\n");
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

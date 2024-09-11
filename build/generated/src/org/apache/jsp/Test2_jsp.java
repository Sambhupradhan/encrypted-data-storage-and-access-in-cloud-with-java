package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;
import com.sun.org.apache.bcel.internal.generic.Select;
import java.sql.*;
import java.util.ArrayList;
import com.commondb.Common_DB;

public final class Test2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>    \n");
      out.write("        <center>\n");
      out.write("        <form name=\"form1\" method=\"post\" action=\"DownloadotherServlet\">\n");
      out.write("            <table width=\"250\" border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\">Download Other Group Files</div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table width=\"250\" border=\"0\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <div align=\"center\">Select your Files Below a Groups</div>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>  \n");
      out.write("            <div align=\"left\">\n");
      out.write("             ");

            String user=session.getAttribute("username").toString();
            
      out.write("            \n");
      out.write("            <h1>Welcome,");
      out.print(user);
      out.write("</h1>\n");
      out.write("            </div>\n");
      out.write("            <table width=\"250\" border=\"0\">\n");
      out.write("                    <td><div align=\"center\">Group Name: </div></td>\n");
      out.write("                    <td>\n");
      out.write("                        <label for=\"groupname\"></label>\n");
      out.write("                        <select name=\"Requestgroups\">\n");
      out.write("                            ");

                            ArrayList li1=new ArrayList();
                            ResultSet rr1=Common_DB.ViewTable("mona", "groupname");
                            while(rr1.next())
                            {
                                String n=rr1.getString(1);
                                li1.add(n);
                            }
                            if(!(li1.isEmpty()))
                                for(int ij=0; ij<li1.size(); ij++)
                                {
                             
      out.write("\n");
      out.write("                             <option value=\"");
      out.print(li1.get(ij));
      out.write("\"> ");
      out.print(li1.get(ij));
      out.write(" </option>                         \n");
      out.write("                             ");
       
                                }
                            else
                            {                                                            
                            
      out.write("\n");
      out.write("                            <option value=\"\"></option>\n");
      out.write("                            ");

                            }
                            
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table> \n");
      out.write("        <div id=\"wrap\">\n");
      out.write("        <ul id=\"accordion\">\n");
      out.write("            \n");
      out.write("             ");
               
             String group=session.getAttribute("group").toString();
           ArrayList li=new ArrayList();
            ResultSet rr=Common_DB.ViewTable("mona","groupname");
          
         while(rr.next())            
         {
          String n=rr.getString(1);              
             li.add(n);   
         }           
             
            if(!(li.isEmpty())) {       
        for(int ij=0; ij<li.size(); ij++)                   
                     {
           
      out.write("           \n");
      out.write("                      \n");
      out.write("       \n");
      out.write("\t\t<li>\n");
      out.write("\t\t\t<h2>");
      out.print(li.get(ij));
      out.write("</h2>\n");
      out.write("                        \n");
      out.write("\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t");
           
                             File file[] = new File("D:/"+li.get(ij)).listFiles();                                  
          for(int i=0;i<file.length;i++) {			 

      out.write("\n");
      out.write("                 ");
      out.print(file[i].getName());
      out.write("\n");
      out.write("               <input type=\"radio\" name=\"filenames\" value=\"");
      out.print(file[i].getName());
      out.write("\">\n");
      out.write("              ");
 }
                   }
            }                            
          

      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</li>           \n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("</div><!-- wrap -->\n");
      out.write("<table width=\"250\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <div align=\"center\">Enter a Key:\n");
      out.write("            <label for=\"Enter a Key\"></label>\n");
      out.write("            <input type=\"text\" name=\"keyvalidation\" id=\"keyvalidation\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("<table width=\"250\" border=\"0\">\n");
      out.write("    <tr>\n");
      out.write("        <td>\n");
      out.write("            <div align=\"center\">\n");
      out.write("            <input type=\"submit\" name=\"submit\" id=\"submit\" value=\"submit\">\n");
      out.write("            </div>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("    </body>\n");
      out.write("    <style>\n");
      out.write("       #wrap{\n");
      out.write("\t\t\tmargin: 100px auto;\n");
      out.write("\t\t\twidth: 700px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#accordion{\n");
      out.write("\t\t\twidth: 700px;\n");
      out.write("\t\t\tmargin: 0px;\n");
      out.write("\t\t\tpadding: 0px;\n");
      out.write("\t\t\tlist-style: none;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t#accordion h2{\n");
      out.write("\t\t\tfont-size: 12pt;\n");
      out.write("\t\t\tmargin: 0px;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tbackground: #ccc;\n");
      out.write("\t\t\tborder-bottom: 1px solid #fff;\n");
      out.write("\t\t}\n");
      out.write("\t\t#accordion li div.content{\n");
      out.write("\t\t\tdisplay: none;\n");
      out.write("\t\t\tpadding: 10px;\n");
      out.write("\t\t\tbackground: #f9f9f9;\n");
      out.write("\t\t\tborder: 1px solid #ddd;\n");
      out.write("\t\t}\n");
      out.write("\n");
      out.write("\t\t#accordion li:hover div.content{\n");
      out.write("\t\t\tdisplay: inherit;\n");
      out.write("\t\t}\n");
      out.write("    </style>    \n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

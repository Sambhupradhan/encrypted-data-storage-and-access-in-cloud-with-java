package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.ArrayList;

public final class Test5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <!-- The first select list -->\n");
      out.write("Select RequestGroup:\n");
      out.write("<select name=\"slist1\" onchange=\"SList.getSelect('slist2', this.value);\">\n");
      out.write(" <option>- - -</option>\n");
      out.write("   \n");
      out.write(" ");
 
          String UserName=session.getAttribute("username").toString();
          String group=session.getAttribute("group").toString(); 
          Connection con2=null;
          Statement st2=null;
          ResultSet rs2=null;
          try
          {
          Class.forName("com.mysql.jdbc.Driver");
          con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/mona","root","password");
          st2=con2.createStatement();
          rs2=st2.executeQuery("Select Requestgroup from othergroup where UserName='"+UserName+"' and groupname='"+group+"'");
          while(rs2.next())
               {
           
            
      out.write("    \n");
      out.write("            <option value=\"");
      out.print(rs2.getString("Requestgroup"));
      out.write('"');
      out.write('>');
      out.print(rs2.getString("Requestgroup"));
      out.write("</option>\n");
      out.write("                                         \n");
      out.write("          ");
 }                                        
             
          }
           catch(Exception  ex)
             {
               System.out.println(ex.getMessage());
             }

      out.write("  \n");
      out.write("</select>\n");
      out.write("<!-- Tags for the seccond dropdown list, and for text-content -->\n");
      out.write("<span id=\"slist2\"></span> <div id=\"scontent\"></div>\n");
      out.write("\n");
      out.write("<script><!--\n");
      out.write("/* Script Double Select Dropdown List, from: coursesweb.net/javascript/ */\n");
      out.write("\n");
      out.write("\n");
      out.write("var SList = new Object();             // JS object that stores data for options\n");
      out.write("\n");
      out.write("// HERE replace the value with the text you want to be displayed near Select\n");
      out.write("var txtsl2 = 'Select FileName:';\n");
      out.write("\n");
      out.write("/*\n");
      out.write(" Property with options for the Seccond select list\n");
      out.write(" The key in this object must be the same with the values of the options added in the first select\n");
      out.write(" The values in the array associated to each key represent options of the seccond select\n");
      out.write("*/\n");
      out.write(" \n");
  	
          String UserName1=session.getAttribute("username").toString();
          String group1=session.getAttribute("group").toString(); 
          Connection con=null;
          Statement st=null;
          ResultSet rs=null;
          try
          {
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mona","root","password");
          st=con.createStatement();
          rs=st.executeQuery("Select Requestgroup,filename from othergroup where UserName='"+UserName1+"' and groupname='"+group1+"'");
          int p=0;
          String sss=",";
          while(rs.next())
               {
           System.out.println("Select List///"+rs.getString("Requestgroup")+"..."+rs.getString("filename"));
            
                
             
    if(p==0){
        
      out.write("                         \n");
      out.write("            \n");
      out.write("SList.slist2 = {\n");
      out.write(" \"");
      out.print(rs.getString("Requestgroup"));
      out.write("\": [");
 p=1;}if(rs.isLast()){
      out.write('\'');
      out.print(rs.getString("filename"));
      out.write('\'');
 }else{
      out.write('\'');
      out.print(rs.getString("filename"));
      out.write('\'');
      out.write(',');
}}
      out.write("]\n");
      out.write(" \n");
      out.write(" //\"coursesweb\": ['php-mysql', 'javascript', 'flash-as3']\n");
      out.write("};\n");
      out.write("\n");
      out.write("      ");
  
                      
            }
           catch(Exception  ex)
             {
               System.out.println(ex.getMessage());
             }
            
      out.write("              \n");
      out.write(" \n");
      out.write("/*\n");
      out.write(" Property with text-content associated with the options of the 2nd select list\n");
      out.write(" The key in this object must be the same with the values (options) added in each Array in \"slist2\" above\n");
      out.write(" The values of each key represent the content displayed after the user selects an option in 2nd dropdown list\n");
      out.write("*/\n");
      out.write("SList.scontent = {\n");
      out.write(" \"ajax\": 'www.marplo.net/ajax/',\n");
      out.write(" \"games\": 'www.marplo.net/jocuri/',\n");
      out.write(" \"anime\": 'www.marplo.net/anime/',\n");
      out.write(" \"php-mysql\": 'coursesweb.net/php-mysql/',\n");
      out.write(" \"javascript\": 'coursesweb.net/javascript/',\n");
      out.write(" \"flash-as3\": 'coursesweb.net/flash/'\n");
      out.write("};\n");
      out.write("\n");
      out.write("    /* From here no need to modify */\n");
      out.write("\n");
      out.write("// function to get the dropdown list, or content\n");
      out.write("SList.getSelect = function(slist, option) {\n");
      out.write(" // document.getElementById('scontent').innerHTML = '';           // empty option-content\n");
      out.write("\n");
      out.write("  if(SList[slist][option]) {\n");
      out.write("    // if option from the last Select, add text-content, else, set dropdown list\n");
      out.write("    if(slist == 'scontent') document.getElementById('scontent').innerHTML = SList[slist][option];\n");
      out.write("    else if(slist == 'slist2') {\n");
      out.write("      var addata = '<option>- - -</option>';\n");
      out.write("      for(var i=0; i<SList[slist][option].length; i++) {\n");
      out.write("        addata += '<option value=\"'+SList[slist][option][i]+'\">'+SList[slist][option][i]+'</option>';\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      document.getElementById('slist2').innerHTML = txtsl2+' <select name=\"slist2\" onchange=\"SList.getSelect(\\'scontent\\', this.value);\">'+addata+'</select>';\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  else if(slist == 'slist2') {\n");
      out.write("    // empty the tag for 2nd select list\n");
      out.write("    document.getElementById('slist2').innerHTML = '';\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("--></script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    </body>\n");
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

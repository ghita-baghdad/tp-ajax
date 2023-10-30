package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.beans.Machine;
import ma.school.service.MachineService;
import ma.school.beans.Marque;
import ma.school.service.MarqueService;

public final class machineByReferenceForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/menu.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("        <script src=\"script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("           <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\" style=\"height:110px;width: 100%;\"> \n");
      out.write("    <img id=\"logo\" src=\"images/Logo_Ensaj.png\" alt=\"fond\"  style=\"width: 250px; height: 100px; float: left;\"/>  \n");
      out.write("    <img id=\"logo\" src=\"images/Capture.PNG\" alt=\"fond\" style=\"width: 250px; height: 100px; float: right;\"/>     \n");
      out.write("   <span id=\"horloge\" style=\"font-family: Courier New; text-align: center; width: 100%; color: black; position: absolute; top: 50px; justify-content: center;\"></span>\n");
      out.write("</div>\n");
      out.write("<script src=\"script/horloge.js\" type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Menu</title>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("        <div class=\"navbar\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a class=\"active\" href=\"chart.jsp\">Dashbord</a></li>\n");
      out.write("                <li><a href=\"etudiantForm.jsp\">Gestion des etudiants</a></li>\n");
      out.write("                <li><a href=\"marqueForm.jsp\">Gestion des marques</a></li>\n");
      out.write("                <li><a href=\"machineForm.jsp\">Gestion des machines</a></li>\n");
      out.write("                <li><a href=\"machineByMarqueForm.jsp\">Machines par marque</a></li>\n");
      out.write("                <li><a href=\"machineByReferenceForm.jsp\">Machines par reference</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <form method=\"GET\" action=\"MachineByReferenceController\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Select Machine Reference</legend>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Reference</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"reference\" name=\"reference\">\n");
      out.write("                                    <option value=\"0\">Choose a reference</option>\n");
      out.write("                                    ");

                                        MachineService mms = new MachineService();
                                        for (Machine m : mms.findAll()) {
                                    
      out.write("\n");
      out.write("                                    <option value=\"");
      out.print(m.getReference());
      out.write('"');
      out.write('>');
      out.print(m.getReference());
      out.write("</option>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("\n");
      out.write("                    $(\"#reference\").change(function () {\n");
      out.write("                        $.ajax({\n");
      out.write("                            url: 'MachineByReferenceController',\n");
      out.write("                            data: {ref: $(this).val()},\n");
      out.write("                            type: 'POST',\n");
      out.write("                            success: function (data) {\n");
      out.write("                                var ligne = \"\";\n");
      out.write("                                for (var i = 0; i < data.length; i++) {\n");
      out.write("                                    ligne += '<tr>'\n");
      out.write("                                            + '<td>' + data[i].id + '</td>'\n");
      out.write("                                            + '<td>' + data[i].reference + '</td>'\n");
      out.write("                                            + '<td>' + data[i].prix + '</td>'\n");
      out.write("                                            + '<td>' + data[i].dateAchat + '</td>'\n");
      out.write("                                            + '<td>' + data[i].marque.libelle + '</td>'\n");
      out.write("                                            + '<td><a class=\"bndelete\" href=\"MachineController?op=delete&id=' + data[i].id + '\">Supprimer</a></td>'\n");
      out.write("                                            + '<td><a class=\"bnupdate\" href=\"\">Modifier</a></td>'\n");
      out.write("                                            + '</tr>';\n");
      out.write("                                }\n");
      out.write("                                $(\"#body\").html(ligne);\n");
      out.write("                            },\n");
      out.write("                            error: function (jqXHR, textStatus, errorThrown) {\n");
      out.write("                                console.log(textStatus);\n");
      out.write("                            }\n");
      out.write("                        });\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>List of Machines</legend>\n");
      out.write("                <table border=\"1\" class=\"tab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Reference</th>\n");
      out.write("                            <th>Prix</th>\n");
      out.write("                            <th>Marque</th>\n");
      out.write("                            <th>Date d'achat</th>\n");
      out.write("                            <th>Supprimer</th>\n");
      out.write("                            <th>Modifier</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody id='body'>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </fieldset>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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

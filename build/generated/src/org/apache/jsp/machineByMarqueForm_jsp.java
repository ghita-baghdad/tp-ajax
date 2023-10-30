package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import ma.school.beans.Machine;
import ma.school.service.MachineService;
import ma.school.beans.Marque;
import ma.school.service.MarqueService;
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.service.EtudiantService;

public final class machineByMarqueForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("           <script src=\"script/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"script/jsonExemple.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"script/chart.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("             <div class=\"content\">\n");
      out.write("         <form method=\"post\" action=\"\">\n");
      out.write("             \n");
      out.write("          \n");
      out.write("             \n");
      out.write("                <fieldset>\n");
      out.write("             \n");
      out.write("            <label for=\"marqueId\">Sélectionnez la marque</label>\n");
      out.write("\n");
      out.write("            <select name=\"marqueId\">\n");
      out.write("                ");

                   MarqueService ms = new MarqueService();
                    for (Marque m : ms.findAll()) {
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <option name =\"marqueId\" value=\"");
      out.print(m.getId());
      out.write('"');
      out.write('>');
      out.print(m.getLibelle());
      out.write(" </option>\n");
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <p style=\"text-align: center;\"><input type=\"submit\" class=\"btn btn-dark btn-outline-secondary\" value=\"Afficher les machines\" name=\"valider\" /></p>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        ");

            String marque = request.getParameter("marqueId");

            int marqueId = 0;

            if (marque != null && !marque.isEmpty()) {
                try {
                    marqueId = Integer.parseInt(marque);

                } catch (NumberFormatException e) {

                }

            }

            MarqueService mms = new MarqueService();
            Marque mar = mms.findById(marqueId);
            List<Machine> tous_machine = ms.findByMarque(mar);
        
      out.write("\n");
      out.write(" \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    var canvas = document.getElementById('graphiqueMachines');\n");
      out.write("    var ctx = canvas.getContext('2d');\n");
      out.write("\n");
      out.write("    var labels = []; // Noms des marques\n");
      out.write("    var data = [];   // Nombre de machines par marque\n");
      out.write("\n");
      out.write("    // Remplissez les données en parcourant la liste de machines\n");
      out.write("    ");

    for (Machine m : tous_machine) {
    
      out.write("\n");
      out.write("        labels.push('");
      out.print( m.getMarque().getLibelle());
      out.write("');\n");
      out.write("        data.push(");
      out.print( m.getMarque().getMachines().size());
      out.write(");\n");
      out.write("    ");

    }
    
      out.write("\n");
      out.write("\n");
      out.write("    var myChart = new Chart(ctx, {\n");
      out.write("        type: 'bar',\n");
      out.write("        data: {\n");
      out.write("            labels: labels,\n");
      out.write("            datasets: [{\n");
      out.write("                label: 'Nombre de Machines par Marque',\n");
      out.write("                data: data,\n");
      out.write("                backgroundColor: 'rgba(75, 192, 192, 0.2)',\n");
      out.write("                borderColor: 'rgba(75, 192, 192, 1)',\n");
      out.write("                borderWidth: 1\n");
      out.write("            }]\n");
      out.write("        },\n");
      out.write("        options: {\n");
      out.write("            scales: {\n");
      out.write("                y: {\n");
      out.write("                    beginAtZero: true\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("  <fieldset>\n");
      out.write("                <legend>Liste des Machines</legend>\n");
      out.write("\n");
      out.write("                <table border=\"1\" class=\"tab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Reference </th>\n");
      out.write("                            <th>Prix</th>\n");
      out.write("                            <th>Marque</th>\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody  >\n");
      out.write("                           ");

                    for (Machine m : tous_machine) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( m.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getReference());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getPrix());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getMarque().getLibelle());
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                       \n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("             <canvas id=\"graphiqueMachines\" width=\"400\" height=\"200\"></canvas>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("         </fieldset>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("            <form method=\"GET\" action=\"MachineController\">\n");
      out.write("               \n");
      out.write("            </form>\n");
      out.write("          \n");
      out.write("          \n");
      out.write("        </form>            \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

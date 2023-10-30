package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.util.HibernateUtil;
import java.util.Date;
import ma.school.beans.Etudiant;
import ma.school.service.EtudiantService;

public final class etudiantForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          \n");
      out.write("        <script src=\"script/script.js\" type=\"text/javascript\"></script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"script/etudiant.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script>\n");
      out.write("            function confirmSupprimer() {\n");
      out.write("                return confirm(\"Êtes-vous sûr de vouloir supprimer cet étudiant ?\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
      out.write("                <li><a class=\"active\" href=\"graphe.jsp\">Graphe Machine par marques</a></li>\n");
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
      out.write("            <form method=\"GET\" action=\"EtudiantController\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <legend>Informations Etudiant</legend>\n");
      out.write("                    <table border=\"0\">\n");
      out.write("                        <input id=\"id\" type=\"number\" name=\"id\" value=\"\"  hidden=\"\"/>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nom</td>\n");
      out.write("                            <td><input id=\"nom\" type=\"text\" name=\"nom\" value=\"\"  required=\"\"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Prenom</td>\n");
      out.write("                            <td><input id=\"prenom\" type=\"text\" name=\"prenom\" value=\"\" required=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Ville</td>\n");
      out.write("                            <td>\n");
      out.write("                                <select id=\"ville\" name=\"ville\">\n");
      out.write("                                    <option value=\"Rabat\">Rabat</option>\n");
      out.write("                                    <option value=\"Fes\">Fes</option>\n");
      out.write("                                    <option value=\"Marakech\">Marrakech</option>\n");
      out.write("                                     <option value=\"Casablanca\">Casablanca</option>\n");
      out.write("                                     <option value=\"Tangier\">Tangier</option>\n");
      out.write("                                     <option value=\"Settat\">Settat</option>\n");
      out.write("                                     <option value=\"Mohammedia\">Mohammedia</option>\n");
      out.write("\n");
      out.write("                                </select>\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Date de naissance</td>\n");
      out.write("                            <td><input id=\"date\" type=\"date\" name=\"dateNaissance\" value=\"\" required=\"\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Sexe</td>\n");
      out.write("                            <td>M<input id=\"m\" type=\"radio\" name=\"sexe\" value=\"homme\" />\n");
      out.write("                                F<input id=\"f\" type=\"radio\" name=\"sexe\" value=\"femme\" checked=\"checked\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td>\n");
      out.write("                                <input id=\"envoyer\" name=\"op\" type=\"submit\" value=\"Envoyer\" />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("            ");

              
                EtudiantService es = new EtudiantService();
            
      out.write("\n");
      out.write("            <fieldset>\n");
      out.write("                <legend>Liste des étudiants</legend>\n");
      out.write("\n");
      out.write("                <table border=\"1\" class=\"tab\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Id</th>\n");
      out.write("                            <th>Nom</th> \n");
      out.write("                                \n");
      out.write("                            <th>Prenom</th>\n");
      out.write("                            <th>Ville</th>\n");
      out.write("                            <th>Date de naissance</th>\n");
      out.write("                            <th>Sexe</th>\n");
      out.write("                            <th>Supprimer</th>\n");
      out.write("                            <th>Modifier</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        ");

                            for (Etudiant e : es.findAll()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(e.getId());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getNom());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getPrenom());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getVille());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getDateNaissance());
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(e.getSexe());
      out.write("</td>\n");
      out.write("                            <td><a class=\"bndelete\" href=\"EtudiantController?op=delete&id=");
      out.print(e.getId());
      out.write("\"onclick=\"return confirmSupprimer();\">Supprimer</a></td>\n");
      out.write("                            <td><button class=\"bnupdate\" data-id=\"");
      out.print(e.getId());
      out.write("\">Modifier</button></td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </fieldset>\n");
      out.write("        </form>            \n");
      out.write("</body>\n");
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

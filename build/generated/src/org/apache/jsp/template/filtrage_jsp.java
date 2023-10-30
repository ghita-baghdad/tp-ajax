package org.apache.jsp.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ma.school.service.MarqueService;
import ma.school.beans.Marque;
import java.util.List;
import ma.school.beans.Machine;
import ma.school.service.MachineService;

public final class filtrage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style/csslocal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"style/css.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <form method=\"post\" action=\"\">\n");
      out.write("            <label for=\"marqueId\">Sélectionnez l'ID de la marque</label>\n");
      out.write("\n");
      out.write("            <select name=\"marqueId\">\n");
      out.write("                ");

                    MachineService ms = new MachineService();
                    for (Machine m : ms.findAll()) {
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <option name =\"marqueId\" value=\"");
      out.print(m.getId());
      out.write('"');
      out.write('>');
      out.print(m.getId());
      out.write(" </option>\n");
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </select>\n");
      out.write("            <p style=\"text-align: center;\"><input type=\"submit\" class=\"btn btn-dark btn-outline-secondary\" value=\"Afficher la commande\" name=\"valider\" /></p>\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        <table border=\"0\">\n");
      out.write("            <thead>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Reference:</th>\n");
      out.write("                    <th>Prix</th>\n");
      out.write("                    <th></th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    for (Machine m : tous_machine) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print( m.getReference());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print( m.getPrix());
      out.write("</td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
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

<%@page import="ma.school.beans.Marque"%>
<%@page import="ma.school.service.MarqueService"%>
<%@page import="java.util.Date"%>
<%@page import="ma.school.beans.Etudiant"%>
<%@page import="ma.school.service.EtudiantService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="script/marque.js" type="text/javascript"></script>
        <script src="script/script.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <link href="style/csslocal.css" rel="stylesheet" type="text/css"/>
        <script>
            function confirmSupprimer() {
                return confirm("Êtes-vous sûr de vouloir supprimer cette marque ?");
            }
        </script>
    </head>
    <body>
        <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
        <div class="content">
            <form method="GET" action="MarqueController">
                <fieldset>
                    <legend>Informations Marque</legend>
                    <table border="0">
                        <tr>
                            <td>Code</td>
                            <td><input id="code" type="text" name="code" value=""  required=""/></td>
                        </tr>
                        <tr>
                            <td>Libelle</td>
                            <td><input id="libelle" type="text" name="libelle" value="" required="" /></td>
                        </tr>
                       <tr>
                            <td></td>
                            <td>
                                <input name="op" type="submit" value="Envoyer" />
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </form>
            <%
                MarqueService ms = new MarqueService();
            %>
            <fieldset>
                <legend>Liste des marque</legend>

                <table border="1" class="tab">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Code <br>
                            <th>Libelle</th>
                            
                            <th>Supprimer</th>
                            <th>Modifier</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Marque m : ms.findAll()) {
                        %>
                        <tr>
                            <td><%=m.getId()%></td>
                            <td><%=m.getCode()%></td>
                            <td><%=m.getLibelle()%></td>
                            
                            <td><a class="bndelete" href="MarqueController?op=delete&id=<%=m.getId()%>"onclick="return confirmSupprimer();">Supprimer</a></td>
                            <td><button class="bnupdate" datamarque-id="<%=m.getId()%>">Modifier</button></td>
                        </tr>
                        <%}%>
                    </tbody>
                </table>

            </fieldset>
        </form>            
</body>
</html>

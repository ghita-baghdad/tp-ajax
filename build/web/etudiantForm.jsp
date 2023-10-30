<%@page import="ma.school.util.HibernateUtil"%>
<%@page import="java.util.Date"%>
<%@page import="ma.school.beans.Etudiant"%>
<%@page import="ma.school.service.EtudiantService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
          
        <script src="script/script.js" type="text/javascript"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="script/jquery-3.3.1.min.js" type="text/javascript"></script>
        <script src="script/etudiant.js" type="text/javascript"></script>
        <link href="style/css.css" rel="stylesheet" type="text/css"/>
        <link href="style/csslocal.css" rel="stylesheet" type="text/css"/>
        <script>
            function confirmSupprimer() {
                return confirm("Êtes-vous sûr de vouloir supprimer cet étudiant ?");
            }
        </script>
    </head>
    <body>
        <%@include file="template/header.jsp" %>
        <%@include file="template/menu.jsp" %>
        <div class="content">
            <form method="GET" action="EtudiantController">
                <fieldset>
                    <legend>Informations Etudiant</legend>
                    <table border="0">
                        <input id="id" type="number" name="id" value=""  hidden=""/>
                        <tr>
                            <td>Nom</td>
                            <td><input id="nom" type="text" name="nom" value=""  required=""/></td>
                        </tr>
                        <tr>
                            <td>Prenom</td>
                            <td><input id="prenom" type="text" name="prenom" value="" required="" /></td>
                        </tr>
                        <tr>
                            <td>Ville</td>
                            <td>
                                <select id="ville" name="ville">
                                    <option value="Rabat">Rabat</option>
                                    <option value="Fes">Fes</option>
                                    <option value="Marakech">Marrakech</option>
                                     <option value="Casablanca">Casablanca</option>
                                     <option value="Tangier">Tangier</option>
                                     <option value="Settat">Settat</option>
                                     <option value="Mohammedia">Mohammedia</option>

                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Date de naissance</td>
                            <td><input id="date" type="date" name="dateNaissance" value="" required="" /></td>
                        </tr>
                        <tr>
                            <td>Sexe</td>
                            <td>M<input id="m" type="radio" name="sexe" value="homme" />
                                F<input id="f" type="radio" name="sexe" value="femme" checked="checked" /></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td>
                                <input id="envoyer" name="op" type="submit" value="Envoyer" />
                            </td>
                        </tr>
                    </table>
                </fieldset>
            </form>
            <%
              
                EtudiantService es = new EtudiantService();
            %>
            <fieldset>
                <legend>Liste des étudiants</legend>

                <table border="1" class="tab">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Nom</th> 
                                
                            <th>Prenom</th>
                            <th>Ville</th>
                            <th>Date de naissance</th>
                            <th>Sexe</th>
                            <th>Supprimer</th>
                            <th>Modifier</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (Etudiant e : es.findAll()) {
                        %>
                        <tr>
                            <td><%=e.getId()%></td>
                            <td><%=e.getNom()%></td>
                            <td><%=e.getPrenom()%></td>
                            <td><%=e.getVille()%></td>
                            <td><%=e.getDateNaissance()%></td>
                            <td><%=e.getSexe()%></td>
                            <td><a class="bndelete" href="EtudiantController?op=delete&id=<%=e.getId()%>"onclick="return confirmSupprimer();">Supprimer</a></td>
                            <td><button class="bnupdate" data-id="<%=e.getId()%>">Modifier</button></td>
                    </tr>
                    <%}%>
                    </tbody>
                </table>

            </fieldset>
        </form>            
</body>
</html>

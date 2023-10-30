# tp-ajax

## Aperçu :

Ce projet est une application de gestion qui permet de gérer des étudiants, des machines et des marques de machines. Il utilise AJAX pour effectuer des opérations CRUD (Create, Read, Update, Delete) sur ces entités sans rechargement de page.

## Technologies Utilisées :

- HTML, CSS, JavaScript,jQuery et chart.js
- AJAX
- Serveur backend JEE, Hibernate , MySQL et GlassFishServer
  
## Fonctionnalités :

1- Confirmation de Suppression : Demande d'une confirmation avant de supprimer un étudiant, une machine ou une marque pour éviter les suppressions accidentelles.

2- Modification d'enregistrement : Permettre la modification des informations d'un étudiant, d'une machine ou d'une marque pour mettre à jour les données existantes.

3- Filtrage des Machines par Marque : Offrer la possibilité de filtrer la liste des machines en fonction de la marque, ce qui permettra aux utilisateurs de voir uniquement les machines liées à une marque spécifique.

4- Filtrage des Machines par Référence : Ajout de la possibilité de filtrer la liste des machines par référence, ce qui permettra aux utilisateurs de rechercher une machine en particulier.

5- Graphique du Nombre de Machines par Marque : un graphique qui affiche le nombre de machines pour chaque marque, offrant ainsi une vue visuelle de la répartition des machines par marque.

6- Gestion des Étudiants,des Machines et des Marques :Ajout d'un nouvel étudiant, une nouvelle machine ou une nouvelle marque.Affichez la liste des étudiants, machines et marques existants.Mise à jour et suppression des informations d'un étudiant, d'une machine.

## Interfaces du projet :

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/b71fdfd0-f3b9-40d3-a99c-50f6499267e3)

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/0d02cf4e-39a3-42a8-98f7-4a479a3b70b6)

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/0ce77ee1-4840-4b97-b1c1-4c641fa6f769)

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/7184934d-088f-4086-b6bc-a2c9906e731a)

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/6733508e-0b8a-4db5-a570-9b8ad5b8c843)

-Représentation graphique de la distribution des machines par marque graphiques à barres :

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/c2df982e-1547-46cf-b1e1-c8b405e22564)

# Gestion des étudiants 

## Test de l'ajout :

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/cac632ee-347f-4505-b723-149d4f791244)

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/96215974-4c28-4b56-8779-8f66e3439187)

## Test de la suppression avec affichage d'un message de confirmation :

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/f4ef4bff-1fdd-4d75-8753-463af65ac0c7)

## Test de la modification :

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/6cbfa2fe-2d47-4b09-8e2e-15b06e7303da)

- recuperation des données avant modification
  
![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/1fb737cc-ba38-422d-a3f1-1185da8558fe)

-Modification de la premiere ligne 

![image](https://github.com/ghita-baghdad/tp-ajax/assets/147449053/e21fc2cc-0fbf-4604-9a3f-6b244c86b304)


## Structure du Projet

Le projet est organisé en plusieurs packages et répertoires :

ma.schools.config : Contient le fichier de configuration hibernate.cfg.xml pour Hibernate.
ma.school.util : Inclut la classe HibernateUtil pour gérer la SessionFactory Hibernate.
ma.school.service : Contient les classes qui implémentent les opérations d'accès aux données (DAO).
ma.school.dao : Définit l'interface IDao pour les opérations CRUD.
ma.school.beans : Contient les classes entités pour les étudiants, les marques de machines et les machines.
ma.school.controller : Servlets pour la gestion des requêtes web.

## Pages Web

etudiantForm.jsp : Interface de gestion des étudiants.
machineForm.jsp : Interface de gestion des machines.
marqueForm.jsp : Interface de gestion des marques de machines.
machineByMarqueForm.jsp : Filtrage des machines par marque.
machineByReferenceForm.jsp : Filtrage des machines par référence.
chart.jsp : Page de visualisation graphique.
menu.jsp, footer.jsp, header.jsp : Composants de pages communs.











$(document).ready(function () {

    $(".bnupdate").click(function () {
              $.ajax ({
            url: 'EtudiantController?op=byid&id='+$(this).attr('data-id'),//this = élément sélectionné
            type: 'GET',
            success: function (data) {
                alert(JSON.stringify(data))
                $('#nom').val(data.nom)
                $('#prenom').val(data.prenom)
                $('#id').val(data.id)
                $('#ville').val(data.ville)
                $('#sexe').val(data.sexe)
                $('#date').val(new Date(data.dateNaissance))
                if(data.sexe == 'femme') $('#f').attr('checked','')
                else $('#m').attr('checked', '')
                $('#envoyer').val('Modifier')
                
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });


});



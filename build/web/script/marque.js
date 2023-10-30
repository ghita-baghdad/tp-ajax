$(document).ready(function () {

    $(".bnupdate").click(function () {
              $.ajax ({
            url: 'MarqueController?op=byid&id='+$(this).attr('data-id'),//this = élément sélectionné
            type: 'GET',
            success: function (data) {
                alert(JSON.stringify(data))
                $('#id').val(data.id)
                $('#code').val(data.code)
                $('#libelle').val(data.libelle)
                $('#envoyer').val('Modifier')
                
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });


});




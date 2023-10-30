$(document).ready(function () {

    $(".bnupdate").click(function () {
              $.ajax ({
            url: 'MachineController?op=byid&id='+$(this).attr('datamachine-id'),//this = élément sélectionné
            type: 'GET',
            success: function (data) {
                alert(JSON.stringify(data))
                $('#ref').val(data.reference)
                $('#prix').val(data.prix)
                $('#marque').val(data.marque.libelle)
                $('#date').val(new Date(data.dateAchat))
                $('#envoyer').val('Modifier')
                
            },
            error: function (jqXHR, textStatus, errorThrown) {
                console.log(textStatus);
            }
        });
    });


});


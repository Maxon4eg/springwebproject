const name = $('#username');
const email = $('#email');
const nameResponse = $('.username-response');
const emailResponse = $('.email-response');

$( () => {
    var token = $("input[name='_csrf']").val();
    var header = "X-CSRF-TOKEN";
    $(document).ajaxSend(function(e, xhr, options) {
        xhr.setRequestHeader(header, token);
    });
});

name.focusout(() => {
    $.ajax({
        url: 'http://' + location.host + '/rest/user/api/registration',
        type: 'POST',
        dataType: 'json',
        contentType: "application/json; charset=utf-8",
        data: JSON.stringify({
            "param" : name.val(),
            "paramName" : name.attr('data-field')
        }),
        error: () => {
            alert('error');
        },
        success: (data) => {
            showUsernameResponse(data);
        }
    })
});

email.focusout(() => {
    $.ajax({
        url: 'http://' + location.host + '/rest/user/api/registration',
        type: 'POST',
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        data: JSON.stringify({
            "param" : email.val(),
            "paramName" : email.attr('data-field')
        }),
        error: () => {
            alert('error');
        },
        success: () => {
            showEmailResponse()
        }
    })
});

function showUsernameResponse(data) {
        nameResponse.show(1000);
    if(data.available) {
        nameResponse.text('Ok username');
    } else {
        nameResponse.text('Invalid username');
    }

}

function showEmailResponse() {
    emailResponse.show(1000);
    nameResponse.text('Ok email')
}


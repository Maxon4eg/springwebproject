const name = $('#username');
const email = $('#email');
const nameResponse = $('.username-response');
const emailResponse = $('.email-response');

name.addEventListener('focusout', () => {
    $.ajax({
        url: 'http://' + location.host + '/rest/user/api/registration',
        method: 'POST',
        type: 'json',
        dataType: JSON.stringify(name),
        error: () => {
            alert('error');
        },
        success: () => {
            showUsernameResponse();
        }
    })
});

email.focusout(() => {
    $.ajax({
        url: 'http://' + location.host + '/rest/user/api/registration',
        method: 'POST',
        type: 'json',
        dataType: JSON.stringify(email),
        error: () => {
            alert('error');
        },
        success: () => {
            showEmailResponse()
        }
    })
});

function showUsernameResponse() {
    nameResponse.show(1000);
    nameResponse.text('Ok')
}

function showEmailResponse() {
    emailResponse.show(1000);
    nameResponse.text('Error')
}


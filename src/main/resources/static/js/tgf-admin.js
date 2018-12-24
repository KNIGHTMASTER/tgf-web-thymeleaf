/**
 * Created by Fauzi on 4/3/18.
 */

function login() {
    var username = $('#txtUserName').val();
    var password = $('#txtPassword').val();
    var btSignIn = $('#btSignIn');

    var loginPath = 'http://localhost:8484/tgf-admin/actionlogin';
    var adminPath = 'http://localhost:8484/tgf-admin/';

    btSignIn.innerHTML = 'Please Wait ...';

    var jsonData = {
        userName : username,
        password : password
    };

    var data = makePostCall(loginPath, jsonData);
    alert(data);
    alert(JSON.stringify(data));
    if (resultLogin == true) {
        window.location.href(adminPath);
    }else {
        alert("Please Try Again");
        btSignIn.innerHTML = 'Sign In';
    }
}

makePostCall = function (url, data) {
    var json_data = JSON.stringify(data);
    alert(json_data);
    return $.ajax({
        type: "POST",
        url: url,
        data: json_data,
        dataType: "json",
        contentType: "application/json;charset=utf-8"
    });
}
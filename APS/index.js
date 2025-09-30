const username = document.getElementById("username");
const password = document.getElementById("password")

function checkLogin(){
    fetch("http://localhost:8080/login",
        {
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            method: "POST",
            body: JSON.stringify({
                username: username.value,
                password: password.value
            })
        })
        .then(function(response) {
        if (!response.ok) {
            throw new Error('Erro na requisição');
        }
        return response.json();
        })
        .then(function(data) {      
            if (data.success || data === true) {
                sessionStorage.setItem('isLoggedIn', true);
                sessionStorage.setItem('username', username.value);
                location.href="orçamento.html";
            } else {
                alert('Usuário ou senha inválidos!');
            }
        })
        .catch(function(error) {
            console.error('Erro:', error);
            alert('Erro ao tentar fazer login');
        });
}
function limpar(){
    username.value = null;
    password.value = null;
}
function logar(){
    checkLogin();
    limpar();
}


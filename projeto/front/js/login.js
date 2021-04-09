function autenticar(evento){
    evento.preventDefault();
    
    let user = document.getElementById("txtUser").value;
    let senha = document.getElementById("txtSenha").value;
    let usuario = {
        email:user,
        racf:user,
        senha:senha
    }

    let msg = {
        method: 'POST',
        body: JSON.stringify(usuario),
        Headers:{
            'Content-type': 'application/json'
        }
    }
    fetch("http://localhost:8080/usuarios/login", msg)
    .then(res => tratarResposta(res))

}

function tratarResposta(resposta){
    if(resposta.status != 200){
        document.getElementById("msgError").innerHTML = "Usuario/Senha invalido(a)"

    }else{
        resposta.JSON().then(res => fazerLogin(res))

    }
}

function fazerLogin(user){
    localStorage.setItem("userlogged", JSON.stringify(user))
    window.location = "dashmenu.html"
}
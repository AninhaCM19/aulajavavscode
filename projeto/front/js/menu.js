function validaLogin(){
    let user = localStorage.getItem("userlogged");

    if(!user){
        windows.location = "index.html"
    }
    let user = JSON.parse(userTxt);
    document.getElementById("user").innerHTML = `nome: ${user.nome}`
    document.getElementById("foto").innerHTML = `<img src=${user.linkFoto}>`

}
function validarForma(forma){
    
    let usuario = forma.usuario;
    if(usuario.value == ""||usuario.value == "Escribir usuario"){
        alert("Debe proporcionar un nombre de usuario");
        usuario.focus();
        usuario.select();
        return false;
    }
    let password = forma.password;
    if(password.value == "" || password.value.length < 3){
        alert("Debe proporcionar un password al menos de 3 caracteres");
        password.focus();
        password.focus();
        return false;
    }
    let tecnologias = forma.tecnologia;
    let checkSeleccionado = false;
    for(let i = 0; i < tecnologias.length; i++){
        if(tecnologias[i].checked){
            checkSeleccionado = true;
        }
    }
    if (!checkSeleccionado){
        alert("Debe selecionar una tecnologia");
        return false;
    }
    
    let genero = forma.genero;
    let radioSeleccionado = false;
    for (let i = 0; i < genero.length; i++){
        if(genero[i].checked){
            radioSeleccionado = true;
        }
    }
    
    if(!radioSeleccionado){
        alert("Debe seleccionar un genero");
        return false;
    }
    
    let ocupacion = forma.ocupacion;
    if(ocupacion.value == ""){
        alert("Debe selecionar una ocupacion");
        return false;
    }
    
    //Formulario es valido 
    alert("Formulario valido, enviado datos al servidor");
    return true;
}
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Pizza Sabor Zumbi</title>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="estilos.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="estilos.css">
        <link rel="stylesheetb" href="https://code.getmdl.io/1.3.0/material.deep_orange-red.min.css" /> 
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
        <title>Erro</title>
    </head>
    <body class="erro">
        <h3> Ocorreu um erro no site.</h3>
        <h4>1º Apenas administradores podem acessar a página de login.</h4>
        <h4>2º Verifique se seu nome de usuario e senha estão corretos.</h4>
        <h4>3º Verifique se o botão postar foi precionado com alguma mensagem no respectivo campo.</h4>
        <h4>4º Caso o erro persistir consulte o suporte técnico.</h4>
        <button onclick="goBack()" class="mdl-button mdl-js-button mdl-button--raised">
            Voltar
        </button>
        <script>
            function goBack() {
                window.history.back();
            }
        </script>
    </body>
</html>

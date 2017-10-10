<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css">
        <title>Erro</title>
    </head>
    <body class="erro">
        <h1> Ocorreu um erro no site.</h1>
        <h2>1º Apenas administradores podem acessar essa página.</h2>
        <h2>2º Verifique se seu nome de usuario e senha estão corretos.</h2>
        <h2>3º Caso o erro persistir consulte o suporte técnico.</h2>
        //adicionar o link do getmdl
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

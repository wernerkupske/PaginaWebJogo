<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3> A mensagem não pode ser vazia! </h3>
        <button onclick="goBack()">Voltar</button>

        <script>
        function goBack() {
            window.history.back();
        }
        </script>
    </body>
</html>

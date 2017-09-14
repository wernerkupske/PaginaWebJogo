<%-- 
    Document   : forum
    Created on : 28/08/2017, 14:52:59
    Author     : informatica
--%>

<%@page import="modelo.ForumDTO"%>
<%@page import="dao.sql.ForumDAO"%>
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
            <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </head>
    <body style=" background-color: black;">
         <style>
            .demo-layout-transparent {
                background: url('../assets/demos/transparent.jpg') center / cover;
            }
            .demo-layout-transparent .mdl-layout__header,
            .demo-layout-transparent .mdl-layout__drawer-button {
                color: yellow;
            }
        </style>
        <div class="demo-layout-transparent mdl-layout mdl-js-layout">
            <header class="mdl-layout__header mdl-layout__header--transparent">
                <div class="mdl-layout__header-row">
                    <!-- Title -->
                    <span class="mdl-layout-title">Menu</span>
                </div>
            </header>
            <div class="mdl-layout__drawer">
                <span class="mdl-layout-title">Menu</span>
                <nav class="mdl-navigation">
                    <a class="mdl-navigation__link" href="index.html">Página Inicial</a>
                    <a class="mdl-navigation__link" href="sobreJogo.html">Sobre o jogo</a>
                    <a class="mdl-navigation__link" href="ranking.jsp">Ranking</a>
                    <a class="mdl-navigation__link" href="download.html">Download</a>
                    <a class="mdl-navigation__link" href="fotos.html">Fotos</a>
                    <a class="mdl-navigation__link" href="desenvolvedores.html">Desenvolvedores</a>
                    <a class="mdl-navigation__link" href="forum.jsp">Forum</a>
                    <a class="mdl-navigation__link" href="login.jsp">Login</a>
                </nav>
            </div>       
            <main class="mdl-layout__content">
                <img src="assets/coollogo_forum.png" class="displayed"/>
                <html xmlns="http://www.w3.org/1999/xhtml">
                    <div id="wrapper">
                        <div id="menu">
                            <!-- Quando logar e tiver tudo válido mostrar o link sair para deslogar 
                                <p class="logout" style=" text-align: right; float: right"> <a id="exit" href="#">Sair</a></p>
                            -->
                            <div style="clear:both">
                            </div>
                        </div>
                        <!--
                             Mostrar no chatbox: NomeUsuario(data): mensagem  
                        -->
                        <div id="chatbox">
                            <%ForumDAO fdao = new ForumDAO();
                               for (ForumDTO f : fdao.carregaDados()) {
                            %>    
                            <span style="font-size: 15px"> <%=f.getData()%> </span> <span style="color: darkorange; font-size: 17px; "> <%=f.getNome()%> : </span> <span style="font-size: 15px"> <%=f.getMensag()%> </span> 
                                <br>
                            <% } %>
                        </div>
                        <form action="mensagem" name="message" method="post">
                            <p style="text-align: left;margin-left: 27px">Nome: <input name="usuario" type="nome" id="username" size="63" /></p>                                 
                            <p style="text-align: left;margin-left: 27px">Mensagem: <input name="mensagem" type="text" id="usermsg" size="63" /></p>
                            <input  style=" margin-top: 25px;margin-left: 28px" name="submitmsg" type="submit"  id="submitmsg" value="Postar" />
                            <a style=" text-align: right;margin-right: 27px;float: right" href="login.jsp">Login</a>
                        </form>
                    </div>
                </html>
            </main>
        </div>  
    </body>
</html>

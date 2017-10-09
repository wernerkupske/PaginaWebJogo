<%-- 
    Document   : login
    Created on : 11/09/2017, 14:46:27
    Author     : informatica
--%>

<%@page import="dao.sql.LoginDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "login.User" %> 
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
    </head>
    <body style="background-color: black; ">

        <!-- criar página formulário(quinto passo) -->
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
                <img src="assets/coollogo_login.png" class="displayed"/>
                <br> <br>

                <div class="form">
                    <form action="codLogin" method="post">
                        <table>
                            <tr>
                                <td>
                                    Usuário:                                
                                    <input  type="text" name="login" value="" size="20">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Senha:
                                    <input style="margin-left: 7.7%" type="password" name="senha" value="" size="20">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <br>
                                    <button type="submit" value="Login" class="mdl-button mdl-js-button mdl-button--raised">
                                        Login
                                    </button>
                                </td>
                            </tr>
                        </table>
                    </form>
                    <br>
                </div>
            </main>
        </div>
    </body>
</html>

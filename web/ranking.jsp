<%-- 
    Document   : ranking
    Created on : 28/08/2017, 14:56:32
    Author     : informatica
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Sabor Zumbi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.indigo-pink.min.css">
        <link rel="stylesheet" href="estilos.css">
        <script defer src="https://code.getmdl.io/1.3.0/material.min.js"></script>
    </head>
    <body style="background-color: black; ">
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
                </nav>
            </div>

            <main class="mdl-layout__content">
                <img src="assets/coollogo_ranking.png" class="displayed"/>

                <table align="center" width="500" class="mdl-data-table mdl-js-data-table">
                    <thead>
                        <tr align="center">
                            <th  class="mdl-data-table__cell--non-numeric">Jogador</th>
                            <th>-</th>
                            <th  >Pontuação</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            
                        %>
                    </tbody>

                </table>

            </main>
        </div>
    </body>
</html>

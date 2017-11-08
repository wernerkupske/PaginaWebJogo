<%-- 
    Document   : ranking
    Created on : 28/08/2017, 14:56:32
    Author     : informatica
--%>

<%@page import="dao.sql.RankingDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.RankingDTO"%>
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
                    <a class="mdl-navigation__link" href="sprites.html">Sprites</a>
                    <a class="mdl-navigation__link" href="desenvolvedores.html">Desenvolvedores</a>
                    <a class="mdl-navigation__link" href="sprites.jsp">Forum</a>
                    <a class="mdl-navigation__link" href="login.jsp">Login</a>
                </nav>
            </div>

            <main class="mdl-layout__content">
                <img src="assets/coollogo_ranking.png" class="displayed"/>

                <div class="w3-padding-64 w3-content w3-text-grey" id="contact">
                    <h2> Ranking: Modo Campanha </h2>
                    <%
                        RankingDAO pdao = new RankingDAO();
                        ArrayList<RankingDTO> list = pdao.carregaPontucao();
                        if (list.isEmpty()) {
                    %>
                    <h2>Não há nenhuma pontuação.</h2> 

                    <%
                    } else {
                    %>
                    <table width="400" class="mdl-data-table mdl-js-data-table mdl-shadow--2dp" style="margin: auto;
                           margin-top: 10px;">

                        <thead>
                            <tr>
                                <th>Nome</th>
                                <th style=" text-align: center">Pontuacao</th>
                            </tr>
                        </thead>
                        <%
                            for (RankingDTO p : list) {
                        %>                         
                        <tbody>
                            <tr>
                                <td> <%=p.getIdJogador()%> </td>
                                <td><%=p.getNome()%></td>
                                <td style=" text-align: center"><%=p.getPontuacao()%></td>
                                <td style="text-align: center"> <%=p.getModoDeJogo()%> </td>
                            </tr>
                            <%
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>    
            </main>

        </div>
    </body>
</html>

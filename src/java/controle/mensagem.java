/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.sql.ForumDAO;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mensagem", urlPatterns = {"/mensagem"})
public class mensagem extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	String nome = request.getParameter("usuario");
	String mensagem = request.getParameter("mensagem");
	DateFormat dataFormat = new SimpleDateFormat("HH:mm");
	Date date = new Date();
	String data = "(" + dataFormat.format(date) + ")";
        int id = 0;
	if(mensagem.equals("") || mensagem.equals("null")){
	    RequestDispatcher rd = request.getRequestDispatcher("erro.jsp");
	    rd.forward(request, response);
	}else{
	    if(nome.equals("") || nome.equals("null")){
		nome = "Anônimo";
	    }
	    if(mensagem.length() > 100 ){
		mensagem = mensagem.substring(0, 99);
	    }
	    if(nome.length() > 100){
		nome = nome.substring(0, 99);
	    }
	    ForumDAO fdao = new ForumDAO();
	    fdao.insereDados(nome, mensagem, data, id);
	    RequestDispatcher rd = request.getRequestDispatcher("forum.jsp");
	    rd.forward(request, response);
	}
	
    }


}

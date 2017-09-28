package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import login.User;

/**
 *
 * @author informatica
 */
@WebServlet(urlPatterns = {"/codLogin"})
public class codLogin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {

                /* TODO output your page here. You may use following sample code. */
                User us = new User();
                String login = request.getParameter("login");
                String senha = request.getParameter("senha");
                boolean status = false;
                try {
                    status = us.verificarUsuario(login, senha);
                } catch (SQLException ex) {
                    out.println("erro no sql: " + ex.getMessage());
                }
                if (status) {
                    //out.println("Login efetuado com sucesso ");
                    
                    // sinaliza de que o admin estah logado
                    HttpSession ses = request.getSession(true);
                    ses.setAttribute("adminLogado", true);
                    
                    // retorna à página index
                    RequestDispatcher rd = request.getRequestDispatcher("forum.jsp");
                    rd.forward(request, response);
                } else {
                    out.println("login ou senha inválidos");
                }
            } catch (Exception ex) {
                out.print("erro no controlador: " + ex.getMessage());
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

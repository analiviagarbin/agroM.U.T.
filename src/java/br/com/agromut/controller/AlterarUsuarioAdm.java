package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.dao.UsuarioAdmDAOImpl;
import br.com.agromut.dao.UsuarioDAOImpl;
import br.com.agromut.model.Usuario;
import br.com.agromut.model.UsuarioAdm;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AlunoRemoto
 */
@WebServlet(name = "AlterarUsuarioAdm", urlPatterns = {"/AlterarUsuarioAdm"})
public class AlterarUsuarioAdm extends HttpServlet {

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
            
            //Integer idUsuarioAdm = Integer.parseInt(request.getParameter("idUsuarioAdm"));
            String nomeUsuario = request.getParameter("nomeUsuario");
            String emailUsuario = request.getParameter("emailUsuario");
            String celularUsuario = request.getParameter("celularUsuario");
            String loginUsuario = request.getParameter("loginUsuario");
            String senhaUsuario = request.getParameter("senhaUsuario");
            String cepUsuario = request.getParameter("cepUsuario");
            String ufUsuario = request.getParameter("ufUsuario");
            String cidadeUsuario = request.getParameter("cidadeUsuario");
            String bairroUsuario = request.getParameter("bairroUsuario");
            String ruaUsuario = request.getParameter("ruaUsuario");
            String numUsuario = request.getParameter("numUsuario");
            Integer idUsuario = Integer.parseInt(request.getParameter("idUsuario"));
            
            String mensagem = null;
   
            Usuario usuario = new Usuario();
            usuario.setNomeUsuario(nomeUsuario);
            usuario.setEmailUsuario(emailUsuario);
            usuario.setCelularUsuario(celularUsuario);
            usuario.setLoginUsuario(loginUsuario);
            usuario.setSenhaUsuario(senhaUsuario);
            usuario.setCepUsuario(cepUsuario);
            usuario.setUfUsuario(ufUsuario);
            usuario.setCidadeUsuario(cidadeUsuario);
            usuario.setBairroUsuario(bairroUsuario);
            usuario.setRuaUsuario(ruaUsuario);
            usuario.setNumUsuario(numUsuario);
            usuario.setIdUsuario(idUsuario);
            
             try {
                UsuarioDAOImpl dao = new UsuarioDAOImpl();
                if (dao.alterar(usuario)) {
                    mensagem = "UsuarioAdm alterado com sucesso.";

                } else {
                    mensagem = "Problemas ao alterar produto.";

                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("usuarioAdm/perfil.jsp").forward(request, response);

            } catch (Exception e) {
                System.out.println("problemas no Servlet ao alterar produto! Erro: " + e.getMessage());
                e.printStackTrace();
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

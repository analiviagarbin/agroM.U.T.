package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.UsuarioFuncDAOImpl;
import br.com.agromut.model.UsuarioFunc;
import br.com.agromut.utill.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarUsuarioFunc", urlPatterns = {"/CadastrarUsuarioFunc"})
public class CadastrarUsuarioFunc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String nomeUsuario = request.getParameter("nomeUsuario");
            String emailUsuario = request.getParameter("emailUsuario");
            String celularUsuario = request.getParameter("celularUsuario");
            String loginUsuario = request.getParameter("loginUsuario");
            String senhaUsuario = request.getParameter("senhaUsuario");
            Date datanascUsuario = Conversoes.converterData(request.getParameter("datanascUsuario"));
            String cpfUsuario = request.getParameter("cpfUsuario");
            String cepUsuario = request.getParameter("cepUsuario");
            String ufUsuario = request.getParameter("ufUsuario");
            String cidadeUSuario = request.getParameter("cidadeUsuario");
            String bairroUsuario = request.getParameter("bairroUsuario");
            String ruaUsuario = request.getParameter("ruaUsuario");
            String numUsuario = request.getParameter("numUsuario");
            String codigoUsuario = request.getParameter("codigoUsuario");
            String salarioUsuarioFunc = request.getParameter("salarioUsuarioFunc");
            String statusUsuarioFunc = request.getParameter("statusUsuarioFunc");

            String mensagem = null;

            UsuarioFunc usuariofunc = new UsuarioFunc();
            usuariofunc.setNomeUsuario(nomeUsuario);
            usuariofunc.setEmailUsuario(emailUsuario);
            usuariofunc.setCelularUsuario(celularUsuario);
            usuariofunc.setLoginUsuario(loginUsuario);
            usuariofunc.setSenhaUsuario(senhaUsuario);
            usuariofunc.setDatanascUsuario(datanascUsuario);
            usuariofunc.setCpfUsuario(cpfUsuario);
            usuariofunc.setCepUsuario(cepUsuario);
            usuariofunc.setUfUsuario(ufUsuario);
            usuariofunc.setCidadeUsuario(cidadeUSuario);
            usuariofunc.setBairroUsuario(bairroUsuario);
            usuariofunc.setRuaUsuario(ruaUsuario);
            usuariofunc.setNumUsuario(numUsuario);
            usuariofunc.setCodigoUsuario(codigoUsuario);
            usuariofunc.setSalarioUsuarioFunc(salarioUsuarioFunc);
            usuariofunc.setStatusUsuarioFunc(statusUsuarioFunc);

            try {
                GenericDAO dao = new UsuarioFuncDAOImpl();
                if (dao.cadastrar(usuariofunc)) {
                    mensagem = "Funcionário cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar funcionário. "
                            + "Verifique os dados informados e tente novamente!";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("usuarioAdm/cadastrarfuncionario.jsp").forward(request, response);

            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar funcionário! Erro:");
                ex.getMessage();
                ex.printStackTrace();
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarUsuarioFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarUsuarioFunc.class.getName()).log(Level.SEVERE, null, ex);
        }
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

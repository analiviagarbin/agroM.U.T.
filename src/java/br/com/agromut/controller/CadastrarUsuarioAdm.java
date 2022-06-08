package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.UsuarioAdmDAOImpl;
import br.com.agromut.dao.UsuarioDAOImpl;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.util.Conversoes;
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

@WebServlet(name = "CadastrarUsuarioAdm", urlPatterns = {"/CadastrarUsuarioAdm"})
public class CadastrarUsuarioAdm extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");

        String nomeUsuario = request.getParameter("nomeUsuario");
        String emailUsuario = request.getParameter("emailUsuario");
        String celularUsuario = request.getParameter("celularUsuario");
        String loginUsuario = request.getParameter("loginUsuario");
        String senhaUsuario = request.getParameter("senhaUsuario");
        //String datateste = request.getParameter("datanascUsuario");
        Date datanascUsuario = Conversoes.converterData(request.getParameter("datanascUsuario"));
        String cpfUsuario = request.getParameter("cpfUsuario");
        String cepUsuario = request.getParameter("cepUsuario");
        String ufUsuario = request.getParameter("ufUsuario");
        String cidadeUsuario = request.getParameter("cidadeUsuario");
        String bairroUsuario = request.getParameter("bairroUsuario");
        String ruaUsuario = request.getParameter("ruaUsuario");
        String numeroUsuario = request.getParameter("numUsuario");
        String cnpjUsuarioAdm = request.getParameter("cnpjUsuarioAdm");
        String tipoUsuarioAdm = request.getParameter("tipoUsuarioAdm");
        String codigoUsuario = request.getParameter("codigoUsuario");
            

        String mensagem = null;

        UsuarioAdm usuarioadm = new UsuarioAdm();
        usuarioadm.setNomeUsuario(nomeUsuario);
        usuarioadm.setEmailUsuario(emailUsuario);
        usuarioadm.setCelularUsuario(celularUsuario);
        usuarioadm.setLoginUsuario(loginUsuario);
        usuarioadm.setSenhaUsuario(senhaUsuario);
        usuarioadm.setDatanascUsuario(datanascUsuario);
        usuarioadm.setCpfUsuario(cpfUsuario);
        usuarioadm.setCepUsuario(cepUsuario);
        usuarioadm.setUfUsuario(ufUsuario);
        usuarioadm.setCidadeUsuario(cidadeUsuario);
        usuarioadm.setBairroUsuario(bairroUsuario);
        usuarioadm.setRuaUsuario(ruaUsuario);
        usuarioadm.setNumUsuario(numeroUsuario);
        usuarioadm.setCnpjUsuarioAdm(cnpjUsuarioAdm);
        usuarioadm.setTipoUsuarioAdm(tipoUsuarioAdm);
        usuarioadm.setCodigoUsuario(codigoUsuario);

        try {

            GenericDAO dao = new UsuarioAdmDAOImpl();
            if (dao.cadastrar(usuarioadm)) {
                mensagem = "Formulário enviado com sucesso!";
            } else {
                mensagem = "Problemas ao enviar o formulário. Verifique os dados informados e tente novamente.";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("adquirir.jsp").forward(request, response);

        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao enviar formulário! Erro: " + ex.getMessage());
            ex.printStackTrace();
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
            Logger.getLogger(CadastrarUsuarioAdm.class
                    .getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(CadastrarUsuarioAdm.class
                    .getName()).log(Level.SEVERE, null, ex);
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

<% 
  HttpServletRequest httpServletRequest = (HttpServletRequest) request;

  HttpSession sessao = httpServletRequest.getSession();
  
  if (sessao.getAttribute("usuarioadm") != null){
%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AGROMUT</title>
        <meta name="description" content="AGROMUT">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="${pageContext.request.contextPath}/usuarioAdm/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <style>

            .botao-verde {
                color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                background-color: white;
            }

            .botao-verde:hover {
                background-color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                color: white;
            }

            .verde-fundo {
                background-color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                color: white;
            }

            .verde-fundo:hover{
                color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                background-color: white;
            }
        </style>
    </head>

    <jsp:include page="sidebar.jsp"/>

    <body>
        <!-- Content -->
        <div class="content">

            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="box-title">
                                ${message}
                            </h4>
                        </div>
                        <div class="card-body">
                            O que faremos hoje?
                            <hr>
                            <div class="row justify-content-around">
                                <div class="card text-center border-success" style="width: 18rem;">
                                    <div class="card-body">
                                        <div class="card-header">Funcionários</div>
                                        <div class="card-body">
                                            <p class="card-text">Cadastre e gerencie os integrantes da sua equipe.</p>
                                            <a href="${pageContext.request.contextPath}/usuarioAdm/cadastrarfuncionario.jsp" class="btn verde-fundo">Cadastrar</a>
                                        </div></div>
                                </div>

                                <div class="card text-center border-success" style="width: 18rem;">
                                    <div class="card-body">
                                        <div class="card-header">Produtos</div>
                                        <div class='card-body'>
                                            <p class="card-text">Controle total dos seus produtos a um click'.</p>
                                            <a href="${pageContext.request.contextPath}/usuarioAdm/cadastrarproduto.jsp" class="btn verde-fundo">Cadastrar</a>
                                        </div>
                                    </div>
                                </div>

                                <div class="card text-center border-success" style="width: 18rem;">
                                    <div class="card-body">
                                        <div class="card-header">Estufa</div>
                                        <div class="card-body">
                                            <p class="card-text">Gerencie suas estufas do modo eficiente e rápido.</p>
                                            <a href="${pageContext.request.contextPath}/usuarioAdm/cadastrarestufa.jsp" class="btn verde-fundo">Cadastrar</a>
                                        </div></div>
                                </div>

                            </div>
                        </div>
                    </div> <!-- /.card -->
                </div>
            </div>

            <jsp:include page="footer.jsp"/>

            <!-- Scripts -->
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
            <script src="usuarioAdm/assets/js/main.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>
    </body>
</html>

<% 
    } else {
        ((HttpServletResponse) response).sendRedirect("${pageContext.request.contextPath}/index.jsp");
    } 
%>
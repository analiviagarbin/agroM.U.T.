<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/usuarioAdm/assets/images/logoreduzida.png">
        <link href="assets/css/bootstrap.css" rel="stylesheet" type="text/css"/>

        <style>
            .verde-fundo {
                background-color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                color: white;
            }

            .verde-fundo:hover {
                background-color: white;
                border-color: rgb(23, 143, 43);
                color: rgb(23, 143, 43);
            }
        </style>

        <jsp:include page="sidebar.jsp"/>
    </head>
    <body>

        <div class="breadcrumbs">
            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Cadastrar</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li><a href="${pageContext.request.contextPath}/usuarioAdm/index.jsp">Produtos</a></li>
                                    <li class="active">Cadastrar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-10 pt-3 ps-lg-4">
                    ${mensagem}
                </div>
            </div>
        </div>
        <div class="content">

            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-header">
                            <strong>Cadastrar Produto</strong>
                        </div>
                        <div class="card-body card-block">
                            <p class="lead">
                            <form action="${pageContext.request.contextPath}/CadastrarProduto" method="POST" class="form-horizontal">
                                <input name="idUsuarioAdm" type="hidden" value="${sessionScope.idusuarioadm}">
                                <h6 class="mb-3">Dados do Produto</h6>
                                <div class="row form-group">
                                    <div class="col-6"><input type="text" placeholder="Descrição" class="form-control" name="descricaoProduto" MAXLENGTH=60></div>
                                    <div class="col-3">
                                        <select id="produto" name="especieProduto" class="form-select" aria-label="Default select example">
                                            <option selected>Espécie</option>
                                            <option value="Verdura">Verdura</option>
                                            <option value="Flor">Flor</option>
                                            <option value="Fruto">Fruto</option>
                                            <option value="Legume">Legume</option>
                                            <option value="Raiz">Raíz</option>
                                            <option value="Tuberculo">Tuberculo</option>
                                            <option value="Bulbo">Bulbo</option>
                                            <option value="Haste">Haste</option>
                                        </select> 
                                    </div>
                                    <div class="col-3 input-group">
                                        <input type="number" class="form-control"  placeholder="Quantidade" name="unidadeProduto">
                                    </div>
                                </div>
                                <hr>
                                <h6 class="mb-3">Cultivo</h6>
                                <div class="row form-group">
                                    <div class="col-4 input-group">
                                        <input type="text" class="form-control"  placeholder="Tempo de Cultivo (Dias)" name="tempocultivoProduto" required>
                                    </div>
                                    <div class="col-4 input-group">
                                        <input type="text" class="form-control"  placeholder="Temperatura de Cultivo (ºC)" name="temperaturaProduto" required>
                                    </div>
                                    <div class="col-4 input-group">
                                        <input type="text" class="form-control"  placeholder="Umidade de Cultivo (%)" name="umidadeProduto" required>
                                    </div>
                                </div>
                        </div>
                        <hr>
                        <button type="submit"class="btn ms-auto btn-sm verde-fundo">Cadastrar</button>
                        </form>
                    </div>
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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpServletRequest httpServletRequest = (HttpServletRequest) request;

    HttpSession sessao = httpServletRequest.getSession();

    if (sessao.getAttribute("usuarioadm") != null) {
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
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <style>
            .verde-fundo {
                background-color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                color: white;
            }

            .verde-fundo:hover {
                background-color: grey;
                border-color: grey;
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
                                    <li><a href="${pageContext.request.contextPath}/usuarioAdm/index.jsp">Estufas</a></li>
                                    <li class="active">Cadastrar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-10 pt-4 ps-lg-5">
                    ${mensagem}
                </div>
            </div>
        </div>
        <div class="content">

            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-header">
                            <strong>Cadastrar Estufa</strong>
                        </div>
                        <div class="card-body card-block">
                            <form action="${pageContext.request.contextPath}/CadastrarEstufa" method="POST" class="form-horizontal">
                                <input name="idUsuarioAdm" type="hidden" value="${sessionScope.idusuarioadm}">
                                <h6 class="mb-3">Dados da Estufa</h6>
                                <div class="row form-group">
                                    <div class="col-6"><input type="text" placeholder="Descrição" class="form-control" name="descricaoEstufa" MAXLENGTH=60></div>
                                    <div class="col-2"><input type="text" placeholder="Capacidade" class="form-control" name="capacidadeEstufa" MAXLENGTH=60></div>
                                    <div class="col-4">
                                        <tr>
                                            <th>Produto:</th>
                                            <td class="toclone">
                                                <select name="idProduto">
                                                    <c:forEach var="produto" items="${produtos}">
                                                        <option value="${produto.idProduto}">
                                                            ${produto.descricaoProduto}
                                                        </option>
                                                    </c:forEach>
                                                </select>
                                                <button type="button" class="add">+</button>
                                                <button type="button" class="remove">-</button>
                                            </td>
                                        </tr>
                                    </div>
                                </div>
                        </div>
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

            <script type="text/javascript">
                function adicionar() {
                    var ElementoClonado = $(this.parentNode).clone();
                    $('.wrapper').append(ElementoClonado);
                    $('.add').on("click", adicionar);
                    $('.remove').on("click", remover);
                    $(this).unbind("click");

                }
                function remover() {
                    $(this.parentNode).remove();
                }
                $('.add').on("click", adicionar);
                $('.remove').on("click", remover);
            </script>
    </body>
</html>

<%
    } else {
        ((HttpServletResponse) response).sendRedirect("${pageContext.request.contextPath}/index.jsp");
    }
%>
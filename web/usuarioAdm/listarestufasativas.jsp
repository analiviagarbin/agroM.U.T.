<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="br.com.agromut.model.Estufa"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AGROMUT</title>
        <meta name="description" content="AGROMUT">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/usuarioAdm/assets/images/logoreduzida.png">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/usuarioAdm/assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/usuarioAdm/assets/css/style.css">
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>
        <link href="https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/jqvmap@1.5.1/dist/jqvmap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/weathericons@2.1.0/css/weather-icons.css" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css" rel="stylesheet" />

        <style>
            #weatherWidget .currentDesc {
                color: #ffffff !important;
            }

            .traffic-chart {
                min-height: 335px;
            }

            #flotPie1 {
                height: 150px;
            }

            #flotPie1 td {
                padding: 3px;
            }

            #flotPie1 table {
                top: 20px !important;
                right: -10px !important;
            }

            .chart-container {
                display: table;
                min-width: 270px;
                text-align: left;
                padding-top: 10px;
                padding-bottom: 10px;
            }

            #flotLine5 {
                height: 105px;
            }

            #flotBarChart {
                height: 150px;
            }

            #cellPaiChart {
                height: 160px;
            }
        </style>
    </head>
    <body>
        <jsp:include page="sidebar.jsp"/>

        <!-- Content -->
        <div class="content">

            <!-- Orders -->
            <div class="orders">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <h4 class="box-title">Estufas Ativas</h4>
                            </div>
                            <div class="card-body--">
                                <div class="table-stats order-table ov-h">
                                    <table class="table ">
                                        <thead>
                                            <tr>
                                                <th class="serial">#</th>
                                                <th>Descrição</th>
                                                <th>Capacidade</th>
                                                <th>Inserir</th>
                                                <th>Status</th>
                                                <th> </th>
                                            </tr>
                                        </thead>
                                        <tbody>    
                                            <%
                                                List<Estufa> estufas = (List<Estufa>) request.getAttribute("estufas");
                                                for (Estufa estufa : estufas) {
                                            %>   

                                            <tr>
                                                <td class="serial"><%=estufa.getIdEstufa()%></td>
                                                <td class="serial"><%=estufa.getDescricaoEstufa()%></td>
                                                <td align="left"><%=estufa.getCapacidadeEstufa()%></td>
                                                <td>
                                                    <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#inserir" type="button">Inserir </button>
                                                </td>
                                                <td>
                                                    <a href="InativarEstufa?idestufa=<%=estufa.getIdEstufa()%>" class="button badge badge-danger">Inativar</a>
                                                </td>
                                                <td> </td>
                                            </tr>

                                            <%
                                                }
                                            %>

                                            <!-- Modal Inserir -->
                                        <div class="modal fade" id="inserir">
                                            <div class="modal-dialog modal-dialog-centered">
                                                <div class="modal-content">
                                                    <div class="modal-body">
                                                        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                                        <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                                                            <div class="col-lg-12 py-1">
                                                                <h1 class="display-6 fw-bold lh-1 mb-3 texto">
                                                                    Inserir Produto
                                                                </h1>
                                                                <hr class="verde">
                                                                <p class="lead">
                                                                <form method="POST" action="CadastrarProducao" autocomplete="off">
                                                                    <div class="mb-3">
                                                                        <div class="mb-2 w-100">
                                                                            <label class="text-muted" for="produto">Produto:</label>
                                                                        </div>
                                                                        <select name="idProduto">
                                                                            <c:forEach var="produto" items="${nomeprodutos}">
                                                                                <option value="${produto.idProduto}">
                                                                                    ${produto.descricaoProduto}
                                                                                </option>
                                                                                </c:forEach>
                                                                        </select>
                                                                    </div>

                                                                    <div class="mb-3">
                                                                        <div class="mb-2 w-100">
                                                                            <label class="text-muted" for="senha">Data plantio:</label>
                                                                        </div>
                                                                        <input type="date" class="form-control" name="dataPlantioProducao" required>
                                                                    </div>

                                                                    <input name="idEstufa" type="text" value="${estufa.idEstufa}">
                                                                    
                                                                    <div class="d-flex align-items-center">
                                                                        <button type="submit" class="btn btn-dark ms-auto verde-fundo">
                                                                            Inserir
                                                                        </button>
                                                                    </div>
                                                                </form>
                                                            </div>
                                                        </div>
                                                    </div>

                                                </div>
                                            </div>
                                        </div>

                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <jsp:include page="footer.jsp"/>

            <!-- Scripts -->
            <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
            <script src="usuarioAdm/assets/js/main.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>
    </body>
</html>
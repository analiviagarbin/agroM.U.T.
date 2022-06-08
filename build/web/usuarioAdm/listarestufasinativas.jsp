<%@page import="br.com.agromut.model.Estufa"%>
<%@page import="java.util.List"%>
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
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="assets/js/bootstrap.min.js" type="text/javascript"></script>

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
                                <h4 class="box-title">Estufas </h4>
                            </div>
                            <div class="card-body--">
                                <div class="table-stats order-table ov-h">
                                    <table class="table ">
                                        <thead>
                                            <tr>
                                                <th class="serial">#</th>
                                                <th>Descrição </th>
                                                <th>Capacidade </th>
                                                <th>Produto </th>
                                                <th>Temperatura Atual </th>
                                                <th>Umidade Atual </th>
                                                <th>Status </th>
                                                <th>Alterar </th>
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
                                                <td align="center"><%=estufa.getCapacidadeEstufa()%></td>
                                                <td align="center">Produto<%=estufa.getCapacidadeEstufa()%></td>
                                                <td>
                                                    <button class="btn" data-bs-toggle="modal" data-bs-target="#temperatura" type="button">Monitorar</button>
                                                </td>
                                                <td>
                                                    <button class="btn" data-bs-toggle="modal" data-bs-target="#umidade" type="button">Monitorar</button>
                                                </td>
                                                <td>
                                                    <a href="AtivarEstufa?idestufa=<%=estufa.getIdEstufa()%>" class="button badge badge-danger">Ativar</a>
                                                </td>
                                                <td align="center">
                                                    <a href="CarregarEstufa?idEstufa=<%=estufa.getIdEstufa()%>" class="button badge badge-primary">Alterar</a>
                                                </td>
                                            </tr>
                                            
                                            <% 
                                                }
                                            %>

                                        <!-- Modal Monitorar Temp -->
                                        <div class="modal fade" id="temperatura">
                                            <div class="modal-dialog modal-dialog-centered modal-xl">
                                                <div class="modal-content">
                                                    <div class="modal-body">
                                                        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                                        <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                                                            <div class="col-lg-12">
                                                                Aqui
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        
                                        <!-- Modal Monitoramento Umidade -->
                                        <div class="modal fade" id="umidade">
                                            <div class="modal-dialog modal-dialog-centered modal-xl">
                                                <div class="modal-content">
                                                    <div class="modal-body">
                                                        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                                        <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                                                            <div class="col-lg-12">
                                                                Aqui
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
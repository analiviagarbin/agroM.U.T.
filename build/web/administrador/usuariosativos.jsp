<%@page import="br.com.agromut.model.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="br.com.agromut.model.UsuarioAdm"%>
<%@page import="br.com.agromut.model.UsuarioAdm"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
  HttpServletRequest httpServletRequest = (HttpServletRequest) request;

  HttpSession sessao = httpServletRequest.getSession();
  
  if (sessao.getAttribute("administrador") != null){
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AGROMUT</title>
        <meta name="description" content="AGROMUT">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="images/logoreduzida.png">
        <link rel="shortcut icon" href="images/logoreduzida.png">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/administrador/assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/administrador/assets/css/style.css">
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
            <!-- Animated -->
            <div class="animated fadeIn">

                <!-- Orders -->
                <div class="orders">
                    <div class="row">
                        <div class="col-lg-12">
                            <div class="card">
                                <div class="card-body">
                                    <h4 class="box-title">Usuários Ativos </h4>
                                </div>
                                <div class="card-body--">
                                    <div class="table-stats order-table ov-h">
                                        <table class="table ">
                                            <thead>
                                                <tr>
                                                    <th>ID</th>
                                                    <th>Nome </th>
                                                    <th>CPF </th>
                                                    <th>CNPJ </th>
                                                    <th>E-mail </th>
                                                    <th>Telefone </th>
                                                    <th>Status </th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <!-- LIST FUNCIONARIOS-->
                                                <%
                                                    List<UsuarioAdm> usuariosAdm = (List<UsuarioAdm>) request.getAttribute("usuariosAdm");
                                                    for (UsuarioAdm usuarioAdm : usuariosAdm) {
                                                %>  

                                                <tr>
                                                    <td class="serial"><%=usuarioAdm.getIdUsuarioAdm()%></td>
                                                    <td align="left"><%=usuarioAdm.getNomeUsuario()%></td>
                                                    <td align="left"><%=usuarioAdm.getCpfUsuario()%></td>
                                                    <td align="left"><%=usuarioAdm.getCnpjUsuarioAdm()%></td>
                                                    <td align="left"><%=usuarioAdm.getEmailUsuario()%></td>
                                                    <td align="left"><%=usuarioAdm.getCelularUsuario()%></td>
                                                    <td>
                                                        <a href="InativarAdm?idusuarioadm=<%=usuarioAdm.getIdUsuarioAdm()%>" class="button badge badge-danger">Inativar</a>
                                                    </td>
                                                </tr>

                                                <%
                                                    }
                                                %>
                                                
                                            </tbody>
                                        </table>
                                    </div> <!-- /.table-stats -->
                                </div>
                            </div> <!-- /.card -->
                        </div> <!-- /.col-lg-8 -->
                    </div>
                </div>
            </div>

            <jsp:include page="footer.jsp"/>

            <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
            <script src="${pageContext.request.contextPath}/administrador/assets/js/main.js"></script>
    </body>
</html>
<%
    } else {
        ((HttpServletResponse) response).sendRedirect("index.jsp");
    }
%>
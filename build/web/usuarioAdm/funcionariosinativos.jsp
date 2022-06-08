<%@page import="br.com.agromut.model.Usuario"%>
<%@page import="br.com.agromut.model.UsuarioFunc"%>
<%@page import="java.util.List"%>
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
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/usuarioAdm/assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/usuarioAdm/assets/css/style.css">
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
                                    <h4 class="box-title">Funcionários Inativos</h4>
                                </div>
                                <div class="card-body--">
                                    <div class="table-stats order-table ov-h">
                                        <table class="table ">
                                            <thead>
                                                <tr>
                                                    <th class="serial">#</th>
                                                    <th>Nome </th>
                                                    <th>CPF </th>
                                                    <th>Celular </th>
                                                    <th>Salário </th>
                                                    <th>Status </th>
                                                    <th>Alterar </th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                            <%
                                                List<UsuarioFunc> usuariosFunc = (List<UsuarioFunc>) request.getAttribute("usuariosFunc");
                                                for (UsuarioFunc usuarioFunc : usuariosFunc) {
                                            %>  

                                            <tr>
                                                <td class="serial"><%=usuarioFunc.getIdUsuarioFunc()%></td>
                                                <td align="left"><%=usuarioFunc.getNomeUsuario()%></td>
                                                <td align="left"><%=usuarioFunc.getCpfUsuario()%></td>
                                                <td align="left"><%=usuarioFunc.getEmailUsuario()%></td>
                                                <td align="left"><%=usuarioFunc.getCelularUsuario()%></td>
                                                <td align="left">
                                                    <a href="AtivarFunc?idusuariofunc=<%=usuarioFunc.getIdUsuarioFunc()%>" class="button badge badge-complete">Ativar</a>
                                                </td>
                                                <td align="left">
                                                    <a href="AlterarFunc?idusuariofunc=<%=usuarioFunc.getIdUsuarioFunc()%>" class="button badge badge-success">Alterar</a>
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

<% 
    } else {
        ((HttpServletResponse) response).sendRedirect("${pageContext.request.contextPath}/index.jsp");
    } 
%>
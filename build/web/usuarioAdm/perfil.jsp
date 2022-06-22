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
        <link rel="shortcut icon" href="usuarioAdm/assets/images/logoreduzida.png">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <script src="https://kit.fontawesome.com/1544a7a0d3.js" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="usuarioAdm/assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="usuarioAdm/assets/css/style.css">
        <link href="https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/jqvmap@1.5.1/dist/jqvmap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/weathericons@2.1.0/css/weather-icons.css" rel="stylesheet" />
        <link href="https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css" rel="stylesheet" />

        <style>
            .verde-fundo {
                background-color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                color: white;
            }

            .verde-fundo:hover {
                color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                background-color: white;
            }

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
            body {
                background-color: #f9f9fa
            }

            .padding {
                padding: 3rem !important
            }

            .user-card-full {
                overflow: hidden;
            }

            .card {
                border-radius: 5px;
                -webkit-box-shadow: 0 1px 20px 0 rgba(69,90,100,0.08);
                box-shadow: 0 1px 20px 0 rgba(69,90,100,0.08);
                border: none;
                margin-bottom: 30px;
            }

            .m-r-0 {
                margin-right: 0px;
            }

            .m-l-0 {
                margin-left: 0px;
            }

            .user-card-full .user-profile {
                border-radius: 5px 0 0 5px;
            }

            .bg-c-lite-green {
                background: linear-gradient(45deg, #178f2b, #8dfc17);
            }

            .user-profile {
                padding: 20px 0;
            }

            .card-block {
                padding: 1.25rem;
            }

            .m-b-25 {
                margin-bottom: 25px;
            }

            .img-radius {
                border-radius: 5px;
            }



            h6 {
                font-size: 14px;
            }

            .card .card-block p {
                line-height: 25px;
            }

            @media only screen and (min-width: 1400px){
                p {
                    font-size: 14px;
                }
            }

            .card-block {
                padding: 1.25rem;
            }

            .b-b-default {
                border-bottom: 1px solid #e0e0e0;
            }

            .m-b-20 {
                margin-bottom: 20px;
            }

            .p-b-5 {
                padding-bottom: 5px !important;
            }

            .card .card-block p {
                line-height: 25px;
            }

            .m-b-10 {
                margin-bottom: 10px;
            }

            .text-muted {
                color: #919aa3 !important;
            }

            .b-b-default {
                border-bottom: 1px solid #e0e0e0;
            }

            .f-w-600 {
                font-weight: 600;
            }

            .m-b-20 {
                margin-bottom: 20px;
            }

            .m-t-40 {
                margin-top: 20px;
            }

            .p-b-5 {
                padding-bottom: 5px !important;
            }

            .m-b-10 {
                margin-bottom: 10px;
            }

            .m-t-40 {
                margin-top: 20px;
            }

            .user-card-full .social-link li {
                display: inline-block;
            }

            .user-card-full .social-link li a {
                font-size: 20px;
                margin: 0 10px 0 0;
                -webkit-transition: all 0.3s ease-in-out;
                transition: all 0.3s ease-in-out;
            }
        </style>
    </head>
    <body>

        <jsp:include page="sidebar.jsp"/>

        <div class="content">

            <div class="breadcrumbs-inner">
                <div class="row m-0">
                    <div class="col-sm-4">
                        <div class="page-header float-left">
                            <div class="page-title">
                                <h1>Alterar</h1>
                            </div>
                        </div>
                    </div>
                    <div class="col-sm-8">
                        <div class="page-header float-right">
                            <div class="page-title">
                                <ol class="breadcrumb text-right">
                                    <li class="inative"><a href="${pageContext.request.contextPath}/usuarioAdm/index.jsp">Perfil</a></li>
                                    <li class="active">Alterar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <hr>
            <div class="row container d-flex m-auto">
                <div class="col-xl-12 col-md-12">
                    <div class="card user-card-full">
                        <div class="row m-l-0 m-r-0">
                            <div class="col-sm-4 bg-c-lite-green user-profile">
                                <div class="card-block text-center text-white">
                                    <div class="m-b-25">
                                        <img src="${pageContext.request.contextPath}/usuarioAdm/assets/images/user.png" class="user-avatar rounded-circle bg-white" height="100px" alt="User-Profile-Image">
                                    </div>
                                    <h6 class="f-w-600">${usuarioadm.nomeUsuario}</h6>
                                    <i class=" mdi mdi-square-edit-outline feather icon-edit m-t-10 f-16"></i>
                                </div>
                            </div>
                            <div class="col-sm-8">
                                <div class="card-block">
                                    <form action="${pageContext.request.contextPath}/AlterarUsuarioAdm" method="POST" class="form-horizontal">
                                        <h6 class="m-b-20 p-b-5 b-b-default f-w-600">Dados Pessoais</h6>
                                        <div class="row">
                                            <div class="col-sm-12">
                                                <div class="col-12 m-0 p-0 align-content-center"><input type="text" id="text-input" name="nomeUsuario" value="${usuarioperfil.nomeUsuario}" class="form-control"></div>
                                            </div>
                                        </div>
                                        <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600">Endereço</h6>
                                        <div class="row">
                                            <div class="col-2 m-0 pe-1"><input type="text" id="text-input" name="ufUsuario" value="${usuarioperfil.ufUsuario}" class="form-control"></div>
                                            <div class="col-3 m-0 pe-1"><input type="text" id="text-input" name="cepUsuario" value="${usuarioperfil.cepUsuario}" class="form-control"></div>
                                            <div class="col-4 m-0 pe-1"><input type="text" id="text-input" name="cidadeUsuario" value="${usuarioperfil.cidadeUsuario}" class="form-control"></div>
                                            <div class="col-3 m-0 pe-1"><input type="text" id="text-input" name="bairroUsuario" value="${usuarioperfil.bairroUsuario}" class="form-control"></div>
                                            <div class="col-8 m-0 pe-1 pt-2"><input type="text" id="text-input" name="ruaUsuario" value="${usuarioperfil.ruaUsuario}" class="form-control"></div>
                                            <div class="col-4 m-0 pe-1 pt-2"><input type="text" id="text-input" name="numUsuario" value="${usuarioperfil.numUsuario}" class="form-control"></div>
                                        </div>
                                        <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600">Contato</h6>
                                        <div class="row">
                                            <div class="col-8 m-0 pe-1"><input type="text" id="text-input" name="emailUsuario" value="${usuarioperfil.emailUsuario}" class="form-control"></div>
                                            <div class="col-4 m-0 pe-1"><input type="text" id="text-input" name="celularUsuario" value="${usuarioperfil.celularUsuario}" class="form-control"></div>
                                        </div>
                                        <h6 class="m-b-20 m-t-40 p-b-5 b-b-default f-w-600"> </h6>
                                        <div class="row">
                                            <div class="col-8 m-0 pe-1"><input type="text" id="text-input" name="loginUsuario" value="${usuarioperfil.loginUsuario}" class="form-control"></div>
                                            <div class="col-4 m-0 pe-1"><input type="text" id="text-input" name="senhaUsuario" value="${usuarioperfil.senhaUsuario}" class="form-control"></div>
                                            <input type="hidden" id="text-input" name="idUsuario" value="${usuarioperfil.idUsuario}" class="form-control">
                                        </div>
                                        <br>
                                        <button type="submit" class="btn ms-auto btn-sm verde-fundo">Alterar e Sair</button>
                                    </form>
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

    </body>
</html>
<% 
    } else {
        ((HttpServletResponse) response).sendRedirect("${pageContext.request.contextPath}/index.jsp");
    }
%>
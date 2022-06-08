<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AGROMUT</title>
        <meta name="description" content="AGROMUT">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="https://i.imgur.com/QRAUqs9.png">
        <link rel="shortcut icon" href="https://i.imgur.com/QRAUqs9.png">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css">
        <link rel="stylesheet" href="assets/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="assets/css/style.css">
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
    </head>>
    <body>
        <jsp:include page="navbar.jsp"/>

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
                                    <li><a href="#">Funcionários</a></li>
                                    <li class="active">Cadastrar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="content">
            <div class="animated fadeIn">


                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-header">
                                <strong>Cadastrar Funcionário</strong>
                            </div>
                            <div class="card-body card-block">
                                <form action="#" method="post" enctype="multipart/form-data" class="form-horizontal">

                                    <h6 class="mb-3">Dados Pessoais</h6>
                                    <div class="row form-group">
                                        <div class="col-8"><input type="text" placeholder="Nome" class="form-control"></div>
                                        <div class="col-2 input-group">
                                            <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                            <input type="date" class="form-control">
                                        </div>
                                        <div class="col-2"><input type="text" placeholder="CPF" class="form-control"></div>
                                    </div>
                                    <hr>
                                    <h6 class="mb-3">Endereço</h6>
                                    <div class="row form-group">
                                        <div class="col-1"><input type="text" id="text-input" name="text-input" placeholder="UF" class="form-control"></div>
                                        <div class="col-2"><input type="text" id="text-input" name="text-input" placeholder="CEP" class="form-control"></div>
                                        <div class="col-3"><input type="text" id="text-input" name="text-input" placeholder="Cidade" class="form-control"></div>
                                        <div class="col-2"><input type="text" id="text-input" name="text-input" placeholder="Bairro" class="form-control"></div>
                                        <div class="col-3"><input type="text" id="text-input" name="text-input" placeholder="Rua" class="form-control"></div>
                                        <div class="col-1"><input type="text" id="text-input" name="text-input" placeholder="Nº" class="form-control"></div>
                                    </div>
                                    <hr>
                                    <h6 class="mb-3">Contato</h6>
                                    <div class="row form-group">
                                        <div class="col-8"><input type="email" id="email-input" name="email-input" placeholder="E-mail" class="form-control"></div>
                                        <div class="col-4"><input type="text" id="email-input" name="text-input" placeholder="Telefone" class="form-control"></div>
                                    </div>
                                    <hr>
                                    <div class="row form-group">
                                        <div class="col-8"><input type="text" id="text-input" name="text-input" placeholder="Login" class="form-control"></div>
                                        <div class="col-4"><input type="password" id="password-input" name="password-input" placeholder="Senha" class="form-control"><small class="help-block form-text">Mínimo de 8 dígitos</small></div>
                                    </div>
                                    <button type="submit" class="btn btn-primary btn-sm">Cadastrar</button>
                                </form>
                            </div>
                        </div>
                    </div>


                </div><!-- .animated -->
            </div>

            <jsp:include page="footer.jsp"/>

            <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
            <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
            <script src="assets/js/main.js"></script>
    </body>
</html>

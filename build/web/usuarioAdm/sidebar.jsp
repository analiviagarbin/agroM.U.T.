<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AGROMUT</title>
    <meta name="description" content="AGROMUT">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="shortcut icon" href="usuarioAdm/assets/images/logoreduzida.png">

    <!-- CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/usuarioAdm/assets/css/cs-skin-elastic.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/usuarioAdm/assets/css/style.css">

    <!-- Scripts -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js"></script>
    <script src="assets/js/main.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js"></script>

    <script src="https://kit.fontawesome.com/1544a7a0d3.js" crossorigin="anonymous"></script>

    <style>
        .verde {
            color: rgb(23, 143, 43);
        }
    </style>

</head>

<body>
    <!-- Left Panel -->
    <aside id="left-panel" class="left-panel">
        <nav class="navbar navbar-expand-sm navbar-default">
            <div id="main-menu" class="main-menu collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active">
                        <a href="${pageContext.request.contextPath}/usuarioAdm/index.jsp"><i class="menu-icon"></i>Painel Administrador</a>
                    </li>

                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false"><i class="menu-icon fa fa-people-group"></i><b>FUNCIONÁRIOS</b></a>
                        <ul class="sub-menu children dropdown-menu">
                            <li>
                                <i class="menu-icon fa fa-plus-square-o"></i><a href="${pageContext.request.contextPath}/usuarioAdm/cadastrarfuncionario.jsp"> Cadastrar </a>
                            </li>
                            <li>
                                <i class="menu-icon fa fa-list-check"></i><a href="${pageContext.request.contextPath}/ListarUsuarioFuncT"> Listar Ativos </a>
                            </li>
                            <li>
                                <i class="menu-icon fa fa-list-check"></i><a href="${pageContext.request.contextPath}/ListarUsuarioFuncF"> Listar Inativos </a>
                            </li>

                        </ul>
                    </li>

                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false"><i class="menu-icon fa fa-leaf"></i><b>PRODUTOS</b></a>
                        <ul class="sub-menu children dropdown-menu">
                            <li>
                                <i class="menu-icon fa fa-plus-square-o"></i><a href="${pageContext.request.contextPath}/usuarioAdm/cadastrarproduto.jsp"> Cadastrar </a>
                            </li>
                            <li>
                                <i class="menu-icon fa fa-edit"></i><a href="${pageContext.request.contextPath}/ListarProdutoT"> Listar Ativos </a>
                            </li>
                            <li>
                                <i class="menu-icon fa fa-edit"></i><a href="${pageContext.request.contextPath}/ListarProdutoF"> Listar Inativos </a>
                            </li>
                        </ul>
                    </li>

                    <li class="menu-item-has-children dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false"><i class="menu-icon fa fa-warehouse"></i><b>ESTUFAS</b></a>
                        <ul class="sub-menu children dropdown-menu">
                            <li>
                                <i class="menu-icon fa fa-plus-square-o"></i><a href="${pageContext.request.contextPath}/usuarioAdm/cadastrarestufa.jsp"> Cadastrar </a>
                            </li>
                            <li>
                                <i class="menu-icon fa fa-edit"></i><a href="${pageContext.request.contextPath}/ListarEstufaT"> Listar Ativos </a>
                            </li>
                            <li>
                                <i class="menu-icon fa fa-edit"></i><a href="${pageContext.request.contextPath}/ListarEstufaF"> Listar Inativos </a>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div><!-- /.navbar-collapse -->
        </nav>
    </aside>
    <!-- /#left-panel -->

    <!-- Right Panel -->
    <div id="right-panel" class="right-panel">
        <!-- Header-->
        <header id="header" class="header">
            <div class="top-left">
                <div class="navbar-header">
                    <a class="navbar-brand" href="./"><img src="${pageContext.request.contextPath}/usuarioAdm/assets/images/agromut.png" alt="Logo"
                                                           style="width: 120px;"></a>
                    <a class="navbar-brand hidden" href="./"><img src="${pageContext.request.contextPath}/usuarioAdm/assets/images/agromut.png" alt="Logo"></a>
                    <a id="menuToggle" class="menutoggle"><i class="fa fa-bars"></i></a>
                </div>
            </div>
            <div class="top-right">
                <div class="header-menu">

                    <div class="user-area dropdown float-right">
                        <a href="#" class="dropdown-toggle active" data-toggle="dropdown" aria-haspopup="true"
                           aria-expanded="false">
                            <img class="user-avatar rounded-circle" src="${pageContext.request.contextPath}/usuarioAdm/assets/images/user.png" alt="User Avatar">
                        </a>

                        <div class="user-menu dropdown-menu">
                            <a class="nav-link" href="${pageContext.request.contextPath}/CarregarUsuarioAdm?idUsuarioAdm=${usuarioadm.idUsuario}"><i class="fa fa- user"></i>Perfil</a>

                            <a class="nav-link" href="${pageContext.request.contextPath}/EncerrarSessao"><i class="fa fa-power -off"></i>Sair</a>
                        </div>
                    </div>

                </div>
            </div>
        </header>
        <!-- /#header -->

</body>
</html>

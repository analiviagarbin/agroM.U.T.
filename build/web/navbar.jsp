<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGROMUT</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        
        <style>

            .verde-fundo {
                background-color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                color: white;
            }

            .verde-fundo:focus {
                color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                background-color: white;
            }

            .verde-fundo:hover {
                color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
                background-color: white;
            }
            
            .options:hover{
                background-color: rgb(23, 143, 43);
                color: white;
            }

        </style>

    </head>

    <body>
        <div class="container-fluid">
            <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-between py-3 mb-4 border-bottom">

                <a href="index.jsp" class="d-flex align-items-center col-md-2 mb-2 mb-md-0 text-dark text-decoration-none ps-5">
                    <img src="assets/images/agromut.png"  width="200">
                </a>

                <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0 ps-5">
                    <li><a href="index.jsp" class="nav-link px-2 link-dark verde">Início</a></li>
                    <li><a href="#" class="nav-link px-2 link-dark verde">Arduíno</a></li>
                    <li><a href="adquirir.jsp" class="nav-link px-2 link-dark verde">Adquirir</a></li>
                </ul>


                <div class="dropdown col-sm-3 text-end pe-3">
                    <button class="btn btn-secondary dropdown-toggle me-2 verde-fundo" type="button" id="dropdownMenu2" data-bs-toggle="dropdown" aria-expanded="false">
                        Entrar
                    </button>
                    <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
                        <li><button class="dropdown-item options" type="button" data-bs-toggle="modal"
                                    data-bs-target="#loginAdm">Administrador</button></li>
                        <li><button class="dropdown-item options" type="button" data-bs-toggle="modal"
                                    data-bs-target="#loginFunc">Funcionário</button></li>
                    </ul>
                </div>

                <!-- Modal Adm -->
                <div class="modal fade" id="loginAdm">
                    <div class="modal-dialog modal-dialog-centered modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                                    <div class="col-lg-6 me-md-3">
                                        <h1 class="display-6 fw-bold lh-1 mb-3 texto">
                                            Entrar
                                        </h1>
                                        <hr class="verde">
                                        ${menssage}
                                        <p class="lead">
                                        <form method="POST" action="LoginUsuarioAdm" autocomplete="off">
                                            <div class="mb-3">
                                                <label class="mb-2 text-muted" for="text">Login:</label>
                                                <input id="text" type="text" class="form-control" name="loginUsuario" value="" required
                                                       autofocus MAXLENGTH=20>
                                            </div>

                                            <div class="mb-3">
                                                <div class="mb-2 w-100">
                                                    <label class="text-muted" for="senha">Senha:</label>
                                                </div>
                                                <input id="senha" type="password" class="form-control" name="senhaUsuario" required MINLENGTH=8 MAXLENGTH=20>
                                            </div>

                                            <div class="d-flex align-items-center">
                                                <button type="submit" class="btn btn-dark ms-auto verde-fundo">
                                                    Entrar
                                                </button>
                                            </div>
                                        </form>
                                        <br />
                                        <div class="text-center">
                                            Não tem uma conta? <a href="adquirir.jsp" class="text verde">Adquirir</a>
                                        </div>
                                    </div>
                                    <div class="col-lg-5 me-md-3">
                                        <img src="assets/images/agromut.png" width="150">
                                        <br />
                                        <br />
                                        <br />
                                        <h1 class="display-5 fw-bold lh-1 mb-3 texto">
                                            Seja bem-vindo
                                            <br />
                                            de volta!
                                        </h1>
                                        <br />
                                        <br />
                                        <br />
                                        <br />
                                        <br />
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                                        
                <!-- Modal Func -->
                <div class="modal fade" id="loginFunc">
                    <div class="modal-dialog modal-dialog-centered modal-xl">
                        <div class="modal-content">
                            <div class="modal-body">
                                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                                    <div class="col-lg-6 me-md-3">
                                        <h1 class="display-6 fw-bold lh-1 mb-3 texto">
                                            Entrar
                                        </h1>
                                        <hr class="verde">
                                        ${messag}
                                        <p class="lead">
                                        <form method="POST" action="LoginUsuarioFunc" autocomplete="off">
                                            <div class="mb-3">
                                                <label class="mb-2 text-muted" for="text">Login:</label>
                                                <input id="text" type="text" class="form-control" name="loginUsuario" value="" required
                                                       autofocus MAXLENGTH=20>
                                            </div>

                                            <div class="mb-3">
                                                <div class="mb-2 w-100">
                                                    <label class="text-muted" for="senha">Senha:</label>
                                                </div>
                                                <input id="senha" type="password" class="form-control" name="senhaUsuario" required MINLENGTH=8 MAXLENGTH=20>
                                            </div>

                                            <div class="d-flex align-items-center">
                                                <button type="submit" class="btn btn-dark ms-auto verde-fundo">
                                                    Entrar
                                                </button>
                                            </div>
                                        </form>
                                        <br />
                                    </div>
                                    <div class="col-lg-5 me-md-3">
                                        <img src="assets/images/agromut.png" width="150">
                                        <br />
                                        <br />
                                        <br />
                                        <h1 class="display-5 fw-bold lh-1 mb-3 texto">
                                            Olá! O que 
                                            <br />
                                            faremos hoje?
                                        </h1>
                                        <br />
                                        <br />
                                        <br />
                                        <br />
                                        <br />
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                </body>
            </header>
        </div>
    </body>
</html>

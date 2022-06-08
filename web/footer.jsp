<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGROMUT</title><link rel="stylesheet"
        href="https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css">
        
    </head>
    
    <style>
        
        .texto-link{
            color: black;
        }
        
        .texto-link:hover{
            color: black;
        }
        
    </style>
    
    <body>

        <div class="container-fluid">
            <footer class="d-flex flex-wrap justify-content-between align-items-center py-2 my-4 border-top">
                <div class="col-md-4 d-flex align-items-center ps-5 pt-3 ">
                    <a href="index.jsp" class="mb-3 me-2 mb-md-0 text-muted text-decoration-none lh-1">
                        <img src="assets/images/logoreduzida.png" width="30" height="24" />
                    </a>
                    <span class="text-muted">&copy; 2022 AGROMUT</span>
                </div>
                
                <div class="col-md-4 d-flex justify-content-end list-unstyled d-flex px-5 pt-3">
                    <span><a href="#" class="me-2 mb-md-0 texto-link text-decoration-none lh-1" data-bs-toggle="modal"
                            data-bs-target="#loginAdministrador"> Área Restrita</a></span>
                    <div class="input-group-addon"><i class="fa fa-lock"></i></div>
                </div>
            </footer>
        </div>

                <!-- The Modal -->
                <div class="modal fade" id="loginAdministrador">
                    <div class="modal-dialog modal-dialog-centered">
                        <div class="modal-content">
                            <div class="modal-body">
                                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                                <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                                    <div class="col-lg-12 py-1">
                                        <h1 class="display-6 fw-bold lh-1 mb-3 texto">
                                            Entrar
                                        </h1>
                                        <hr class="verde">
                                        <p class="lead">
                                        <form method="POST" action="LoginAdm" autocomplete="off">
                                            <div class="mb-3">
                                                <label class="mb-2 text-muted" for="login">Login:</label>
                                                <input id="login" type="text" class="form-control" name="loginAdministrador" value="" required
                                                       autofocus MAXLENGTH=20>
                                            </div>

                                            <div class="mb-3">
                                                <div class="mb-2 w-100">
                                                    <label class="text-muted" for="senha">Senha:</label>
                                                </div>
                                                <input id="senha" type="password" class="form-control" name="senhaAdministrador" required MAXLENGTH=20>
                                            </div>

                                            <div class="d-flex align-items-center">
                                                <button type="submit" class="btn btn-dark ms-auto verde-fundo">
                                                    Entrar
                                                </button>
                                            </div>
                                        </form>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
        
    </body>
</html>

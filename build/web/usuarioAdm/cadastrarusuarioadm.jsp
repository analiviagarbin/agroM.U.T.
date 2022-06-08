<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>AGROMUT</title>
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/logoreduzida.png">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap-grid.min.css" rel="stylesheet" type="text/css"/>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="usuarioAdm/assets/js/jquery-1.2.6.pack.js" type="text/javascript"></script>
        <script src="usuarioAdm/assets/js/jquery.maskedinput-1.1.4.pack.js" type="text/javascript"></script>

        
        <!-- MÁSCARAS FORMS -->
        <script type="text/javascript">
            $(document).ready(function () {
                $("#cpf").mask("999.999.999-99");
            });
            
            $(document).ready(function () {
                $("#cnpj").mask("99.999.999/9999-99");
            });
            
            $(document).ready(function () {
                $("#cep").mask("99999-999");
            });
            
            $(document).ready(function () {
                $("#celular").mask("(99) 99999-9999");
            });
        </script>

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

            .botao-verde {
                color: rgb(23, 143, 43);
                border-color: rgb(23, 143, 43);
            }

            .verde {
                color: rgb(23, 143, 43);
            }

            .verde:hover {
                color: rgb(141, 252, 23);
            }

            .texto{
                color: cmyk(0,0, 0, 100);
            }
        </style>

    </head>

    <body>

        <div class="container col-xxl-12 px-4 py-6">
            <div class="row flex-lg-row-reverse align-items-center g-5">
                <div class="content">
                    <div class="align-items-center">
                        <div class="row flex-lg-row-reverse g-5 py-5">
                            <div class="col-lg-10 mx-auto">
                                <h1 class="display-6 fw-bold lh-1 mb-3 text-center texto">
                                    Pré-Cadastro
                                </h1>
                                <hr class="verde">
                                <p class="lead">
                                    ${mensagem}
                                <form name="cadastrarusuarioadm" action="${pageContext.request.contextPath}/CadastrarUsuarioAdm" method="POST" class="form-horizontal">
                                    <h6 class="mb-3">Dados Pessoais</h6>
                                    <div class="row form-group">
                                        <div class="col-9"><input type="text" placeholder="Nome" class="form-control" name="nomeUsuario" required MAXLENGTH=60></div>
                                        <div class="col-3">
                                            <input type="date" class="form-control" name="datanascUsuario" required min="1900-01-01" max="2020-12-31">
                                            <small class="help-block form-text">Data de nascimento</small>
                                        </div>
                                        <p>
                                        <div class="col-2">
                                            <label for="select1" class="form-check-label select">
                                                <input type="radio" id="select1" name="tipoUsuarioAdm" value="1" class="form-check-input" required> Pessoa Física
                                            </label>
                                        </div>
                                        <div class="col-3">
                                            <label for="select2" class="form-check-label select">
                                                <input type="radio" id="select2" name="tipoUsuarioAdm" value="2" class="form-check-input" required> Pessoa Jurídica
                                            </label>
                                        </div>

                                        <div class="col-3"><input type="text" id="cpf" placeholder="CPF" class="form-control" name="cpfUsuario" MAXLENGTH=13></div>
                                        <div class="col-4"><input type="text" id="cnpj" placeholder="CNPJ" class="form-control" name="cnpjUsuarioAdm" MAXLENGTH=14></div>
                                    </div>
                                    <hr>
                                    <h6 class="mb-3">Endereço</h6>
                                    <div class="row form-group">
                                        <div class="col-1"><input type="text" id="text-input" name="ufUsuario" placeholder="UF" class="form-control" required MAXLENGTH=2></div>
                                        <div class="col-2"><input type="text" id="cep" name="cepUsuario" placeholder="CEP" class="form-control" required MAXLENGTH=9></div>
                                        <div class="col-3"><input type="text" id="text-input" name="cidadeUsuario" placeholder="Cidade" class="form-control" required></div>
                                        <div class="col-2"><input type="text" id="text-input" name="bairroUsuario" placeholder="Bairro" class="form-control" required></div>
                                        <div class="col-3"><input type="text" id="text-input" name="ruaUsuario" placeholder="Rua" class="form-control" required></div>
                                        <div class="col-1"><input type="text" id="text-input" name="numUsuario" placeholder="Nº" class="form-control" required></div>
                                    </div>
                                    <hr>
                                    <h6 class="mb-3">Contato</h6>
                                    <div class="row form-group">
                                        <div class="col-8"><input type="email" id="email-input" name="emailUsuario" placeholder="E-mail" class="form-control" required></div>
                                        <div class="col-4"><input type="text" id="celular" name="celularUsuario" placeholder="Celular" class="form-control" required></div>
                                    </div>
                                    <hr>
                                    <div class="row form-group">
                                        <div class="col-8"><input type="text" id="text-input" name="loginUsuario" placeholder="Login" class="form-control" required MAXLENGTH=20></div>
                                        <div class="col-4"><input type="password" id="password-input" name="senhaUsuario" placeholder="Senha" class="form-control" required MINLENGTH=8 MAXLENGTH=20><small class="help-block form-text">Mínimo de 8 dígitos</small></div>
                                    </div>
                                    <div class="col-12">
                                        <input type="checkbox" id="codigo" name="codigoUsuario" value="ADM" required>
                                        <label for="codigo">Estou ciente de que realizei meu pré-cadastro para adquirir o sistema AgroM.U.T.</label>
                                    </div>
                                    <div class="col-12 d-flex align-items-center">
                                        <button type="submit" class="btn btn-dark ms-auto btn-sm verde-fundo">Enviar</button>
                                    </div>
                            </div>
                            </form>
                            <br />
                            <div class="text-center">
                                Já tem uma conta? <a href="#" class="text verde" data-bs-toggle="modal"
                                                     data-bs-target="#loginAdm">Entrar</a>
                            </div>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>


</body>

</html>

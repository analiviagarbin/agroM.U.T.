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

        <script src="assets/js/jquery-1.2.6.pack.js" type="text/javascript"></script>
        <script src="assets/js/jquery.maskedinput-1.1.4.pack.js" type="text/javascript"></script>

        <!-- MÁSCARAS FORMS -->
        <script type="text/javascript">
            $(document).ready(function () {
                $("#cpf").mask("999.999.999-99");
            });

            $(document).ready(function () {
                $("#cep").mask("99999-999");
            });

            $(document).ready(function () {
                $("#celular").mask("(99) 99999-9999");
            });

            function MascaraMoeda(objTextBox, SeparadorMilesimo, SeparadorDecimal, e) {
                var sep = 0;
                var key = '';
                var i = j = 0;
                var len = len2 = 0;
                var strCheck = '0123456789';
                var aux = aux2 = '';
                var whichCode = (window.Event) ? e.which : e.keyCode;
                if (whichCode == 13 || whichCode == 8)
                    return true;
                key = String.fromCharCode(whichCode); // Valor para o código da Chave  
                if (strCheck.indexOf(key) == -1)
                    return false; // Chave inválida  
                len = objTextBox.value.length;
                for (i = 0; i < len; i++)
                    if ((objTextBox.value.charAt(i) != '0') && (objTextBox.value.charAt(i) != SeparadorDecimal))
                        break;
                aux = '';
                for (; i < len; i++)
                    if (strCheck.indexOf(objTextBox.value.charAt(i)) != -1)
                        aux += objTextBox.value.charAt(i);
                aux += key;
                len = aux.length;
                if (len == 0)
                    objTextBox.value = '';
                if (len == 1)
                    objTextBox.value = '0' + SeparadorDecimal + '0' + aux;
                if (len == 2)
                    objTextBox.value = '0' + SeparadorDecimal + aux;
                if (len > 2) {
                    aux2 = '';
                    for (j = 0, i = len - 3; i >= 0; i--) {
                        if (j == 3) {
                            aux2 += SeparadorMilesimo;
                            j = 0;
                        }
                        aux2 += aux.charAt(i);
                        j++;
                    }
                    objTextBox.value = '';
                    len2 = aux2.length;
                    for (i = len2 - 1; i >= 0; i--)
                        objTextBox.value += aux2.charAt(i);
                    objTextBox.value += SeparadorDecimal + aux.substr(len - 2, len);
                }
                return false;
            }

        </script>

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
        </style>

        <jsp:include page="sidebar.jsp"/>
    </head>
    <body>

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
                                    <li class="inative"><a href="${pageContext.request.contextPath}/usuarioAdm/index.jsp">Funcionários</a></li>
                                    <li class="active">Cadastrar</li>
                                </ol>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-10 pt-4 ps-lg-5">
                    ${mensagem}
                </div>
            </div>
        </div>

        <div class="content">
            <div class="row">
                <div class="col-lg-12">
                    <div class="card">
                        <div class="card-header">
                            <strong>Cadastrar Funcionário</strong>
                        </div>
                        <div class="card-body card-block">
                            <form action="${pageContext.request.contextPath}/CadastrarUsuarioFunc" method="POST" class="form-horizontal">

                                <h6 class="mb-3">Dados Pessoais</h6>
                                <div class="row form-group">
                                    <div class="col-6"><input type="text" placeholder="Nome" class="form-control" name="nomeUsuario" MAXLENGTH=60></div>
                                    <div class="col-3"><input type="text" id="cpf" placeholder="CPF" class="form-control" name="cpfUsuario"></div>
                                    <div class="col-3">
                                        <div class="input-group">
                                        <div class="input-group-addon"><i class="fa fa-calendar"></i></div>
                                        <input type="date" class="form-control" name="datanascUsuario" min="1900-01-01" max="2020-12-31">
                                        </div>
                                        <small class="help-block form-text">Data de nascimento</small>
                                    </div>
                                </div>
                                <hr>
                                <h6 class="mb-3">Endereço</h6>
                                <div class="row form-group">
                                    <div class="col-1"><input type="text" id="text-input" name="ufUsuario" placeholder="UF" MAXLENGTH=2 class="form-control"></div>
                                    <div class="col-2"><input type="text" id="cep" name="cepUsuario" placeholder="CEP" MAXLENGTH=9 class="form-control"></div>
                                    <div class="col-3"><input type="text" id="text-input" name="cidadeUsuario" placeholder="Cidade" class="form-control"></div>
                                    <div class="col-2"><input type="text" id="text-input" name="bairroUsuario" placeholder="Bairro" class="form-control"></div>
                                    <div class="col-3"><input type="text" id="text-input" name="ruaUsuario" placeholder="Rua" class="form-control"></div>
                                    <div class="col-1"><input type="text" id="text-input" name="numUsuario" placeholder="Nº" class="form-control"></div>
                                </div>
                                <hr>
                                <h6 class="mb-3">Contato</h6>
                                <div class="row form-group">
                                    <div class="col-8"><input type="email" id="email-input" name="emailUsuario" placeholder="E-mail" class="form-control"></div>
                                    <div class="col-4"><input type="text" id="celular" name="celularUsuario" placeholder="Celular" class="form-control"></div>
                                </div>
                                <hr>
                                <h6 class="mb-3">Salário</h6>
                                <div class="row form-group">
                                    <div class="col-4">
                                        <input type="text" name="salarioUsuarioFunc" placeholder="R$" id="salario" class="form-control" onKeyPress="return(MascaraMoeda(this,'.',',',event))">
                                    </div>
                                    <div class="col-4">
                                        <input type="hidden" name="codigoUsuario" placeholder="" value="FUNC" class="form-control">
                                    </div>
                                </div>
                                <hr>
                                <div class="row form-group">
                                    <div class="col-8"><input type="text" id="text-input" name="loginUsuario" placeholder="Login" MAXLENGTH=20 class="form-control"></div>
                                    <div class="col-4"><input type="password" id="password-input" name="senhaUsuario" placeholder="Senha" MINLENGTH=8 MAXLENGTH=20 class="form-control"><small class="help-block form-text">Mínimo de 8 dígitos</small></div>
                                </div>
                                <div class="col-12">
                                    <input type="checkbox" id="codigo" name="codigoUsuario" value="FUNC" required>
                                    <label for="codigo">Estou ciente de que realizei o cadastro de um funcionário ao sistema.</label>
                                </div>
                                <br>
                                <div class="col-12 d-flex align-items-center">
                                    <button type="submit" class="btn ms-auto btn-sm verde-fundo">Cadastrar</button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>

            <jsp:include page="footer.jsp"/>

            <!-- Scripts -->
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
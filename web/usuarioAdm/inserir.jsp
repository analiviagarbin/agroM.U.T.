<%-- 
    Document   : inserir
    Created on : 13/06/2022, 14:45:07
    Author     : AlunoRemoto
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <jsp:include page="sidebar.jsp"/>
        
                        <div class="content">
                        <div class="row flex-lg-row-reverse align-items-center g-5 py-5">
                            <div class="col-lg-12 py-1">
                                <h1 class="display-6 fw-bold lh-1 mb-3 texto">
                                    Inserir Produto
                                </h1>
                                <hr class="verde">
                                <p class="lead">
                                <form method="POST" action="CadastrarProducao" autocomplete="off">
                                    <div class="mb-3">
                                        <div class="mb-2 w-100">
                                            <label class="text-muted" for="produto">Produto:</label>
                                        </div>
                                        <select name="idProduto">
                                            <c:forEach var="produto" items="${nomeprodutos}">
                                                <option value="${produto.idProduto}">
                                                    ${produto.descricaoProduto}
                                                </option>
                                            </c:forEach>
                                        </select>
                                    </div>

                                    <div class="mb-3">
                                        <div class="mb-2 w-100">
                                            <label class="text-muted" for="senha">Data plantio:</label>
                                        </div>
                                        <input type="date" class="form-control" name="dataPlantioProducao" required>
                                    </div>

                                    <input name="idEstufa" type="text" value="${estufa.idEstufa}">

                                    <div class="d-flex align-items-center">
                                        <button type="submit" class="btn btn-dark ms-auto verde-fundo">
                                            Inserir
                                        </button> 
                                     <!-- <input type="button" value="teste" onClick="redireciona('Servlet','idObject=${estufa.idEstufa}');">-->
                                    </div>
                                </form>
                    
                </div>
            </div>
        </div>

    </body>
</html>

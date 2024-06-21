<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Cadastro de Produtos</title>
</head>

<body>
<h1>Cadastro de Produtos</h1>

<g:form action="save">
    <div>
        <label for="nome">Nome:</label>
        <g:textField name="nome" value="${produtoInstancia?.nome}"/>
    </div>

    <div>
        <label for="descricao">Descrição:</label>
        <g:textArea name="descricao" value="${produtoInstancia?.descricao}"/>
    </div>

    <div>
        <label for="valor">Preço:</label>
        <g:field type="number" name="valor" value="${produtoInstancia?.valor}"/>
    </div>

    <div>
        <label for="disponibilidade">Disponível para venda:</label>
        <g:select name="disponibilidade" from="['Sim', 'Não']" value="${produtoInstancia?.disponibilidade}"/>
    </div>

    <div>
        <g:actionSubmit action="save" value="Cadastrar"/>
    </div>
</g:form>
</body>
</html>

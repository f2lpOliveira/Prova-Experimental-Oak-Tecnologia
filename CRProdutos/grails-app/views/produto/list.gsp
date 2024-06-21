<!DOCTYPE html>
<html>
<head>
  <meta name="layout" content="main"/>
  <title>Listagem de Produtos</title>
</head>
<body>
<h1>Listagem de Produtos</h1>

<table>
  <thead>
  <tr>
    <th>Nome</th>
    <th>Preço</th>
  </tr>
  </thead>
  <tbody>
  <g:each in="${produtos}" var="produto">
    <tr>
      <td>${produto.nome}</td>
      <td>${produto.valor}</td>
    </tr>
  </g:each>
  </tbody>
</table>

<br/>
<g:link action="create">Cadastrar Novo Produto</g:link>

</body>
</html>

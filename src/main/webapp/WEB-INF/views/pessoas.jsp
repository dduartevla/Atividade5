<%@page pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>
 <!DOCTYPE html>
<html lang="pt">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Pessoas</title>
</head>
<body>
    <h1>Lista de Pessoas </h1>
    <p> Bem vindo(a) </p>
    <p> Envie dados via <a href="formulario.html">formulário</a></p>

    <ul>
        <c:forEach items="${pessoas}" var="pessoa">
        <li>Id: ${pessoa.id}  Nome: ${pessoa.nome} Idade: ${pessoa.idade}</li>
        </c:forEach>
    </ul>
</body>
</html>
<%@ include file="/html/library/init.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>Lista de Organizações</h1>


	<table class="table table-striped">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Endereço</th>
				<th>Localidade</th>
				<th>Usuários</th>
				<th>Suborganizações</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${organizations}" var="organization">
			<tr>
				<td>${organization.name}</td>
				<td>${organization.address.street1} <br/> ${organization.address.city} </td>
				<td></td>
				<td>Anonymous</td>
				<td>Azukay</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>

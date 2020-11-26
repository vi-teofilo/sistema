<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/mascara.js"></script>
<link href="css/final.css" rel="stylesheet">
<title>Cadastro de Professor</title>
</head>
<body class="image">

	<f:view>
		<jsp:include page="/menu.jsp"></jsp:include>
		<h:form styleClass="cadatrafilme">
		
			<h1>Cadastro de Professor</h1>
			
			<h:panelGrid columns="1">
				<h:messages styleClass="label"/>
			</h:panelGrid>
			
			
			<h:panelGrid columns="2">
				<h:outputText value="Nome: " styleClass="label"/>
				<h:inputText value="#{professorBacking.nome}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>
		
			<h:panelGrid columns="2">
				<h:outputText value="RG: " styleClass="label" />
				<h:inputText value="#{professorBacking.rg}" maxlength="50" onkeyup="masc_rg(this)"  styleClass="cpf"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="CPF: " styleClass="label"/>
				<h:inputText value="#{professorBacking.cpf}" maxlength="50" onkeyup="masc_cpf(this)"  styleClass="cpf"/>			
			</h:panelGrid>
			
			
			<h:panelGrid columns="2">
				<h:outputText value="Data de Nascimento: " styleClass="label" />
				<h:inputText value="#{professorBacking.dataNascimento}" maxlength="50" onkeyup="masc_nascimento(this)"  styleClass="valorpromocao"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Endere�o: " styleClass="label"/>
				<h:inputText value="#{professorBacking.endereco}" maxlength="50"  styleClass="areavenda" />			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Numero: " styleClass="label"/>
				<h:inputText value="#{professorBacking.numero}" maxlength="50" 
								onkeyup="masc_numero(this)"   styleClass="valorpromocao"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Complemento: " styleClass="label"/>
				<h:inputText value="#{professorBacking.complemento}" maxlength="50" 
								  styleClass="valorpromocao"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Bairro: " styleClass="label" />
				<h:inputText value="#{professorBacking.bairro}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Cep: " styleClass="label"/>
				<h:inputText value="#{professorBacking.cep}" maxlength="50" onkeyup="masc_cep(this)" styleClass="valorpromocao"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Cidade: " styleClass="label"/>
				<h:inputText value="#{professorBacking.cidade}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Estado: " styleClass="label"/>
				<h:inputText value="#{professorBacking.estado}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>

			<h:panelGrid columns="2">
				<h:outputText value="Telefone: " styleClass="label" />
				<h:inputText value="#{professorBacking.telefone}" maxlength="50" onkeyup="masc_telefone(this)"  styleClass="valorpromocao"/>			
			</h:panelGrid>
			<h:panelGrid columns="2">
				<h:outputText value="Celular: " styleClass="label" />
				<h:inputText value="#{professorBacking.celular}" maxlength="50" onkeyup="masc_telefone(this)"  styleClass="valorpromocao"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Email: " styleClass="label"/>
				<h:inputText value="#{professorBacking.email}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Curso: " styleClass="label"/>
				<h:inputText value="#{professorBacking.curso}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Mat�ria: " styleClass="label"/>
				<h:inputText value="#{professorBacking.materia}" maxlength="50"  styleClass="telafilme"/>			
			</h:panelGrid>
			
			<h:panelGrid columns="2">
				<h:outputText value="Sal�rio: " styleClass="label" />
				<h:inputText value="#{professorBacking.salario}" maxlength="50"
					size="20" onkeyup="masc_moeda(this)" styleClass="valorpromocao"/>
			</h:panelGrid>
	
			
			<h:panelGrid>
				<h:panelGrid columns="2">
					<h:commandButton value="Salvar" action="#{professorBacking.salvar}" styleClass="botaosalvar"/>
					<h:commandButton value="Cancelar" action="#{professorBacking.cancelar}" styleClass="botaocancelar" />
				</h:panelGrid>			
			</h:panelGrid>
			
		</h:form>
		
	</f:view>

</body>
</html>
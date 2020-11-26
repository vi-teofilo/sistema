<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script type="text/javascript" src="js/locacao.js"></script>
<title>Efetuar Loca��o</title>

</head>
<body>
	<f:view>
		<jsp:include page="/menu.jsp"></jsp:include>
		<h:form styleClass="cadatralocacao">
			<h1>Cadastrar Turma</h1>

			<h:panelGrid columns="1">
				<h:messages styleClass="label"/>
			</h:panelGrid>

			<h:panelGrid columns="1" >
				<h:selectOneMenu id="comboAluno" required="false"
					onchange="submit()" 
					valueChangeListener="#{alunoBacking.popularAluno}" styleClass="inputcliente">
					<f:selectItems value="#{alunoBacking.carregarAlunosCombo()}" />
				</h:selectOneMenu>
			</h:panelGrid>

			<h:panelGrid columns="2" >
				<h:selectOneMenu id="comboFilme" required="false" onchange="submit()" 
					valueChangeListener="#{professorBacking.popularProfessor}" styleClass="inputfilme">
					<f:selectItem itemValue="#{null}" itemLabel="Selecione um filme..." />
					<f:selectItems value="#{professorBacking.carregarProfessorsCombo()}" />
				</h:selectOneMenu>
			</h:panelGrid>
			<h:panelGrid columns="2" >
				<h:outputText value="Nome do Cliente: " styleClass="labelcliente"/>
				<h:outputText id="nomeCliente" value="#{alunoBacking.nome}" styleClass="labelclientelado"/>
			</h:panelGrid>

			<h:panelGrid columns="2">
				<h:outputText value="Nome do filme: " styleClass="labelfilme"/>
				<h:outputText id="nomeFilme" value="#{professorBacking.nome}" styleClass="labelfilmelado" />
			</h:panelGrid>
			<h:panelGrid columns="2">
				<h:outputText value="Valor do filme: " styleClass="labelvalor"/>
				<h:outputText id="valorFilme" value="#{professorBacking.materia}" styleClass="labelvalorlado" />
			</h:panelGrid>

			<h:panelGrid>
				<h:panelGrid columns="2">
					<h:commandButton value="Salvar" action="#{locacaoBacking.salvar}" styleClass="botaosalvarlocacao" />
					<h:commandButton value="Cancelar"
						action="#{locacaoBacking.cancelar}" styleClass="botaocancelarlocacao" />
				</h:panelGrid>
			</h:panelGrid>

			<h:panelGrid>
				<h:panelGrid columns="2">
					<h:commandButton value="Sair" action="#{locacaoBacking.sair}" styleClass="botaosairlocacao" />

				</h:panelGrid>
			</h:panelGrid>
		</h:form>
	</f:view>
</body>
</html>
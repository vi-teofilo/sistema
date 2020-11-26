<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich"%>
<%@taglib prefix="a4j" uri="http://richfaces.org/a4j"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Consulta de Professor</title>
<link href="css/final.css" rel="stylesheet">
</head>
<body class="image">


	<f:view>
		<jsp:include page="/menu.jsp"></jsp:include>

		<h:form styleClass="painel-tablecliente">

			<h:panelGrid columns="1">
				<h:messages styleClass="label"/>
			</h:panelGrid>

			<h:panelGrid columns="3">
				<h:outputText value="Nome: "  styleClass="label"/>
				<h:inputText value="#{professorBacking.nome}" maxlength="50" styleClass="telafilmecadven"  />
				<h:commandButton value="Pesquisar Professor"
					action="#{professorBacking.pesquisar}" styleClass="botaopesquisar"/>
			</h:panelGrid>

			<h:panelGrid columns="1" width="700">
				<a4j:keepAlive beanName="professorBacking" ajaxOnly="true" />
                <rich:spacer height="30" />
				<rich:dataTable width="490" id="listaProfessor" rows="10"
                    columnClasses="col" value="#{professorBacking.listaProfessor}"
                    var="professor" styleClass="lista">

					<f:facet name="caption">
						<h:outputText value="Lista de Professores" styleClass="label"/>
					</f:facet>

					<f:facet name="header">
						<rich:columnGroup>
							<rich:column styleClass="labeltablevendedor">
								<h:outputText value="Nome" styleClass="labeltablevendedor"/>
							</rich:column>
							<rich:column styleClass="labeltablevendedor">
								<h:outputText value="Matéria" styleClass="labeltablevendedor"/>
							</rich:column>
							<rich:column styleClass="labeltablevendedor">
								<h:outputText value="Salário" styleClass="labeltablevendedor"/>
							</rich:column>
							<rich:column colspan="2" styleClass="labeltablevendedor">
								<h:outputText value="Ações" styleClass="labeltablevendedor"/>
							</rich:column>
						</rich:columnGroup>
					</f:facet>

					<rich:column>
						<h:outputText value="#{professor.nome}" />
					</rich:column>
					<rich:column>
						<h:outputText value="#{professor.materia}" />
					</rich:column>
					<rich:column>
						<h:outputText value="#{professorBacking.formataMoeda(professor.salario)}" />
					</rich:column>
					<rich:column>
						<h:commandLink value="Alterar"
								action="#{professorBacking.alterarProfessor}">
								<f:setPropertyActionListener value="#{professor}"
									target="#{professorBacking.professorSelecionado}" />
							</h:commandLink>
					</rich:column>
					<rich:column>
						<h:commandLink value="Excluir" action="#{professorBacking.excluir}">
							<f:setPropertyActionListener value="#{professor}"
								target="#{professorBacking.professorSelecionado}" />
						</h:commandLink>
					</rich:column>
				</rich:dataTable>
			</h:panelGrid>


			<rich:datascroller align="center" for="listaProfessor" maxPages="20"
                page="#{professorBacking.scrollerPage}" id="sc2"
                reRender="listaProfessor" />

 

            <h:panelGrid columns="1">
                <h:commandButton value="Cancelar"
                    action="#{professorBacking.cancelar}" styleClass="botaocancelarlista"/>
            </h:panelGrid>
				

		</h:form>
	</f:view>

</body>
</html>
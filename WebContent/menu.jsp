<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="rich" uri="http://richfaces.org/rich"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>sistema</title>
<link href="css/final.css" rel="stylesheet">
</head>
<body  class="image">
	<div >

		<f:subview id="view" >

			<h:form id="menu">
				
					<rich:toolBar styleClass="confgmenu" >
							
						<rich:dropDownMenu value="Cadastro" styleClass="congfcadastrolabel" >
								
							<rich:menuItem id="menu1" value="Cadastro Aluno"
								action="#{alunoBacking.cadastraAluno}"
								styleClass="confgmenu"  >
							</rich:menuItem>

							<rich:menuItem id="menu2" value="Cadastro Professor" 
								action="#{professorBacking.cadastraProfessor}"
								styleClass="confgmenu" >
							</rich:menuItem>


						</rich:dropDownMenu>

						<rich:dropDownMenu value="Consulta" styleClass="congfcadastrolabel" >

							<rich:menuItem id="menu4" value="Consulta Aluno"
								action="#{alunoBacking.consultaAluno}" styleClass="confgmenu"  >
							</rich:menuItem>

							<rich:menuItem id="menu5" value="Consulta Professor"
								action="#{professorBacking.consultaProfessor}" styleClass="confgmenu" >
							</rich:menuItem>

							<rich:menuItem id="menu6" value="Consulta Curso"
								action="#{professorBacking.consultaCurso}" styleClass="confgmenu"  >
							</rich:menuItem>
							
						</rich:dropDownMenu>

						
						<rich:dropDownMenu value="Relatório" styleClass="congfcadastrolabel" >

							<rich:menuItem id="menu10" value="Relatorio de Aluno"
								action="#{relatorioBacking.relatorioAluno}" styleClass="confgmenu" >
							</rich:menuItem>

							<rich:menuItem id="menu11" value="Relatório de Professor"
								action="#{relatorioBacking.relatorioProfessor}" styleClass="confgmenu"  >
							</rich:menuItem>
							


						</rich:dropDownMenu>
					</rich:toolBar>
			
			</h:form>

		</f:subview>



	</div>

</body>
</html>
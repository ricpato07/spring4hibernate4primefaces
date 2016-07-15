<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome a Java Revolutions JSF + Hibernate + Spring</title>
</head>
<body>
<f:view>

<h:form id="formaUsuarios">
Welcome : <h:outputLabel value="#{loginBean.nombre}"></h:outputLabel>

<h:selectOneMenu value="#{articuloBean.idArticulo}">
    <f:selectItems value="#{articuloBean.mapa}"/>
</h:selectOneMenu>

<center>

<table>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Matricula : </td>
<td><h:inputText value="#{alumnoBean.matricula}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Nombre(s) : </td>
<td><h:inputText value="#{alumnoBean.nombre}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Apellido Paterno : </td>
<td><h:inputText value="#{alumnoBean.app}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Apellido Materno : </td>
<td><h:inputText value="#{alumnoBean.apm}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Sexo : </td>
<td align="left">
    <h:selectOneMenu id="sexos" value="#{alumnoBean.sexo}">
        <f:selectItem itemLabel="Masculino" itemValue="M"/>
        <f:selectItem itemLabel="Femenino" itemValue="F"/>
    </h:selectOneMenu>
</td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Edad : </td>
<td><h:inputText value="#{alumnoBean.edad}"/></td>
</tr>
<tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Usuario : </td>
<td><h:inputText value="#{alumnoBean.usuario}"/></td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Fecha Inicial : </td>
<td>
    <h:inputText value="#{alumnoBean.fecha1}">
        <f:convertDateTime type="date" dateStyle="short"/>
    </h:inputText>
</td>
</tr>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Fecha Final : </td>
<td>
    <h:inputText value="#{alumnoBean.fecha2}">
        <f:convertDateTime type="date" dateStyle="short"/>
    </h:inputText>
</td>
</tr>
<tr>
<td colspan="2">
<h:commandButton value="Guardar" action="#{alumnoBean.insert}"/>
<h:commandButton value="Actualizar" action="#{alumnoBean.update}"/>
<h:commandButton value="Eliminar" action="#{alumnoBean.delete}"/>
<h:commandButton value="Buscar Todos" action="#{alumnoBean.getAll}"/>
</td>
</tr>
</table>

<table>
<tr>
<td style="font-weight: bold; size: 12px; color: blue;" align="right">Criterios de Busqueda : </td>
<td align="left">
    Campo : <h:selectOneMenu id="campo" value="#{alumnoBean.campo}">
        <f:selectItem itemLabel="Matricula" itemValue="matricula"/>
        <f:selectItem itemLabel="Nombre" itemValue="nombre"/>
        <f:selectItem itemLabel="edad" itemValue="edad"/>
    </h:selectOneMenu>
    Criterio : <h:selectOneMenu id="criterio" value="#{alumnoBean.criterio}">
        <f:selectItem itemLabel="Igual" itemValue="="/>
        <f:selectItem itemLabel="Mayor" itemValue=">"/>
        <f:selectItem itemLabel="Menor" itemValue="<"/>
        <f:selectItem itemLabel="Diferente" itemValue="<>"/>
        <f:selectItem itemLabel="Comiencen con" itemValue="begin"/>
        <f:selectItem itemLabel="Terminen con" itemValue="end"/>
        <f:selectItem itemLabel="Contengan" itemValue="content"/>
    </h:selectOneMenu>
    Valor : <h:inputText value="#{alumnoBean.value}"/>
    Buscar :  <h:commandButton value="Buscar" action="#{alumnoBean.buscarByCriterio}"/>
</td>
</tr>
</table>

<h:dataTable id="tablaAlumnos" value="#{alumnoBean.lista}" var="obj"
border="1">

<h:column>
<f:facet name="header"><h:outputText value="Matricula"></h:outputText></f:facet>
<h:outputText value="#{obj.matricula}"></h:outputText>
</h:column>

<h:column>
<f:facet name="header"><h:outputText value="Nombre Completo"></h:outputText></f:facet>
<h:outputText value="#{obj.nombre}"/> <h:outputText value="#{obj.app}"/> <h:outputText value="#{obj.apm}"/>
</h:column>

<h:column>
<f:facet name="header"><h:outputText value="Edad"></h:outputText></f:facet>
<h:outputText value="#{obj.edad}"></h:outputText>
</h:column>

<h:column>
<f:facet name="header"><h:outputText value="Sexo"></h:outputText></f:facet>
<h:outputText value="#{obj.sexo}"></h:outputText>
</h:column>

<h:column>
<f:facet name="header"><h:outputText value="Usuario"></h:outputText></f:facet>
<h:outputText value="#{obj.usuario}"></h:outputText>
</h:column>
    
</h:dataTable>

</center>

</h:form>

</f:view>
</body>
</html>

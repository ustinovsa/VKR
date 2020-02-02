<%-- 
    Document   : TPC
    Created on : Feb 2, 2020, 2:41:32 PM
    Author     : UstinovSA <ustinov.serg.al@gmail.com>
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html"
        pageEncoding="UTF-8"%>
<%--
Подключение серверных тегов
--%>
<fmt:setBundle basename="ru.vkr.resources.labels"/>

<%@taglib prefix="core" tagdir="/WEB-INF/tags/core/" %>
<%@taglib prefix="calculations" tagdir="/WEB-INF/tags/calculations/" %>


<core:layout>

    <jsp:attribute name="title">
        <fmt:message key="label.title"/>
    </jsp:attribute>

    <jsp:body>
        
        <div class="centered">
            <h2>
                <fmt:message key="label.calculations.tpc"/>
            </h2>
            <calculations:tpcInitialDataForm/>
        </div>
       
    </jsp:body>

</core:layout>


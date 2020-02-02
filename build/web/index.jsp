<%-- 
    Document   : index
    Created on : Jan 25, 2020, 8:29:19 PM
    Author     : Home
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html"
        pageEncoding="UTF-8"%>
<%--
Подключение серверных тегов
--%>
<fmt:setBundle basename="ru.vkr.resources.labels"/>

<%@taglib prefix="base" tagdir="/WEB-INF/tags/core/" %>


<base:layout>
    <jsp:attribute name="title">
        <fmt:message key="label.title"/>
    </jsp:attribute>
 <jsp:body>
        
        <div class="centered">
            <h2>
                <fmt:message key="label.welcome.title"/>
            </h2>
            
        </div>
           
    </jsp:body>
</base:layout>

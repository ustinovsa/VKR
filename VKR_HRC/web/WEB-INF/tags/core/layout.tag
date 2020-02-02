<%-- 
    Document   : layout
    Created on : 15.06.2019, 12:35:26
    Author     : JAVA
    Description: Basic Layout Tag
--%>

<%@tag description="basic layout tag" pageEncoding="UTF-8"%>

<%@taglib prefix="core" tagdir="/WEB-INF/tags/core/" %>

<%@attribute name="title" required="true"%>

<c:set var="context" value="${pageContext.servletContext.contextPath}"></c:set>
<!DOCTYPE html>

<html>
    <head>
        <title>
            ${title}
        </title>
        <link href="${pageContext.servletContext.contextPath}/css/groundWorkSetup.css"
              type="text/css"
              rel="stylesheet">
        <link href="${pageContext.servletContext.contextPath}/css/layout.css"
              type="text/css"
              rel="stylesheet">

    </head>
    <body>

        <div class="row">

            <div class="padded">
                <core:navigation/>
            </div>

            <section class="justify padded">
                <jsp:doBody/>
            </section>

            <footer>
                
            </footer>

        </div>
    </body>
</html>
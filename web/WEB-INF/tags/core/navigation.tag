<%-- 
    Document   : navigation
    Created on : 15.06.2019, 13:10:12
    Author     : JAVA
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>

<fmt:setBundle var="labels" basename="ru.vkr.resources.labels"/>

<c:set var="context" value="${pageContext.servletContext.contextPath}"></c:set>



    <nav class="nav nocollapse" title="Menu">
        <ul>
            <li>
                <button>
                    <a href="${context}">
                    <fmt:message bundle="${labels}" key="label.main"/>
                </a>
            </button>
        </li>

        <li>
            <button>
                <a href="${context}/calculations/tpc">
                    <fmt:message bundle="${labels}" key="label.calculations.tpc"/>
                </a>
            </button>
        </li>
        <li>
            <button>
                <a href="${context}/mac">
                    <fmt:message bundle="${labels}" key="label.calculations.mac"/>
                </a>
            </button>
        </li>

        </li>
        <button>
            <a href="${context}/about">
                <fmt:message bundle="${labels}" key="label.about"/>
            </a>

        </button>

        <button>
            <a href="${context}/contacts">
                <fmt:message bundle="${labels}" key="label.contacts"/>
            </a>
        </button>
    </ul>
</nav>

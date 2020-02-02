<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/core/" %>

<fmt:setBundle basename="ru.vkr.resources.labels"/>

<common:error/>

<form   name="tpc" 
        action="${pageContext.servletContext.contextPath}/calculations/tpc"
        >
    <p class="row gap-bottom">
        <input type="country"
               name="country"
               value="${param.country}"
               placeholder="<fmt:message key="label.country"/>"
               required>
    </p>

    <p class="row gap-bottom">
        <input type="region"
               name="region"
               value="${param.region}"
               placeholder="<fmt:message key="label.region"/>"
               required>
    </p>
    
    <p class="row gap-bottom">
        <input type="city"
               name="city"
               value="${param.city}"
               placeholder="<fmt:message key="label.city"/>"
               required>
    </p>

    <p class="row gap-bottom">
        <a href="${pageContext.servletContext.contextPath}/calculation/tpc">
            <fmt:message key="label.calculation.action"/>
        </a>
        <button class="pull-right">
            <fmt:message key="label.calculation.action"/>
        </button>
    </p>
</form>
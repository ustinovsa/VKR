<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@tag description="put the tag description here" pageEncoding="UTF-8"%>
<%@taglib prefix="common" tagdir="/WEB-INF/tags/core/" %>

<fmt:setBundle basename="ru.vkr.resources.labels"/>

<common:error/>

<form   name="tpc" 
        action="${pageContext.servletContext.contextPath}/calculations/tpc"
        >
    <div>
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
        <input type="typeOfRoom"
               name="typeOfRoom"
               value="${param.typeOfRoom}"
               placeholder="<fmt:message key="label.typeOfRoom"/>"
               required>
    </p>
    
    <p class="row gap-bottom">
        <input type="typeOfConstruction"
               name="typeOfConstruction"
               value="${param.typeOfConstruction}"
               placeholder="<fmt:message key="label.typeOfConstruction"/>"
               required>
    </p>
    
    <p class="row gap-bottom">
        <input type="temperatureInside"
               name="temperatureInside"
               value="${param.temepratureInside}"
               placeholder="<fmt:message key="label.temperatureInside"/>"
               required>
    </p>
    
    <p class="row gap-bottom">
        <input type="relativeHumidityInside"
               name="relativeHumidityInside"
               value="${param.temepratureInside}"
               placeholder="<fmt:message key="label.relativeHumidityInside"/>"
               required>
    </p>


    <p class="row gap-bottom">
        <button class="pull-right">
            <fmt:message key="label.calculation.action"/>
        </button>
    </p>
</form>
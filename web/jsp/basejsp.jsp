<%-- 
    Document   : basejsp
    Created on : 2015-12-23, 21:37:14
    Author     : rain
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %> 
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<%@ page trimDirectiveWhitespaces="true"%>
<%
    String path = request.getContextPath();
    String ctx = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path+"/jsp";
%>
<c:set var="basePath" value="<%=ctx%>"/>
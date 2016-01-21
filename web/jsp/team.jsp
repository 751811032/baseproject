<%-- 
    Document   : team
    Created on : 2015-12-21, 20:59:17
    Author     : rain
--%>
<%@include file="basejsp.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!   jsp</h1>
        <img src="${basePath}/img/logo20.png">
        <img src="img/logo20.png"/>
        <table>
            <c:forEach items="${list}" var="item" varStatus="status">
            <tr>
             <td>?????${item.teamID}</td>
             <td>????${item.key}</td>
             <td>?????${item.name}</td>
            </tr>
            </c:forEach>
        </table> 
    </body>
</html>

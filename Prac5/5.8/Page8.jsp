<%-- 
    Document   : Page8
    Created on : Apr 4, 2016, 1:18:17 PM
    Author     : Kandy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h4>Enrollment No:130050131031</h4>
         <h4>Testing page object</h4>
         <%
            out.print(((Servlet)page).getServletInfo());
          %>
    </body>
</html>

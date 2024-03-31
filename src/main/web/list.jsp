<%-- 
    Document   : list
    Created on : 31 thg 3, 2024, 17:01:19
    Author     : 84866
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kết quả thi của bạn</title>
    </head>
    <body>
    <center>
        <h1 style='color:red'>Học Viện Công Nghệ Bưu Chính Viễn Thông</h1>
        <table border="1px" width="70%">
            <tr>
                <th>STT</th>
                <th>Câu hỏi</th>
                <th>Đáp án chi tiết</th>
            </tr>
            <c:forEach items="${requestScope.data}" var="c">
                <c:set var="id" value ="${c.id}"/>
                <tr>
                    <td>${id}</td>
                    <td>${c.name}</td>
                    <td>${c.describe}</td>
                </tr>
            </c:forEach>
        </table>
    </center>
    </body>
</html>

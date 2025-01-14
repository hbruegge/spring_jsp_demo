<%@ page contentType="text/html; UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
    <head>
        <title>View Books</title>
    </head>

    <body>
        <table>
            <thead>
                <tr>
                    <th>ISBN</th>
                    <th>Name</th>
                    <th>Author</th>
                </tr>
            </thead>

            <tbody>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td>${book.isbn10}</td>
                        <td>${book.title}</td>
                        <td>${book.author}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
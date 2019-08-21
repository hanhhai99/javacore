<%-- 
    Document   : home
    Created on : 22-08-2019, 00:28:19
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <style>
            #main {
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                Books Manager
            </a>
        </nav>    
        <div class="container" id="main">
            <table class="table">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Tên sách</th>
                        <th scope="col">Tác giả</th>
                        <th scope="col">Giá</th>
                        <th scope="col">Số lượng</th>
                        <th scope="col">Chức năng</th>
                    </tr>
                </thead>
                <tbody>
                <c:forEach var="item" items="${all}">
                    <tr>
                        <th scope="row">${item.id}</th>
                        <td>${item.title}</td>
                        <td>${item.author}</td>
                        <td>${item.price}</td>
                        <td>${item.quantity}</td>
                        <td>
                            <a href="GetBookServlet?id=${item.id}" class="btn btn-primary">Sửa</a>
                            <a href="DeleteBookServlet?id=${item.id}" onclick="remove()" class="btn btn-danger">Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            
            <a class="btn btn-primary" href="addbook.jsp">Thêm mới</a>
            
            <script>
                function remove() {
                    confirm('Are you sure?');
                    
                }
            </script>
        </div>
    </body>
</html>

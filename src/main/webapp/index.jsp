<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
    <a href="helloworld">Hello World</a>
    <form action="/newSpringMVC/testPojo/" method="post">
        username: <input type="text" name="username"/><br>
        city: <input type="text" name="address.city"/><br>
        <input type="submit" value="submit"/>
    </form>
</body>
</html>
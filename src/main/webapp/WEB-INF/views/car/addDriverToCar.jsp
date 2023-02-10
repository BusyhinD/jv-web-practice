<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a driver to the car</title>
</head>
<body>
<h1>Please the form below</h1>
<form method="post" action="${pageContext.request.contextPath}/cars/drivers/add">
    Car id <input type="text" name="carId"><br><br>
    Driver id <input type="text" name="driverId"><br><br>
    <button type="submit">Confirm</button>
</form>
</body>
</html>
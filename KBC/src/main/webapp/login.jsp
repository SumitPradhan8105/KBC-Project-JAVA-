<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="./LoginStyle.css">
</head>
<body>
<form action="LoginValidationServlet" method= "post">
    <div class="parent">
        <div class="left"> 
            <img class="logo" src="logo.png" alt="logo">
            <h2 class="heading1">Welcome To KBC!</h2>
            
        </div>
        <div class="right">
            <h2 class="heading">Log In</h2>
            <P class="description">Sign In to your account Here!</P>
            
            <input type="text" placeholder="USERNAME" name = "uname">
            
            <input type="password" placeholder="PASSWORD" name = "pass">
            
            <a href="./registeration.jsp" target="_blank"><P class="description">Create Account</P></a>
            <a href="./Reset_Password.jsp" target="_blank"><P class="description">Forgot Password?</P></a>

            <button type="submit">Sign In</button> 
            
            
        </div>
    </div>
</form>
</body>
</html>
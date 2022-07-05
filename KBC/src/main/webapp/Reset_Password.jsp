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
<form action ="ResetPassServlet" method ="post">



    <div class="parent">
        <div class="left"> 
            <img class="logo" src="logo.png" alt="logo">
            <h2 class="heading1">Reset Password</h2>
            
        </div>
        <div class="right">
            <h2 class="heading">Set Password</h2>
            <P class="description">Reset Your Password Here!</P>
            
            ${msg}

            <input type="text" placeholder="ENTER USERNAME" name = "uname">
            
            <input type="text" placeholder="NEW PASSWORD" name = "newpass">
            
            <input type="password" placeholder="CONFIRM NEW PASSWORD" name = "renewpass">
            
            
            <button type="submit">Reset</button> 
        </div>
    </div>
    
</form>
</body>
</html>
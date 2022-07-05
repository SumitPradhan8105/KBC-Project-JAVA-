<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registeration Page</title>
    <link rel="stylesheet" href="./RegStyle.css">
</head>
<body>
<form action = "RegServlet" method = "post">
    <div class="parent">
        <div class="left"> 
            <img class="logo" src="logo.png" alt="logo">
            <h2 class="heading1">New User</h2>
            
        </div>
        <div class="right">
            <h2 class="heading">Register</h2>
            <P class="description">Don't have an Account? Create your Account Here!</P>
            <input type="text" placeholder="NAME" name = "name">
            <input type="email" placeholder="EMAIL ID" name = "email">
            <input type="number" placeholder="MOBILE NO" name = "mobile">
            <input type="password" placeholder="PASSWORD" name ="password">
           
            <div class="gender">
             <p>Gender: </p> 
            <input type="radio" id="male" value="male" name = "gender">
            <label for="male">Male</label>
            <input type="radio" id="female" value="female" name = "gender">
            <label for="female">Female</label>
            </div>
           
            
            <button type="submit">Register</button> 
        </div>
    </div>
</form>   
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
		form{
            display: flex;
            flex-direction: column;
            width: 50%;
            align-items: center;
            margin: 10rem auto;
            text-align: center;
            gap: 3rem;
        }

        input{
            width: 7rem;
            height: 3rem;
            border-radius: 10px;
            border: none;
            outline: none;
            background-color: black;
            color: #ffffff;
        }

        body{
            background: url();
            background-position: center;
            background-repeat: no-repeat;
            background-size: cover;
        }
</style>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form action="QuizServlet" method = "Post">


<h1>
<b>Welcome To Kaun Banega Crorepati,<br> ${msg}</b>
</h1>

<input type = "submit" value = "Start Quiz">


</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
    	body{
    		font-family: 'Roboto', sans-serif;
    		background-color: #ffffff;
    		}
        .container{
        	border: 2px solid #2c0249;
            padding: 2rem 3rem;
            border-radius: 10px;
            display: flex;
            flex-direction: column;
            gap: 1rem;
        }
        h1{
        	color: #2c0249;
        }

        button{
            width: 10rem;
    		height: 3rem;
    		border: none;
    		outline: none;
    		border-radius: 15px;
    		background-color: #26033e;
    		color: #ffffff;
    		font-size: 1.2rem;
    		transition: all 0.3s ease;
        }

        button:hover{
            cursor: pointer;
            transform: scale(0.95);
        }
        
        .parent{
        	display: flex;
        	flex-direction: column;
        	gap: 2rem;
        	width: 50%;
        	margin: 0 auto;
			align-items: center;
			margin-top: 10rem;
        }
    </style>
</head>
<body >
	<div class="parent">
		<h1 align ="center"><b>${msg}</b></h1>
    <div class="container">
        <h2>Back to Login</h2>
        <a href="./login.jsp"><button type="submit">Login</button></a>
    </div>
	</div>
	
</body>
</html>
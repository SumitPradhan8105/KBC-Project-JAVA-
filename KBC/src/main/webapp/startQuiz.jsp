<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.List"%>
<%@page import="com.kbc.quiz.Quiz"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Quiz</title>
<style type="text/css">
	body{
		background-color:#ffffff ;
	}
	label{
		color: #333333;
	}
	form{
		padding: 2rem 3rem;
	}
	
	.option-parent{
		margin: 2.5rem 0;
		display: flex;
		align-items: center;
		gap: 2rem;
	}
	
	.option{
		background-color: grey;
		border: 2px solid #333333;
	}
	
	button{
		width: 7rem;
		height: 3rem;
		background-color: grey;
		border-radius: 10px;
		border: none;
		outline: none;
		color: #ffffff;
		transition: all 0.3s ease;
	}
	
	button:hover{
		cursor: pointer;
		transform: scale(0.95);
	}
	</style>
</head>
<body>

<form action = "QuizSubmitServlet" method ="post">
<center>
<img src = "logo.png">
<h1>Kaun Banega Crorepati</h1>
</center>

<%
List<Quiz> que=(List<Quiz>)session.getAttribute("list");
for(Quiz q : que){
%>	
<label class="sno"><%=q.getId() %>.</label>&nbsp&nbsp<label class="question"> <%=q.getQuestion() %> </label><br/>
<label>Prize : Rs. <%=q.getPrize()%>000</label><br/>
<div class="option-parent">
	<input class="option" type = "radio" name = "<%=q.getQno() %>" value ="a"><%=q.getOption1() %>
	<input class="option" type = "radio" name = "<%=q.getQno() %>" value ="b"><%=q.getOption2() %>
	<input class="option" type = "radio" name = "<%=q.getQno() %>" value ="c"><%=q.getOption3() %>
	<input class="option" type = "radio" name = "<%=q.getQno() %>" value ="d"><%=q.getOption4() %>
</div>
<%	
}
%>
<button type="submit" value = "${index}"  name  = "index" >Submit</button> 
</form>
</body>
</html>
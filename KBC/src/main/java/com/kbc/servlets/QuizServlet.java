package com.kbc.servlets;

import java.io.IOException;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kbc.dao.QuizDAO;
import com.kbc.quiz.Quiz;

@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	
		QuizDAO obj = new QuizDAO();
		List<Quiz> list = obj.getQuestions();
		
		HttpSession session = request.getSession();
		
		
	
		session.setAttribute("list",list);
		response.sendRedirect("startQuiz.jsp");
	
		
		
		
		
		
		

	
	
		
		
		
	}


}

package com.javaex.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloServlet") //파일의 주소 (별명은 변경할 수 있다)
public class HelloServlet extends HttpServlet {
	//필드
	//private static final long serialVersionUID = 1L;
       
    //생성자
    //public HelloServlet() {} --> 생략 기본 생성자 사용
    
    //메소드 g,s

    //메소드 일반
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//코드 작성
		
		//한글 깨지지 않는 코드
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out  = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("		<meta charset=\"UTF-8\">");
		out.println("		<title>Insert title here</title>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("	<h1>servlet : helloworld!!! 안녕 servlet!!!</h1>");
		out.println("	</body>");
		out.println("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

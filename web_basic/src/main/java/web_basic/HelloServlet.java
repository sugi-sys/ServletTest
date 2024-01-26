package web_basic;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("サーブレットの実行");
		 
 		//フォワード先の指定
 		RequestDispatcher dispatcher =	request.getRequestDispatcher("/hello.jsp");
 
 		//フォワードの実行
 		dispatcher.forward(request, response);
 
 		System.out.println("サーブレットの終了");
		
	}
	
}

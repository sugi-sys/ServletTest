package plusCalc;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Plus extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("入力されました");
		
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		
		String message = null;
		String answer = null;
		
		if (strNum1 == null || strNum2 == null) {
			message = "フォーム以外から入力されました";
		} else if (strNum1.equals("") || strNum2.equals("")) {
			message = "どちらかの数字が入力されていません";
		} else {
			try {
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				answer = Integer.toString(num1 + num2);
				
			} catch (NumberFormatException e) {
				message = "数字のみの入力をお願いします";
			}
		}
		
		if (message == null) {
			request.getRequestDispatcher("/result.jsp?answer="+answer).forward(request, response);
		} else {
			request.getRequestDispatcher("/error.jsp?message="+message).forward(request, response);
		}
	
	}
}

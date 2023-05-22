package servlet;

import java.io.IOException;

import bean.LoginBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 * Servlet implementation class Login
 * 
 * Login用のbeanインスタンス
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * doGetは初期表示
	 * Login用のBeanインスタンスを作り、それをJSPが使えるように準備したうえで、JSPを呼び出す
	 */
    // doGetは初期表示
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		LoginBean lb = new LoginBean();
		
		request.setAttribute("lb", lb);
		//JSP呼び出し
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * doPostは押下アクションのリクエストを受ける
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		//ボタンが押されたら呼び出される
		System.out.println("call login.doPost success.");
	}

}

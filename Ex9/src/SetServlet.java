

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetServlet
 */
@WebServlet("/SetServlet")
public class SetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String r = (String)request.getParameter("request");
		String s = (String)request.getParameter("session");
		String a = (String)request.getParameter("application");
		// リクエストスコープにデータを保存
		request.setAttribute("request", r);
		// セッションスコープにデータを保存
		HttpSession session = request.getSession();
		session.setAttribute("session", s);
		// アプリケーションスコープにデータを保存
		ServletContext application = getServletContext();
		application.setAttribute("application", a);
		// 表示
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");

		out.println("<h2>以下のデータを設定しました。</h2>");
		out.println("<h2>リクエストスコープ:" + r + "</h2>");
		out.println("<h2>セッションスコープ:" + s + "</h2>");
		out.println("<h2>アプリケーションスコープ:" + a + "</h2>");
		out.println("<a href='startscope.html'>戻る</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieRemoveServlet
 */
@WebServlet("/CookieRemoveServlet")
public class CookieRemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieRemoveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie memberName = new Cookie("MemberName", "");
		memberName.setMaxAge(0);
		response.addCookie(memberName);
		Cookie memberDate = new Cookie("MemberDate", "");
		memberDate.setMaxAge(0);
		response.addCookie(memberDate);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>クッキー情報の削除</title></head><body>");
		out.println("<h2>クッキー情報を削除しました。</h2><br>");
		out.println("<a href='startcookie.html'>戻る</a>");
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

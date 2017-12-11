

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CookieCreateServlet
 */
@WebServlet("/CookieCreateServlet")
public class CookieCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieCreateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String memberName = request.getParameter("membername");
		 String memberDate = request.getParameter("memberdate");
		 memberName = URLEncoder.encode(memberName,"UTF-8");
		 Cookie memberN = new Cookie("MemberName",memberName);
		 memberN.setMaxAge(30);
		 response.addCookie(memberN);
		 Cookie memberD = new Cookie("MemberDate", memberDate);
		 memberD.setMaxAge(30);
		 response.addCookie(memberD);
		 PrintWriter out = response.getWriter();
		 out.println("<html><head><title>クッキー情報の保存</title></head><body>");
		 out.println("入力した内容<br>");
		 out.println("会員名：" + memberName + "<br>");
		 out.println("会員入会日：" + memberDate + "<br><br>");
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



import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieGetServlet
 */
@WebServlet("/CookieGetServlet")
public class CookieGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieGetServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String memberName = "";
		String memberDate = "";
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
		for (Cookie cook : cookies) {
		if (cook.getName().equals("MemberName")) {
		memberName = URLDecoder.decode(cook.getValue(),"UTF-8");
		}
		else if (cook.getName().equals("MemberDate")) {
		memberDate = URLDecoder.decode(cook.getValue(), "UTF-8");
		}
		}
		}
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>クッキー情報の取得</title></head><body>");
		out.println("<h2>クッキー情報の取得</h2>");
		out.println("<table border='1'><tr><th>会員名</th><th>会員入会日</th></tr>");
		out.println("<tr><td>" + memberName + "</td><td>" + memberDate + "</td></tr></table>");
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

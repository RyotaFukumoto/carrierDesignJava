

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionGetServlet
 */
@WebServlet("/SessionGetServlet")
public class SessionGetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionGetServlet() {
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
		HttpSession session = request.getSession();
		memberName = (String)session.getAttribute("MemberName");
		memberDate = (String)session.getAttribute("MemberDate");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>セッションから属性を取得</title></head><body>");
		out.println("<h2>セッションから属性を取得</h2>");
		out.println("<table border='1'><tr><th>会員名</th><th>会員入会日</th></tr>");
		out.println("<tr><td>" + memberName + "</td><td>" + memberDate + "</td></tr></table>");
		out.println("<a href='startsession.html'>戻る</a>");
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

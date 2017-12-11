

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCreateServlet
 */
@WebServlet("/SessionCreateServlet")
public class SessionCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionCreateServlet() {
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
		HttpSession session = request.getSession();
		session.setAttribute("MemberName", memberName);
		session.setAttribute("MemberDate",memberDate);
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>セッションに属性を保存</title></head><body>");
		out.println("入力した内容<br>");
		out.println("会員名:" + memberName + "<br>");
		out.println("会員入会日:" + memberDate + "<br><br>");
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

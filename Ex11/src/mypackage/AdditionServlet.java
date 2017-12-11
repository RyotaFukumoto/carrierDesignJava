package mypackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdditionServlet
 */
@WebServlet("/AdditionServlet")
public class AdditionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdditionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int val1, val2;
		try {
		val1 = Integer.parseInt(request.getParameter("value1"));
		val2 = Integer.parseInt(request.getParameter("value2"));
		} catch(NumberFormatException e) {
		getServletContext().getRequestDispatcher("/error_output.html").forward(request,response);
		return;
		}
		AdditionBean addBean = new AdditionBean();
		addBean.setValue1(val1);
		addBean.setValue2(val2);
		addBean.additionExecution();
		request.setAttribute("addBean", addBean);
		getServletContext().getRequestDispatcher("/addition_output.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

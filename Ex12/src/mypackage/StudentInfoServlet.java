package mypackage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class StudentInfoServlet
 */
@WebServlet("/StudentInfoServlet")
public class StudentInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    StudentInfoBean stdInfoBean = new StudentInfoBean();
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int studentNo;
		String studentName;
		int schoolYear;
		
		try {
			studentNo = Integer.parseInt(request.getParameter("student_no"));
			studentName = request.getParameter("student_name");
			schoolYear = Integer.parseInt(request.getParameter("schoolyear"));
		} catch (NumberFormatException e) {
			getServletContext().getRequestDispatcher("/error_output.html").forward(request,response);
		return;
		}
		
		StudentRecordBean stdRecord = new StudentRecordBean();
		stdRecord.setStudentNo(studentNo);
		stdRecord.setStudentName(studentName);
		stdRecord.setSchoolYear(schoolYear);
		stdInfoBean.addStudentRecord(stdRecord);
		HttpSession session = request.getSession();
		session.setAttribute("stdInfoBean", stdInfoBean);
		getServletContext().getRequestDispatcher("/studentinfo_check.jsp").forward(request,response);	
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

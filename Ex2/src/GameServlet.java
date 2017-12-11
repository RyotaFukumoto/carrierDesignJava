

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GameServlet
 */
@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int count;
	private String number;
       private Random rnd = new Random();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GameServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// TODO Auto-generated method stub
		String answer = request.getParameter("answer");
        PrintWriter out = response.getWriter();

        // answerのチェック
        if ("".equals(answer) || answer.length() != 4) {
            out.println("<html>");
            out.println("<body>");
            out.println("<h3>正しい値を入力してください</h3>");
            out.println("<button type='button' onclick='history.back()'>戻る</button>");
            out.println("</body>");
            out.println("</html>");
        		return;
        }

        // countをチェックして、ゲームスタート時は正解を作成
        if (count == 0) {
        		number = "";
        		while (number.length() < 4) {
        			int r = rnd.nextInt(10);
        			String n = String.valueOf(r);
        			if (number.contains(n)==false) {
                		number += n;
        			}
        		}
        }

        	count++;

        // hit,blowの準備
        int hit = 0;
        int blow = 0;
        String[] ans = answer.split("");
        String[] num = number.split("");

        // hit,blowのチェック
        int i=0;
        for (String a: ans) {
        		int j=0;
        		for (String n: num) {
        			if (a.equals(n)) {
        				if (i==j) hit++; else blow++;
        			}
        			j++;
        		}
        		i++;
        }

        // レスポンスの作成
        out.println("<html>");
        out.println("<body>");

		out.println("<h3>" + count + "回目のチャレンジ</h3>");
		out.println("<h3>プレーヤーの答え：" + answer + "</h3>");
        out.print("<h3>ヒット：" + hit + "  ブロー：" + blow + "</h3>");

        if (hit == 4) {
            out.println("<h1>congratulations!!</h1>");
            count = 0;
        }
        out.println("<button type='button' onclick='history.back()'>戻る</button>");
        out.println("</body>");
        out.println("</html>");
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package kr.co.drama.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.drama.actorDAO;
import kr.co.drama.actorVO;
import kr.co.drama.dramainfoDAO;
import kr.co.drama.dramainfoVO;

/**
 * Servlet implementation class dramaUpdateServlet
 */
@WebServlet("/dramaUpdate")
public class dramaUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dramaUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int dNum = Integer.parseInt(request.getParameter("dnum"));
		dramainfoDAO dInfoDAO = dramainfoDAO.getInstance();
		dramainfoVO dramaDetail = null;
		actorDAO actDAO = actorDAO.getInstance();
		List<actorVO> actorList = new ArrayList<>();
		try {
			dramaDetail = dInfoDAO.dramaDetail(dNum);
			actorList = actDAO.actorList(dNum);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("actorList", actorList);
		request.setAttribute("dramaDetail", dramaDetail);
		RequestDispatcher dp = request.getRequestDispatcher("/project/dramaUpdate.jsp");
		dp.forward(request, response);
	}

}

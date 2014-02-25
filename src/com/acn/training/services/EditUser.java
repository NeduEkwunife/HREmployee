package com.acn.training.services;


import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import org.orm.PersistentException;


import orm.com.acn.training.model.UsersDAO;

import com.acn.training.model.Users;
import com.acn.training.utilities.SessionManager;
import com.acn.training.utilities.UserCredential;

@WebServlet("/EditUser")
public class EditUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserCredential cre = null;
		HttpSession sess = request.getSession();
		cre = SessionManager.getUserCredential(sess);

		Users usr = null;
		try {
			usr = UsersDAO.getUsersByORMID(cre.getId());
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("userProfile", usr);
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
				"/edituser.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserCredential cre = SessionManager.getUserCredential(request
				.getSession());
		// TODO Auto-generated method stub

		try {
			Users user = UsersDAO.getUsersByORMID(cre.getId());
			user.setFirstname(request.getParameter("firstname"));
			user.setLastname(request.getParameter("lastname"));

			user.setSummary(request.getParameter("summary"));

			UsersDAO.save(user);

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("ViewProfile");

	}

}

package com.acn.training.services;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

import orm.com.acn.training.model.RoleDAO;
import orm.com.acn.training.model.UsersDAO;

import com.acn.training.model.Role;
import com.acn.training.model.Users;

@WebServlet("/DeleteUsers")
public class DeleteUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		if (request.getParameter("deleteid") != null) {

			try {
				Users usr = UsersDAO.getUsersByORMID(Integer.valueOf(request
						.getParameter("deleteid")));
				UsersDAO.delete(usr);
			} catch (PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			response.sendRedirect("EditUsers");

		} else if (request.getParameter("editid") != null) {
			try {
				Users usr = UsersDAO.getUsersByORMID(Integer.valueOf(request
						.getParameter("editid")));
				request.setAttribute("userData", usr);
				RequestDispatcher rd = getServletContext()
						.getRequestDispatcher("/updateusers.jsp");
				rd.forward(request, response);
			} catch (NumberFormatException | PersistentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			Users user = UsersDAO.getUsersByORMID(Integer.valueOf(request
					.getParameter("id")));
			user.setFirstname(request.getParameter("firstname"));
			user.setLastname(request.getParameter("lastname"));
			user.setEnabled(Byte.valueOf(request.getParameter("enabled")));

			String role = request.getParameter("role");
			Role[] rl = RoleDAO.listRoleByQuery("name="+ "'" + role + "'", null);
			user.setRole(rl[0]);
			user.setSummary(request.getParameter("summary"));

			UsersDAO.save(user);
			response.sendRedirect("EditUsers");

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

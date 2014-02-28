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
import org.springframework.security.core.context.SecurityContextHolder;

import com.acn.training.model.Users;
import com.acn.training.utilities.SessionManager;

import org.springframework.security.core.userdetails.User;

import orm.com.acn.training.model.UsersDAO;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistentException {
		try {
			User cre = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			String email = cre.getUsername();
			Users user = UsersDAO.loadUsersByQuery("email = '" + email + "'" , null);
			
			HttpSession sess = request.getSession();
			
			SessionManager.logParametersInSession(user, sess);
			
			if(user.getRole().getName().equals("Employee")) {
				response.sendRedirect("ViewProfile");
			} else if (user.getRole().getName().equals("HR") || user.getRole().getName().equals("SuperAdmin")) {
				RequestDispatcher rd = request.getRequestDispatcher("/admin.jsp");
				rd.forward(request, response);
			} 
			
		} catch (ClassCastException e) {
			//response.sendRedirect("/" + request.getContextPath());
			response.sendRedirect("logout");
			e.printStackTrace();
		} catch (Exception ex) {
			response.sendRedirect("logout");
			//response.sendRedirect("/" + request.getContextPath());
			ex.printStackTrace();
			
		}
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			processRequest(request, response);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

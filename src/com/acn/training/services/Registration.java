package com.acn.training.services;

import java.io.IOException;

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

/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Users user = new Users();
		user.setFirstname(request.getParameter("name"));
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
		
		
		try {
			if(user.getFirstname().equals("") || user.getEmail().equals("") || user.getPassword().equals("")) {
				response.sendRedirect("adduser.jsp?var1=failure");
			}
			else {
				Role r = RoleDAO.getRoleByORMID(1);
				user.setRole(r);
				UsersDAO.save(user);
				response.sendRedirect("adduser.jsp?var1=success");
			}
			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

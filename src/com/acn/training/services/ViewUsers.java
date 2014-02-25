package com.acn.training.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.orm.PersistentException;

import com.acn.training.model.Users;

import orm.com.acn.training.model.UsersDAO;

@WebServlet("/ViewUsers")
public class ViewUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Users[] x = null;
		try {
			x = UsersDAO.listUsersByQuery(null, null);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<Users> usersList = new ArrayList<Users>(Arrays.asList(x));
		
		
	    // set the attribute in the request to access it on the JSP
	    request.setAttribute("listData", usersList);
	    RequestDispatcher rd = getServletContext().getRequestDispatcher("/viewusers.jsp");
	    rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

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

import orm.com.acn.training.model.SkillsDAO;
import orm.com.acn.training.model.UsersDAO;

import com.acn.training.model.Skills;
import com.acn.training.model.Users;

/**
 * Servlet implementation class AddedSkills
 */
@WebServlet("/AddedSkills")
public class AddedSkills extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Skills [] x = null;
		try {
			x = SkillsDAO.listSkillsByQuery(null, null);
			List<Skills> skillsList = new ArrayList<Skills>(Arrays.asList(x));
			
			
			
		    // set the attribute in the request to access it on the JSP
		    request.setAttribute("skillsData", skillsList);
		    RequestDispatcher rd = getServletContext().getRequestDispatcher("/addskills.jsp");
		    rd.forward(request, response);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package com.acn.training.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.orm.PersistentException;

import orm.com.acn.training.model.UsersDAO;

import com.acn.training.model.Users;
import com.acn.training.utilities.Configs;
import com.acn.training.utilities.SessionManager;
import com.acn.training.utilities.UserCredential;


@WebServlet("/UploadPicture")
public class UploadPicture extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		UserCredential cre = SessionManager.getUserCredential(request.getSession());
		// TODO Auto-generated method stub
		List<FileItem> items = null;
		try {
			items = new ServletFileUpload(new DiskFileItemFactory())
					.parseRequest(request);
		} catch (FileUploadException e) {
			response.sendRedirect("edituser.jsp?var1=failure");
		}
		for (FileItem item : items) {
			if (item.isFormField()) {
				
			} else {
				// Process uploaded fields here.
				File file = new File(Configs.image_folder, cre.getId() + ".jpg"); // Define destination file.
                try {
					item.write(file);
					Users user = UsersDAO.getUsersByORMID(cre.getId());
					user.setPicture(cre.getId() + ".jpg");
					UsersDAO.save(user);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
                
			}
		}
		response.sendRedirect("EditUser");

	}
	}

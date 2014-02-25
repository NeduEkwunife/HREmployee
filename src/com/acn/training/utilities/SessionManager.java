package com.acn.training.utilities;

import javax.servlet.http.HttpSession;

import com.acn.training.model.Users;

public class SessionManager {
	

	public static UserCredential getUserCredential(HttpSession sess) {
	
			UserCredential cre = (UserCredential) sess
					.getAttribute("userCredential");

			if (cre == null) {
				cre = new UserCredential();
				sess.setAttribute("userCredential", cre);
			}
			return cre;

	}

	public static boolean logParametersInSession(Users user, HttpSession sess) {
		

		UserCredential cre = new UserCredential(user.getId(), user.getFirstname(), user.getRole(),
				user.getEmail());
		sess.setAttribute("userCredential", cre);

		return true;

	}

}

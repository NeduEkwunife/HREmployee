/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package orm.com.acn.training.model;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import com.acn.training.model.*;

public class UsersDAO {
	public static Users loadUsersByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadUsersByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users getUsersByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getUsersByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users loadUsersByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadUsersByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users getUsersByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getUsersByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users loadUsersByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (Users) session.load(com.acn.training.model.Users.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users getUsersByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (Users) session.get(com.acn.training.model.Users.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users loadUsersByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Users) session.load(com.acn.training.model.Users.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users getUsersByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Users) session.get(com.acn.training.model.Users.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users[] listUsersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listUsersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users[] listUsersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listUsersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users[] listUsersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Users as Users");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Users[]) list.toArray(new Users[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users[] listUsersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Users as Users");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Users[]) list.toArray(new Users[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users loadUsersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadUsersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users loadUsersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadUsersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users loadUsersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Users[] userses = listUsersByQuery(session, condition, orderBy);
		if (userses != null && userses.length > 0)
			return userses[0];
		else
			return null;
	}
	
	public static Users loadUsersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Users[] userses = listUsersByQuery(session, condition, orderBy, lockMode);
		if (userses != null && userses.length > 0)
			return userses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateUsersByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateUsersByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsersByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateUsersByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsersByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Users as Users");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateUsersByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Users as Users");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Users createUsers() {
		return new com.acn.training.model.Users();
	}
	
	public static boolean save(com.acn.training.model.Users users) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().saveObject(users);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.acn.training.model.Users users) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().deleteObject(users);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Users users)throws PersistentException {
		try {
			if(users.getRole() != null) {
				users.getRole().getUsers().remove(users);
			}
			
			if(users.getProjects() != null) {
				users.getProjects().getUsers().remove(users);
			}
			
			com.acn.training.model.Skills[] lSkillss = (com.acn.training.model.Skills[])users.getSkills().toArray(new com.acn.training.model.Skills[users.getSkills().size()]);
			for(int i = 0; i < lSkillss.length; i++) {
				lSkillss[i].getUsers().remove(users);
			}
			return delete(users);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Users users, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(users.getRole() != null) {
				users.getRole().getUsers().remove(users);
			}
			
			if(users.getProjects() != null) {
				users.getProjects().getUsers().remove(users);
			}
			
			com.acn.training.model.Skills[] lSkillss = (com.acn.training.model.Skills[])users.getSkills().toArray(new com.acn.training.model.Skills[users.getSkills().size()]);
			for(int i = 0; i < lSkillss.length; i++) {
				lSkillss[i].getUsers().remove(users);
			}
			try {
				session.delete(users);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.acn.training.model.Users users) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().refresh(users);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.acn.training.model.Users users) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().evict(users);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

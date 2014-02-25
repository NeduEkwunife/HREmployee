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

public class ProjectsDAO {
	public static Projects loadProjectsByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadProjectsByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects getProjectsByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getProjectsByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects loadProjectsByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadProjectsByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects getProjectsByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getProjectsByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects loadProjectsByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (Projects) session.load(com.acn.training.model.Projects.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects getProjectsByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (Projects) session.get(com.acn.training.model.Projects.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects loadProjectsByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projects) session.load(com.acn.training.model.Projects.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects getProjectsByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Projects) session.get(com.acn.training.model.Projects.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects[] listProjectsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listProjectsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects[] listProjectsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listProjectsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects[] listProjectsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Projects as Projects");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Projects[]) list.toArray(new Projects[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects[] listProjectsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Projects as Projects");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Projects[]) list.toArray(new Projects[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects loadProjectsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadProjectsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects loadProjectsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadProjectsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Projects loadProjectsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Projects[] projectses = listProjectsByQuery(session, condition, orderBy);
		if (projectses != null && projectses.length > 0)
			return projectses[0];
		else
			return null;
	}
	
	public static Projects loadProjectsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Projects[] projectses = listProjectsByQuery(session, condition, orderBy, lockMode);
		if (projectses != null && projectses.length > 0)
			return projectses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateProjectsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateProjectsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjectsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateProjectsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateProjectsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Projects as Projects");
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
	
	public static java.util.Iterator iterateProjectsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Projects as Projects");
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
	
	public static Projects createProjects() {
		return new com.acn.training.model.Projects();
	}
	
	public static boolean save(com.acn.training.model.Projects projects) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().saveObject(projects);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.acn.training.model.Projects projects) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().deleteObject(projects);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Projects projects)throws PersistentException {
		try {
			com.acn.training.model.Skills[] lSkillss = (com.acn.training.model.Skills[])projects.getSkills().toArray(new com.acn.training.model.Skills[projects.getSkills().size()]);
			for(int i = 0; i < lSkillss.length; i++) {
				lSkillss[i].getProjects().remove(projects);
			}
			com.acn.training.model.Users[] lUserss = (com.acn.training.model.Users[])projects.getUsers().toArray(new com.acn.training.model.Users[projects.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].setProjects(null);
			}
			return delete(projects);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Projects projects, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.acn.training.model.Skills[] lSkillss = (com.acn.training.model.Skills[])projects.getSkills().toArray(new com.acn.training.model.Skills[projects.getSkills().size()]);
			for(int i = 0; i < lSkillss.length; i++) {
				lSkillss[i].getProjects().remove(projects);
			}
			com.acn.training.model.Users[] lUserss = (com.acn.training.model.Users[])projects.getUsers().toArray(new com.acn.training.model.Users[projects.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].setProjects(null);
			}
			try {
				session.delete(projects);
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
	
	public static boolean refresh(com.acn.training.model.Projects projects) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().refresh(projects);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.acn.training.model.Projects projects) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().evict(projects);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

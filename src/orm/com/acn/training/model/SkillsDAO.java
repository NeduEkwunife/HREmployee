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

public class SkillsDAO {
	public static Skills loadSkillsByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadSkillsByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills getSkillsByORMID(long id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getSkillsByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills loadSkillsByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadSkillsByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills getSkillsByORMID(long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getSkillsByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills loadSkillsByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (Skills) session.load(com.acn.training.model.Skills.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills getSkillsByORMID(PersistentSession session, long id) throws PersistentException {
		try {
			return (Skills) session.get(com.acn.training.model.Skills.class, new Long(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills loadSkillsByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Skills) session.load(com.acn.training.model.Skills.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills getSkillsByORMID(PersistentSession session, long id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Skills) session.get(com.acn.training.model.Skills.class, new Long(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills[] listSkillsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listSkillsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills[] listSkillsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listSkillsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills[] listSkillsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Skills as Skills");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Skills[]) list.toArray(new Skills[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills[] listSkillsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Skills as Skills");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Skills[]) list.toArray(new Skills[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills loadSkillsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadSkillsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills loadSkillsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadSkillsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Skills loadSkillsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Skills[] skillses = listSkillsByQuery(session, condition, orderBy);
		if (skillses != null && skillses.length > 0)
			return skillses[0];
		else
			return null;
	}
	
	public static Skills loadSkillsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Skills[] skillses = listSkillsByQuery(session, condition, orderBy, lockMode);
		if (skillses != null && skillses.length > 0)
			return skillses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSkillsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateSkillsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSkillsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateSkillsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSkillsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Skills as Skills");
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
	
	public static java.util.Iterator iterateSkillsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Skills as Skills");
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
	
	public static Skills createSkills() {
		return new com.acn.training.model.Skills();
	}
	
	public static boolean save(com.acn.training.model.Skills skills) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().saveObject(skills);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.acn.training.model.Skills skills) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().deleteObject(skills);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Skills skills)throws PersistentException {
		try {
			com.acn.training.model.Users[] lUserss = (com.acn.training.model.Users[])skills.getUsers().toArray(new com.acn.training.model.Users[skills.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getSkills().remove(skills);
			}
			com.acn.training.model.Projects[] lProjectss = (com.acn.training.model.Projects[])skills.getProjects().toArray(new com.acn.training.model.Projects[skills.getProjects().size()]);
			for(int i = 0; i < lProjectss.length; i++) {
				lProjectss[i].getSkills().remove(skills);
			}
			return delete(skills);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Skills skills, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.acn.training.model.Users[] lUserss = (com.acn.training.model.Users[])skills.getUsers().toArray(new com.acn.training.model.Users[skills.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].getSkills().remove(skills);
			}
			com.acn.training.model.Projects[] lProjectss = (com.acn.training.model.Projects[])skills.getProjects().toArray(new com.acn.training.model.Projects[skills.getProjects().size()]);
			for(int i = 0; i < lProjectss.length; i++) {
				lProjectss[i].getSkills().remove(skills);
			}
			try {
				session.delete(skills);
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
	
	public static boolean refresh(com.acn.training.model.Skills skills) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().refresh(skills);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.acn.training.model.Skills skills) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().evict(skills);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

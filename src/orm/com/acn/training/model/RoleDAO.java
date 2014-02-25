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

public class RoleDAO {
	public static Role loadRoleByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadRoleByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role getRoleByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getRoleByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role loadRoleByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadRoleByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role getRoleByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return getRoleByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role loadRoleByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Role) session.load(com.acn.training.model.Role.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role getRoleByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Role) session.get(com.acn.training.model.Role.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role loadRoleByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Role) session.load(com.acn.training.model.Role.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role getRoleByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Role) session.get(com.acn.training.model.Role.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role[] listRoleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listRoleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role[] listRoleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return listRoleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role[] listRoleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Role as Role");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Role[]) list.toArray(new Role[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role[] listRoleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Role as Role");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Role[]) list.toArray(new Role[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role loadRoleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadRoleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role loadRoleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return loadRoleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Role loadRoleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Role[] roles = listRoleByQuery(session, condition, orderBy);
		if (roles != null && roles.length > 0)
			return roles[0];
		else
			return null;
	}
	
	public static Role loadRoleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Role[] roles = listRoleByQuery(session, condition, orderBy, lockMode);
		if (roles != null && roles.length > 0)
			return roles[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRoleByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateRoleByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRoleByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = orm.TrainingPersistentManager.instance().getSession();
			return iterateRoleByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRoleByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Role as Role");
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
	
	public static java.util.Iterator iterateRoleByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.acn.training.model.Role as Role");
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
	
	public static Role createRole() {
		return new com.acn.training.model.Role();
	}
	
	public static boolean save(com.acn.training.model.Role role) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().saveObject(role);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.acn.training.model.Role role) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().deleteObject(role);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Role role)throws PersistentException {
		try {
			com.acn.training.model.Users[] lUserss = (com.acn.training.model.Users[])role.getUsers().toArray(new com.acn.training.model.Users[role.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].setRole(null);
			}
			return delete(role);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.acn.training.model.Role role, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.acn.training.model.Users[] lUserss = (com.acn.training.model.Users[])role.getUsers().toArray(new com.acn.training.model.Users[role.getUsers().size()]);
			for(int i = 0; i < lUserss.length; i++) {
				lUserss[i].setRole(null);
			}
			try {
				session.delete(role);
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
	
	public static boolean refresh(com.acn.training.model.Role role) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().refresh(role);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.acn.training.model.Role role) throws PersistentException {
		try {
			orm.TrainingPersistentManager.instance().getSession().evict(role);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}

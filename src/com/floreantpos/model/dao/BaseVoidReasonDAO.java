package com.floreantpos.model.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

/**
 * This is an automatically generated DAO class which should not be edited.
 */
public abstract class BaseVoidReasonDAO extends com.floreantpos.model.dao._RootDAO {

	// query name references


	public static VoidReasonDAO instance;

	/**
	 * Return a singleton of the DAO
	 */
	public static VoidReasonDAO getInstance () {
		if (null == instance) instance = new VoidReasonDAO();
		return instance;
	}

	public Class getReferenceClass () {
		return com.floreantpos.model.VoidReason.class;
	}

    public Order getDefaultOrder () {
		return null;
    }

	/**
	 * Cast the object as a com.floreantpos.model.VoidReason
	 */
	public com.floreantpos.model.VoidReason cast (Object object) {
		return (com.floreantpos.model.VoidReason) object;
	}

	public com.floreantpos.model.VoidReason get(java.lang.Integer key)
	{
		return (com.floreantpos.model.VoidReason) get(getReferenceClass(), key);
	}

	public com.floreantpos.model.VoidReason get(java.lang.Integer key, Session s)
	{
		return (com.floreantpos.model.VoidReason) get(getReferenceClass(), key, s);
	}

	public com.floreantpos.model.VoidReason load(java.lang.Integer key)
	{
		return (com.floreantpos.model.VoidReason) load(getReferenceClass(), key);
	}

	public com.floreantpos.model.VoidReason load(java.lang.Integer key, Session s)
	{
		return (com.floreantpos.model.VoidReason) load(getReferenceClass(), key, s);
	}

	public com.floreantpos.model.VoidReason loadInitialize(java.lang.Integer key, Session s) 
	{ 
		com.floreantpos.model.VoidReason obj = load(key, s); 
		if (!Hibernate.isInitialized(obj)) {
			Hibernate.initialize(obj);
		} 
		return obj; 
	}

/* Generic methods */

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.floreantpos.model.VoidReason> findAll () {
		return super.findAll();
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 */
	public java.util.List<com.floreantpos.model.VoidReason> findAll (Order defaultOrder) {
		return super.findAll(defaultOrder);
	}

	/**
	 * Return all objects related to the implementation of this DAO with no filter.
	 * Use the session given.
	 * @param s the Session
	 */
	public java.util.List<com.floreantpos.model.VoidReason> findAll (Session s, Order defaultOrder) {
		return super.findAll(s, defaultOrder);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * @param voidReason a transient instance of a persistent class 
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.floreantpos.model.VoidReason voidReason)
	{
		return (java.lang.Integer) super.save(voidReason);
	}

	/**
	 * Persist the given transient instance, first assigning a generated identifier. (Or using the current value
	 * of the identifier property if the assigned generator is used.) 
	 * Use the Session given.
	 * @param voidReason a transient instance of a persistent class
	 * @param s the Session
	 * @return the class identifier
	 */
	public java.lang.Integer save(com.floreantpos.model.VoidReason voidReason, Session s)
	{
		return (java.lang.Integer) save((Object) voidReason, s);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default
	 * the instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the
	 * identifier property mapping. 
	 * @param voidReason a transient instance containing new or updated state 
	 */
	public void saveOrUpdate(com.floreantpos.model.VoidReason voidReason)
	{
		saveOrUpdate((Object) voidReason);
	}

	/**
	 * Either save() or update() the given instance, depending upon the value of its identifier property. By default the
	 * instance is always saved. This behaviour may be adjusted by specifying an unsaved-value attribute of the identifier
	 * property mapping. 
	 * Use the Session given.
	 * @param voidReason a transient instance containing new or updated state.
	 * @param s the Session.
	 */
	public void saveOrUpdate(com.floreantpos.model.VoidReason voidReason, Session s)
	{
		saveOrUpdate((Object) voidReason, s);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * @param voidReason a transient instance containing updated state
	 */
	public void update(com.floreantpos.model.VoidReason voidReason) 
	{
		update((Object) voidReason);
	}

	/**
	 * Update the persistent state associated with the given identifier. An exception is thrown if there is a persistent
	 * instance with the same identifier in the current session.
	 * Use the Session given.
	 * @param voidReason a transient instance containing updated state
	 * @param the Session
	 */
	public void update(com.floreantpos.model.VoidReason voidReason, Session s)
	{
		update((Object) voidReason, s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param id the instance ID to be removed
	 */
	public void delete(java.lang.Integer id)
	{
		delete((Object) load(id));
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param id the instance ID to be removed
	 * @param s the Session
	 */
	public void delete(java.lang.Integer id, Session s)
	{
		delete((Object) load(id, s), s);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * @param voidReason the instance to be removed
	 */
	public void delete(com.floreantpos.model.VoidReason voidReason)
	{
		delete((Object) voidReason);
	}

	/**
	 * Remove a persistent instance from the datastore. The argument may be an instance associated with the receiving
	 * Session or a transient instance with an identifier associated with existing persistent state. 
	 * Use the Session given.
	 * @param voidReason the instance to be removed
	 * @param s the Session
	 */
	public void delete(com.floreantpos.model.VoidReason voidReason, Session s)
	{
		delete((Object) voidReason, s);
	}
	
	/**
	 * Re-read the state of the given instance from the underlying database. It is inadvisable to use this to implement
	 * long-running sessions that span many business tasks. This method is, however, useful in certain special circumstances.
	 * For example 
	 * <ul> 
	 * <li>where a database trigger alters the object state upon insert or update</li>
	 * <li>after executing direct SQL (eg. a mass update) in the same session</li>
	 * <li>after inserting a Blob or Clob</li>
	 * </ul>
	 */
	public void refresh (com.floreantpos.model.VoidReason voidReason, Session s)
	{
		refresh((Object) voidReason, s);
	}


}
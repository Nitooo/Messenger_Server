package messenger.DaoImpl;


import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import messenger.Dao.MessageDao;

@Service
@Scope("singleton")
public class MessageDaoImpl implements MessageDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext
	private EntityManager em;

	public EntityManager getEm() {
		return em;
	}
	
	public <T> void persistObject(T entity) {
		em.persist(entity);
	}

	public <T> void removeObject(T entity) {
		entity = em.merge(entity);
		em.remove(entity);
	}

	public <T> void mergeObject(T entity) {
		em.merge(entity);
	}

}
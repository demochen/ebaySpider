package com.ebay.dao.user;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.ebay.common.persistence.EntityConfiguration;
import com.ebay.domain.user.User;

@Repository("ebayUserDao")
public class UserDaoImpl implements UserDao{
    
	private static Logger log=Logger.getLogger(UserDaoImpl.class);
	
	@PersistenceContext(unitName = "ePU")
	protected EntityManager em;
	
	@Resource(name = "ebayEntityConfiguration")
	protected EntityConfiguration entityConfiguration;
	
	public int selectByUsername(String username) {
		final Query query=em.createNamedQuery("SELECT_BY_NAME");
		query.setParameter("userName", username);
		long count=(Long) query.getSingleResult();
		return (int) count;
	}

	public int validateUser(User user) {
		final Query query=em.createNamedQuery("SELECT_BY_NAME_PASSWORD");
		 query.setParameter("userName",user.getUserName());
		 query.setParameter("passWord",user.getPassWord());
	     log.info(query);
	     long count=(Long) query.getSingleResult();  
	     return (int) count;
	}
  

	public User save(User user) {
		return em.merge(user);
	}

	public String getPassWord(String userName) {
		final Query query=em.createNamedQuery("GET_PASSWORD_BY_NAME");
		query.setParameter("userName", userName);
		String password=(String) query.getSingleResult();
		return password;
	}
}

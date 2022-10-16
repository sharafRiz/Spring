package org.simplilearn.aap.dao;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.simplilearn.aap.entities.Emp;
import org.springframework.stereotype.Repository;

import com.mysql.cj.Query;

@Repository("empDaoImpl")
@Transactional
public class EmpDaolmpl implements EmpDao {
	
 private SessionFactory sessionFactory;
 
 public EmpDaolmpl(SessionFactory sessionFactory)
 {
	 super();
	 this.sessionFactory = sessionFactory;
 }
	@Override
	public void insert(Emp e) {
	 Session session=sessionFactory.getCurrentSession();
	 session.save(e);
		
	}
	

	@Override
	public List<Emp> getAll() {
		Session session=sessionFactory.getCurrentSession();
	 org.hibernate.query.Query<Emp> query=session.createQuery("select e from org.simplilearn.aap.entities.Emp");
	 return query.list();
		
	}

	@Override
	public void delete(int eno) {
		Session session=sessionFactory.getCurrentSession();
		org.hibernate.Query<Emp> query=session.createQuery("delete from org.simplilearn.app.entities.Emp e where e.eno=?1");
		query.setParameter(1, eno);
		query.executeUpdate();
		
	}

	@Override
	public Optional<Emp> get(int eno) {
		Session session=sessionFactory.getCurrentSession();
		Emp e=session.get(Emp.class, eno);
		
		return Optional.of(e);
	}

	@Override
	public void update(int eno, Emp e) {
		Session session=sessionFactory.getCurrentSession();
		org.hibernate.Query<Emp> query=session.createQuery("update org.simplilearn.aap.entities.Emp e set e.name=?!, e.address=?2 where e.eno=?3");
		query.setParameter(1, e.getName());
		query.setParameter(2, e.getAddress());
		query.setParameter(3, e.getAddress());
		query.executeUpdate();
		
		
	}

}

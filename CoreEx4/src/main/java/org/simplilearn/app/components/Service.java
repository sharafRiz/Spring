package org.simplilearn.app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Service {
private Dao dao;


public Service() {
	// TODO Auto-generated constructor stub
}

public Service(Dao dao) {
	super();
	this.dao = dao;
}


public Dao getDao() {
	return dao;
}
@Autowired
public void setDao(Dao dao) {
	this.dao = dao;
}
public void service()
{
	dao.dao();
}
}

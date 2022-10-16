package org.simplilearn.app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="controller")
public class Controller {
	private Service service;
	
	public Controller() {
		// TODO Auto-generated constructor stub
	}
    @Autowired
	public Controller(Service service) {
		super();
		this.service = service;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	public void controller() {
		service.service();
	}

}

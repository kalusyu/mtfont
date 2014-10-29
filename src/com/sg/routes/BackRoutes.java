package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.controller.AdminController;

public class BackRoutes extends Routes{

	@Override
	public void config() {
		add("/",AdminController.class);
		add("/admin", AdminController.class);
	}
}

package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.AdminController;

public class BackRoutes extends Routes{

	@Override
	public void config() {
		add("/admin", AdminController.class);
	}
}

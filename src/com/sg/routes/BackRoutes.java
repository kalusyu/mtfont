package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.controller.AdminController;
import com.sg.controller.FontController;
import com.sg.controller.UserController;

public class BackRoutes extends Routes{

	@Override
	public void config() {
		add("/admin", AdminController.class);
		add("/admin/font", FontController.class);
		add("/admin/user", UserController.class, "");
	}
}

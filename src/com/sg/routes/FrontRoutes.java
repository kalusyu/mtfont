package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.controller.UserController;

public class FrontRoutes extends Routes{

	@Override
	public void config() {
		add("/user",UserController.class);
	}
}

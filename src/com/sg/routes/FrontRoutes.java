package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.IndexController;
import com.sg.UserController;

public class FrontRoutes extends Routes{

	@Override
	public void config() {
		add("/",IndexController.class);
		add("/user",UserController.class);
	}
}

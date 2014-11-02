package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.controller.IndexController;

public class FrontRoutes extends Routes{

	@Override
	public void config() {
		add("/", IndexController.class);
	}
}

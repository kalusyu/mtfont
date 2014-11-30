package com.sg.routes;

import com.jfinal.config.Routes;
import com.sg.controller.AdminController;
import com.sg.controller.CountController;
import com.sg.controller.FreeUserController;
import com.sg.controller.GroupController;
import com.sg.controller.MobileController;
import com.sg.controller.MobileDeviceController;
import com.sg.controller.NFileController;

public class BackRoutes extends Routes{

	@Override
	public void config() {
//		add("/",AdminController.class);
		add("/admin", AdminController.class);
		add("/file", NFileController.class);
		add("/count",CountController.class);
		add("/group", GroupController.class);
		add("/freeuser", FreeUserController.class);
		add("/mobile",MobileController.class);
		add("/mobileDevice",MobileDeviceController.class);
	}
}

package com.sg;

import com.jfinal.core.Controller;
import com.sg.model.User;

public class TestController extends Controller{

	public void index(){
		setAttr("userList", User.dao.findAll());
		render("test.jsp");
//		renderJson();
	}
	
	public void saveUser(){
		new User().set("userId", 5).set("name", "Deam").set("age", 65).save();
		redirect("/test"); //操作完数据库需要跳转一下
	}
}

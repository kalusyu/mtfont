package com.sg.controller;

import com.jfinal.core.Controller;

public class IndexController extends Controller{

	public void index(){
		render("/index/index.html");
	}
}

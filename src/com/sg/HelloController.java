package com.sg;

import com.jfinal.core.Controller;

public class HelloController extends Controller{

	public void index(){
		renderText("hello text");
	}
}

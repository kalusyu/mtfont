package com.sg.interceptor;

import com.jfinal.aop.InterceptorStack;

public class MangerInterceptor extends InterceptorStack{

	@Override
	public void config() {
		addInterceptors(new ControllerInterceptor(),new ActionInterceptor());
	}
}

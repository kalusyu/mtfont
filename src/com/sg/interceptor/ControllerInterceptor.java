package com.sg.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class ControllerInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		ai.invoke();
	}
}

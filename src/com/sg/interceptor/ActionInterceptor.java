package com.sg.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;

public class ActionInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		System.out.println(ai.getController());
		ai.invoke();
		System.out.println(ai.getMethodName());
	}
}

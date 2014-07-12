package com.sg.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.core.ActionInvocation;
/***
 * global ��  ��  controller ��   ��    Action ��
 * 
 * @author Kalus Yu
 *
 */
public class GlobalInterceptor implements Interceptor{

	@Override
	public void intercept(ActionInvocation ai) {
		System.out.println("befor kalus interceptor");
		ai.invoke();
		System.out.println("after kalus interceptor");
	}
}

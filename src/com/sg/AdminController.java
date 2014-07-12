package com.sg;

import java.io.File;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;

@Before(ControllerInterceptor.class)  //controller 级  拦截器
public class AdminController extends Controller{

	@Before(ActionInterceptor.class)
	public void index(){
		renderText("from admincontroller");
	}
	
	@ClearInterceptor //清除controller级的拦截器
	public void uploadfile(){
		UploadFile file = getFile();
	} 
	
	
	@ClearInterceptor(ClearLayer.ALL) //清除所有级别Global级和Controller级
	public void downloadfile(){
//		renderFile(new File());
	}
	
	public void toErrorPage(){
		renderError(404,"");
		renderError(500,"");//根据状态渲染
		
		renderNull();//不渲染  
		
		/***多次调用render只有最后一次生效**/
	}
}

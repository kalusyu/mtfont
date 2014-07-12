package com.sg;

import java.io.File;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;

@Before(ControllerInterceptor.class)  //controller ��  ������
public class AdminController extends Controller{

	@Before(ActionInterceptor.class)
	public void index(){
		renderText("from admincontroller");
	}
	
	@ClearInterceptor //���controller����������
	public void uploadfile(){
		UploadFile file = getFile();
	} 
	
	
	@ClearInterceptor(ClearLayer.ALL) //������м���Global����Controller��
	public void downloadfile(){
//		renderFile(new File());
	}
	
	public void toErrorPage(){
		renderError(404,"");
		renderError(500,"");//����״̬��Ⱦ
		
		renderNull();//����Ⱦ  
		
		/***��ε���renderֻ�����һ����Ч**/
	}
}

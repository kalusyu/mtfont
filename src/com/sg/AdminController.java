package com.sg;


import java.io.File;

import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.render.JsonRender;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;
import com.sg.model.FileInfo;

@Before(ControllerInterceptor.class)  //controller 级  拦截器
public class AdminController extends Controller{

	@Before(ActionInterceptor.class)
	public void index(){
//		renderText("from admincontroller");
		setAttr("fileinfo", FileInfo.dao.findAll());
		renderJsp("upload.jsp");
	}
	
	public void getAllDownload(){
		renderJson("fileinfo",FileInfo.dao.findAll());
	}
	
	@ClearInterceptor //清除controller级的拦截器
	public void uploadfile(){
		FileInfo.dao.saveFile(getFile());
		redirect("/admin");
	} 
	
	
	@ClearInterceptor(ClearLayer.ALL) //清除所有级别Global级和Controller级
	public void downloadfile(){
		int id = getParaToInt();
		FileInfo info = FileInfo.dao.findById(id);
		File f = new File(info.getStr("url")+info.getStr("name"));
		if (f.exists()){
			renderFile(f);
			return;
		}
		index();
	}
	
	public void toErrorPage(){
		renderError(404,"");
		renderError(500,"");//根据状态渲染
		
		renderNull();//不渲染  
		
		/***多次调用render只有最后一次生效**/
	}
}

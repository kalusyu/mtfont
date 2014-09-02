package com.sg.controller;


import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;

import com.google.gson.Gson;
import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.ext.interceptor.Restful;
import com.jfinal.kit.JsonKit;
import com.jfinal.render.JsonRender;
import com.jfinal.upload.UploadFile;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;
import com.sg.model.FileInfo;
import com.sg.model.ModelDeviceInfo;
import com.sg.mtfont.bean.DeviceInfo;

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
	    UploadFile file = getFile();
	    File apkFile = file.getFile();
		FileInfo.dao.saveFile(apkFile);
		redirect("/admin"); 
	} 
	public void save(){
	    saveDeviceInfo();
	}
	
	public void saveDeviceInfo(){
	    Enumeration<String> e = getRequest().getParameterNames();
	    Map<String, String[]> map = getRequest().getParameterMap();
	    if (e.hasMoreElements()) {
                String name = e.nextElement();
                String[] values = getRequest().getParameterValues(name);
	    }
	    String jsonString = "";
	    Gson gson = new Gson();
	    DeviceInfo info = gson.fromJson(jsonString, DeviceInfo.class);
	    ModelDeviceInfo model = new ModelDeviceInfo();
	    model.saveDeviceInfo(info);
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

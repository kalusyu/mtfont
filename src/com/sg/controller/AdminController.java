package com.sg.controller;


import java.io.File;
import java.util.List;

import com.google.gson.Gson;
import com.jfinal.aop.Before;
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.handler.Handler;
import com.jfinal.upload.UploadFile;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;
import com.sg.model.FontFileModel;
import com.sg.model.ModelDeviceInfo;
import com.sg.mtfont.bean.DeviceInfo;
import com.sg.mtfont.bean.FontFile;

@Before(ControllerInterceptor.class)  //controller 级  拦截器
public class AdminController extends Controller{

	@Before(ActionInterceptor.class)
	public void index(){
//		renderText("from admincontroller");
		setAttr("fileinfo", FontFileModel.dao.findAll());
		renderJsp("upload.jsp");
	}
	
	public void getAllDownload(){
		renderJson("fileinfo",FontFileModel.dao.findAll());
	}
	
	@ClearInterceptor //清除controller级的拦截器
	public void uploadfile(){
	    List<UploadFile> files = getFiles();
	    FontFile fontFile = new FontFile();
	    if (files != null){
    	    for (int i=0; i < files.size(); i++){
    	        handleFile(fontFile,files.get(i),i);
    	    }
	    }
		FontFileModel.dao.saveFile(fontFile);
		redirect("/admin"); 
	} 
	
	/**
	 * 
	 * @author Kalus Yu
	 * @param uploadFile
	 * @param i
	 * 2014年9月4日 下午1:56:52
	 */
	private void handleFile(FontFile fontFile,UploadFile uploadFile, int i) {
	    File file = uploadFile.getFile();
	    if (i == 1){
            fontFile.setFontDisplayName(file.getName());
            fontFile.setFontUri(uploadFile.getSaveDirectory());
            fontFile.setFontLocalPath(uploadFile.getSaveDirectory());
            long size = uploadFile.getFile().length();
            int mb = Math.round(size/1024.0f/1024.0f);
            fontFile.setFontSize(""+mb);
	    } else if (i == 0){
	        fontFile.setFontNamePic(file.getName());
	        fontFile.setFontNamePicUri(uploadFile.getSaveDirectory());
	    } else if (i == 2){
	        fontFile.setFontThumnailPic(file.getName());
	        fontFile.setFontThumnailPicUri(uploadFile.getSaveDirectory());
	    }
    }

    public void save(){
	    saveDeviceInfo();
	}
	            
	public void saveDeviceInfo(){
	    String jinfo = getPara("jinfo");
	    Gson gson = new Gson();
	    DeviceInfo info = gson.fromJson(jinfo, DeviceInfo.class);
	    ModelDeviceInfo model = new ModelDeviceInfo();
	    model.saveDeviceInfo(info);
//	    getModel(ModelDeviceInfo.class).save();
	}
	
	
	@ClearInterceptor(ClearLayer.ALL) //清除所有级别Global级和Controller级
	public void downloadfile(){
		int id = getParaToInt();
		FontFileModel info = FontFileModel.dao.findById(id);
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

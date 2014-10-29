package com.sg.controller;

import com.google.gson.Gson;
import com.jfinal.core.Controller;
import com.sg.model.MobileDevice;
import com.sg.mtfont.bean.DeviceInfo;

public class MobileDeviceController extends Controller{

	public void index(){
		
	}
	
	public void save(){
        saveDeviceInfo();
    }
                
    public void saveDeviceInfo(){
        String jinfo = getPara("jinfo");
        Gson gson = new Gson();
        DeviceInfo info = gson.fromJson(jinfo, DeviceInfo.class);
        MobileDevice model = getModel(MobileDevice.class);
        model.saveDeviceInfo(info);
    }
}

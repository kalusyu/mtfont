package com.sg.controller;


import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;
import com.sg.model.FreeUser;
import com.sg.model.MobileDevice;
import com.sg.model.NFile;
import com.sg.mtfont.bean.DeviceInfo;
import com.sg.mtfont.bean.FontFile;

@Before(ControllerInterceptor.class)  //controller 级  拦截器
public class AdminController extends Controller{

    @Before(ActionInterceptor.class)
    public void index(){
        setAttr("fileList", NFile.dao.getListFiles());
        render("/admin/admin.html"); 
    }
    
    /**
     * 通过url下载
     *
     * 2014年9月17日 下午10:28:25
     */
    public void downloadfileByUrl(){
        String url = getPara();
        File f = new File(url);
        if (f.exists()){
            renderFile(f);
            return;
        }
    }
    
    public boolean buySoft() {
        String imei = getPara();
        
        return FreeUser.dao.saveFreeUser(imei);
    }
    
    
    public void isFreeUser() {
        String imei = getPara();
        FreeUser freeuser = FreeUser.dao.findFreeUserByImei(imei);
        boolean flag = false;
        if (freeuser != null){
            flag = imei.equals(freeuser.get("imei"));
        }
        renderText(String.valueOf(flag));
    }
    
    /** 
     * 获得指定文件的byte数组 
     */  
    public static byte[] getBytes(String filePath){  
        byte[] buffer = null;  
        try {  
            File file = new File(filePath);  
            FileInputStream fis = new FileInputStream(file);  
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);  
            byte[] b = new byte[1000];  
            int n;  
            while ((n = fis.read(b)) != -1) {  
                bos.write(b, 0, n);  
            }  
            fis.close();  
            bos.close();  
            buffer = bos.toByteArray();  
        } catch (FileNotFoundException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return buffer;  
    }  
    
    
    /** 
     * 根据byte数组，生成文件 
     */  
    public static void getFile(byte[] bfile, String filePath,String fileName) {  
        BufferedOutputStream bos = null;  
        FileOutputStream fos = null;  
        File file = null;  
        try {  
            File dir = new File(filePath);  
            if(!dir.exists()&&dir.isDirectory()){//判断文件目录是否存在  
                dir.mkdirs();  
            }  
            file = new File(filePath+"\\"+fileName);  
            fos = new FileOutputStream(file);  
            bos = new BufferedOutputStream(fos);  
            bos.write(bfile);  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            if (bos != null) {  
                try {  
                    bos.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }  
            if (fos != null) {  
                try {  
                    fos.close();  
                } catch (IOException e1) {  
                    e1.printStackTrace();  
                }  
            }  
        }  
    }  
    
    public void toErrorPage(){
        renderError(404,"");
        renderError(500,"");//根据状态渲染
        
        renderNull();//不渲染  
        
        /***多次调用render只有最后一次生效**/
    }
}

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
import com.jfinal.aop.ClearInterceptor;
import com.jfinal.aop.ClearLayer;
import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.sg.interceptor.ActionInterceptor;
import com.sg.interceptor.ControllerInterceptor;
import com.sg.model.FontFileModel;
import com.sg.model.FreeUserModel;
import com.sg.model.ModelDeviceInfo;
import com.sg.mtfont.bean.DeviceInfo;
import com.sg.mtfont.bean.FontFile;

@Before(ControllerInterceptor.class)  //controller ��  ������
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
	
	// �ϴ��ļ�
	@ClearInterceptor //���controller����������
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
	 * 2014��9��4�� ����1:56:52
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
	
	
	/**
	 * ͨ��id����
	 *
	 * 2014��9��17�� ����10:28:46
	 */
	@ClearInterceptor(ClearLayer.ALL) //������м���Global����Controller��
	public void downloadfileById(){
		int id = getParaToInt();
		FontFileModel info = FontFileModel.dao.findById(id);
		File f = new File(info.getStr("url")+info.getStr("name"));
		if (f.exists()){
			renderFile(f);
			return;
		}
	}
	
	/**
	 * ͨ��url����
	 *
	 * 2014��9��17�� ����10:28:25
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
		
		return FreeUserModel.dao.saveFreeUser(imei);
	}
	
	
	public void isFreeUser() {
		String imei = getPara();
		FreeUserModel freeuser = FreeUserModel.dao.findFreeUserByImei(imei);
		boolean flag = false;
		if (freeuser != null){
		    flag = imei.equals(freeuser.get("imei"));
		}
		renderText(String.valueOf(flag));
	}
	
	public byte[] getPreviewFont(){
		int fontId = getParaToInt();
		FontFileModel fontfile = FontFileModel.dao.getFontFileById(fontId);
		String path = fontfile.getStr("pictureUri");
		return getBytes(path);
	}
	
	/** 
     * ���ָ���ļ���byte���� 
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
     * ����byte���飬�����ļ� 
     */  
    public static void getFile(byte[] bfile, String filePath,String fileName) {  
        BufferedOutputStream bos = null;  
        FileOutputStream fos = null;  
        File file = null;  
        try {  
            File dir = new File(filePath);  
            if(!dir.exists()&&dir.isDirectory()){//�ж��ļ�Ŀ¼�Ƿ����  
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
		renderError(500,"");//����״̬��Ⱦ
		
		renderNull();//����Ⱦ  
		
		/***��ε���renderֻ�����һ����Ч**/
	}
}

package com.sg.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.jfinal.core.Controller;
import com.jfinal.plugin.activerecord.Record;
import com.sg.interfaces.SgFont;
import com.sg.model.Count;
import com.sg.model.NFile;

public class MobileController extends Controller implements SgFont{
	
	public void index(){
		
	}

	@Override
	public void saveDeviceInfo() {
	}

	@Override
	public void getFontInfo() {
	    int begin = getParaToInt(0);
        int end = getParaToInt(1);
        List<NFile> listFiles = NFile.dao.getFileInfo(begin, end);
        List<Record> records = new  ArrayList<Record>();
        for (NFile nfile : listFiles){
            Count count = Count.dao.findByFileId(nfile.getInt("id"));
            Record record = new Record();
            record.set("loveNum", count.getLong("loveNum"));
            record.set("downloadNum", count.getLong("downloadNum"));
            record.set("id", nfile.get("id"));
            record.set("groupId", nfile.get("groupId"));
            record.set("name", nfile.get("name"));
            record.set("size", nfile.get("size"));
            record.set("type", nfile.get("type"));
            record.set("downloadUrl", nfile.get("downloadUrl"));
            record.set("relativeUrl", nfile.get("relativeUrl"));
            records.add(record);
        }
        
        renderJson(records);
	}
	
	public void getCountInfo(){
	    renderJson();
	}

	@Override
	public byte[] getPreviewFont() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void downloadFontFile() {
	    NFile file = NFile.dao.findById(getPara());
        renderFile(new File(file.getStr("downloadUrl")));
	}

	@Override
	public void buySoft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isFreeUser() {
		// TODO Auto-generated method stub
		
	}
	
	public void getPageInfo(){
	    int pageNumer = getParaToInt(0,1);
        int pageSize = getParaToInt(1,6);
        renderJson(NFile.dao.getPageFile(pageNumer, pageSize));
	}
	
	public synchronized void updateLoveNumber(){
	    int updateNumber = getParaToInt(0,1);
	    int fileId = getParaToInt(1);
	    Count count = Count.dao.findByFileId(fileId);
	    count.updateCount(updateNumber, 0);
	    renderJson(count);
	}
	
	public synchronized void updateDownloadNumber(){
	    int downloadNumber = getParaToInt(0,1);
        int fileId = getParaToInt(1);
        Count count = Count.dao.findByFileId(fileId);
        count.updateCount(0, downloadNumber);
        renderJson(count);
    }

}

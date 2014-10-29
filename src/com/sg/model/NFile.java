package com.sg.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.upload.UploadFile;

public class NFile extends Model<NFile>{

    public static NFile dao = new NFile();
    
    
    public List<NFile> getListFiles() {
        return find("select * from nfile order by id");
    }
    
    public void saveFile(UploadFile uf,String url){
        long size = uf.getFile().length();
        int mb = Math.round(size/1024.0f/1024.0f);
//        if (mb == 0){//kb
//            mb = Math.round(size/1024.0f);
//        }
        
        set("name", uf.getFileName()).set("type", uf.getContentType())
        .set("size", mb).set("downloadUrl", url + uf.getFileName()).save();
    }
    
    public void saveFile(UploadFile uf,int groupId){
        long size = uf.getFile().length();
        int mb = Math.round(size/1024.0f/1024.0f);
//        if (mb == 0){//kb
//            mb = Math.round(size/1024.0f);
//        }
        
        set("name", uf.getFileName()).set("type", uf.getContentType()).set("groupId", groupId)
        .set("size", mb).set("downloadUrl", uf.getSaveDirectory() + uf.getFileName()).save();
    }
    
    public void saveFile(UploadFile uf){
        long size = uf.getFile().length();
        int mb = Math.round(size/1024.0f/1024.0f);
//        if (mb == 0){//kb
//            mb = Math.round(size/1024.0f);
//        }
        
        set("name", uf.getFileName()).set("type", uf.getContentType())
        .set("size", mb).set("downloadUrl", uf.getSaveDirectory() + uf.getFileName()).save();
    }
}

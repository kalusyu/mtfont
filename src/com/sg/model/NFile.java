package com.sg.model;

import java.io.File;
import java.util.List;

import com.jfinal.kit.PathKit;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import com.jfinal.upload.UploadFile;
import com.sg.utils.apk.ApkUtils;

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
        String packageName = null;
        if (uf.getFileName().endsWith(".apk")){
        	packageName = ApkUtils.getAPKPageName(uf.getSaveDirectory() + File.separatorChar + uf.getFileName());
        }
        
        String webRootPath = PathKit.getWebRootPath();
        String relativeUrl = uf.getSaveDirectory().replace(webRootPath, "");
        set("name", uf.getFileName()).set("type", uf.getContentType()).set("groupId", groupId)
        .set("size", mb).set("downloadUrl", uf.getSaveDirectory() + uf.getFileName())
        .set("relativeUrl", relativeUrl + uf.getFileName())
        .set("packageName", packageName).save();
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

	public List<NFile> getFileInfo(int begin, int end) {
		return find("select * from nfile limit ?,?",begin,end);
	}

    public Page<NFile> getPageFile(int pageNumber,int pageSize) {
        return paginate(pageNumber, pageSize, "select id", "from nfile");
    }
}

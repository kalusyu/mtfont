package com.sg.controller;

import java.io.File;
import java.util.List;
import java.util.UUID;

import com.jfinal.core.Controller;
import com.jfinal.upload.UploadFile;
import com.sg.model.Group;
import com.sg.model.NFile;

public class NFileController extends Controller{
    
    public void index(){
        setAttr("fileList", NFile.dao.getListFiles());
        render("/admin/upload.html");
    }

    public void save(){
        NFile file = null;
        List<UploadFile> ufs = getFiles();
        Group group = getModel(Group.class);
        group.saveGroup(UUID.randomUUID().toString().substring(0,8));
        int groupId = group.getInt("id");
        for (UploadFile uf : ufs){
            file = getModel(NFile.class);
            file.saveFile(uf,groupId);
        }
        index();
    }
    
    public void downloadFile(){
        NFile file = NFile.dao.findById(getPara());
        renderFile(new File(file.getStr("downloadUrl")));
    }
}

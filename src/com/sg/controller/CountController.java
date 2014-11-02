package com.sg.controller;

import com.jfinal.core.Controller;
import com.sg.model.Count;

public class CountController extends Controller{

    public void index(){
        
    }
    
    public void save(){
    	int fileId = getParaToInt();
    	Count count = getModel(Count.class);
    }
    
    public void update(){
    	int fileId = getParaToInt();
    	Count count = Count.dao.findByFileId(fileId);
    	count.updateCount(10,10);
    }
}

package com.sg.controller;

import com.jfinal.core.Controller;
import com.sg.interfaces.SgFont;
import com.sg.model.NFile;

public class MobileController extends Controller implements SgFont{
	
	public void index(){
		
	}

	@Override
	public void saveDeviceInfo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void getFontInfo() {
		int begin = getParaToInt(0);
		int end = getParaToInt(1);
		renderJson(NFile.dao.getFileInfo(begin, end));
	}

	@Override
	public byte[] getPreviewFont() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void downloadFontFile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buySoft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isFreeUser() {
		// TODO Auto-generated method stub
		
	}


}

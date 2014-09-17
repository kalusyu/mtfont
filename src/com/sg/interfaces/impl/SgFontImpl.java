package com.sg.interfaces.impl;

import java.util.List;

import com.sg.interfaces.SgFont;
import com.sg.mtfont.bean.DeviceInfo;
import com.sg.mtfont.bean.FontFile;

/**
 * 
 * @author Kalus_Yu
 *
 */
public class SgFontImpl implements SgFont{
	
	private static  SgFontImpl sgFont;
	
	public SgFont getInstance(){
		if (sgFont == null){
			sgFont = new SgFontImpl();
		}
		return sgFont;
	}

	@Override
	public int sendDeviceInfo(DeviceInfo info) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<FontFile> sendRequest(int begin, int end) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FontFile> getFontList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public byte[] getPreviewFont(int fontId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void downloadFontFile(String fontUrl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean buySoft(String imei) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFreeUser(String imei) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}

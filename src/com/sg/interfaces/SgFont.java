package com.sg.interfaces;

import java.util.List;

import com.sg.mtfont.bean.DeviceInfo;
import com.sg.mtfont.bean.FontFile;

/**
 * 
 * @author Kalus Yu
 *
 */
public interface SgFont {

    int sendDeviceInfo(DeviceInfo info);
    
    List<FontFile> sendRequest(int begin,int end);
    
    List<FontFile> getFontList();
    
    byte[] getPreviewFont(int fontId);
    
    void downloadFontFile(String fontUrl);
    
    boolean buySoft(String imei);
    
    //TODO 先存本地再存服务器
    boolean isFreeUser(String imei); 
}

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

    /**
     * 存储设备信息
     *
     * @param info
     * @return
     * 2014年9月17日 下午8:31:00
     */
    int sendDeviceInfo(DeviceInfo info);
    
    /**
     * 
     * 请求 begin 到 end 条数的数据
     * @param begin
     * @param end
     * @return
     * 2014年9月17日 下午8:31:16
     */
    List<FontFile> sendRequest(int begin,int end);
    
    /**
     * 获取font资源列表
     *
     * @return
     * 2014年9月17日 下午8:31:20
     */
    List<FontFile> getFontList();
    
    /**
     * 获取字体预览
     *
     * @param fontId
     * @return
     * 2014年9月17日 下午8:31:24
     */
    byte[] getPreviewFont(int fontId);
    
    /**
     * 
     * 根据url下载字体文件
     * @param fontUrl
     * 2014年9月17日 下午8:31:41
     */
    void downloadFontFile(String fontUrl);
    
    /**
     * 
     * 根据imei号购买免费软件
     * @param imei
     * @return
     * 2014年9月17日 下午8:31:45
     */
    boolean buySoft(String imei);
    
    //TODO 先存本地再存服务器
    /**
     * 
     * 判断用户是否已免费
     * @param imei
     * @return
     * 2014年9月17日 下午8:31:50
     */
    boolean isFreeUser(String imei); 
}

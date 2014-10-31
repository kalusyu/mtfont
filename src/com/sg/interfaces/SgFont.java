package com.sg.interfaces;

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
    void saveDeviceInfo();
    
    /**
     * 
     * 请求 begin 到 end 条数的数据
     * @param begin
     * @param end
     * @return
     * 2014年9月17日 下午8:31:16
     */
    void getFontInfo();
    
    /**
     * 获取字体预览
     *
     * @param fontId
     * @return
     * 2014年9月17日 下午8:31:24
     */
    byte[] getPreviewFont();
    
    /**
     * 
     * 根据url下载字体文件
     * 2014年9月17日 下午8:31:41
     */
    void downloadFontFile();
    
    /**
     * 
     * 根据imei号购买免费软件
     * @return
     * 2014年9月17日 下午8:31:45
     */
    void buySoft();
    
    //TODO 先存本地再存服务器
    /**
     * 
     * 判断用户是否已免费
     * @return
     * 2014年9月17日 下午8:31:50
     */
    void isFreeUser(); 
}

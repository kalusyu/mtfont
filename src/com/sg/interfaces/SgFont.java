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
     * �洢�豸��Ϣ
     *
     * @param info
     * @return
     * 2014��9��17�� ����8:31:00
     */
    int sendDeviceInfo(DeviceInfo info);
    
    /**
     * 
     * ���� begin �� end ����������
     * @param begin
     * @param end
     * @return
     * 2014��9��17�� ����8:31:16
     */
    List<FontFile> sendRequest(int begin,int end);
    
    /**
     * ��ȡfont��Դ�б�
     *
     * @return
     * 2014��9��17�� ����8:31:20
     */
    List<FontFile> getFontList();
    
    /**
     * ��ȡ����Ԥ��
     *
     * @param fontId
     * @return
     * 2014��9��17�� ����8:31:24
     */
    byte[] getPreviewFont(int fontId);
    
    /**
     * 
     * ����url���������ļ�
     * @param fontUrl
     * 2014��9��17�� ����8:31:41
     */
    void downloadFontFile(String fontUrl);
    
    /**
     * 
     * ����imei�Ź���������
     * @param imei
     * @return
     * 2014��9��17�� ����8:31:45
     */
    boolean buySoft(String imei);
    
    //TODO �ȴ汾���ٴ������
    /**
     * 
     * �ж��û��Ƿ������
     * @param imei
     * @return
     * 2014��9��17�� ����8:31:50
     */
    boolean isFreeUser(String imei); 
}

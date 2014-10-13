package com.sg.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.jfinal.plugin.activerecord.Model;
import com.sg.mtfont.bean.DeviceInfo;

public class ModelDeviceInfo extends Model<ModelDeviceInfo>{

    /**
     * 
     */
    private static final long serialVersionUID = 873634614017296535L;

    /**
     * save phone infomation
     * @author Kalus Yu
     * @param info
     * 2014年8月23日 下午8:32:11
     */
    public void saveDeviceInfo(DeviceInfo info) {
//        UUID uuid = UUID.randomUUID();
        new ModelDeviceInfo().set("imei", info.getImei())
        .set("imsi", info.getImsi() )
        .set("macAddress",info.getMacAddress() )
        .set("product", info.getProduct())
        .set("brand", info.getBrand())
        .set("manufacturer", info.getManufacturer())
        .set("device", info.getDevice())
        .set("sdk", info.getSdk())
        .set("board", info.getBoard())
        .set("display", info.getDisplay())
        .set("host",info.getHost() )
        .set("model", info.getModel())
        .set("time", formatTime())
        .set("androidVersion", info.getAndroidVersion())
        .set("telephone", info.getTelephone())
        .set("networkType", info.getNetworkType())
        .set("simOperatorName", info.getSimOperatorName())
        .set("simSerialNumber", info.getSimSerialNumber())
        .set("simState", info.getSimState()).save();
        
    }
    
    public String formatTime(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}

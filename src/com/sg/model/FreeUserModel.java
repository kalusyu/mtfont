package com.sg.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

public class FreeUserModel extends Model<FreeUserModel>{
	
	public static final FreeUserModel dao = new FreeUserModel();

	/**
	 * 
	 *
	 * @param imei
	 * @return
	 * 2014年9月17日 下午10:36:55
	 */
	public FreeUserModel findFreeUserByImei(String imei){
		List<FreeUserModel> lists =  dao.find("select * from freeuser where imei="+imei);
		if (lists.size() != 0){
		    return lists.get(0);
		}
		return null;
	}
	
	public boolean saveFreeUser(String imei){
		return dao.set("imei", imei).save();
	}
}

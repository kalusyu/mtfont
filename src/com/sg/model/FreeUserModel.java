package com.sg.model;

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
		return dao.find("select * from freeuser where imei="+imei).get(0);
	}
	
	public boolean saveFreeUser(String imei){
		return dao.set("imei", imei).save();
	}
}

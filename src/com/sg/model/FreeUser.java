package com.sg.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

public class FreeUser extends Model<FreeUser>{
	
	public static final FreeUser dao = new FreeUser();

	/**
	 * 
	 *
	 * @param imei
	 * @return
	 * 2014��9��17�� ����10:36:55
	 */
	public FreeUser findFreeUserByImei(String imei){
		List<FreeUser> lists =  dao.find("select * from freeuser where imei="+imei);
		if (lists.size() != 0){
		    return lists.get(0);
		}
		return null;
	}
	
	public boolean saveFreeUser(String imei){
		return dao.set("imei", imei).save();
	}
}

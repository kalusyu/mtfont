package com.sg.model;

import java.util.List;

import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * @author Kalus Yu
 *
 */
public class Count extends Model<Count>{

    public static Count dao = new Count();

	public void updateCount() {
		set("loveNum", getInt("loveNum") + 1).set("downloadNum", getInt("downloadNum")+1).update();
	}

	public Count findByFileId(int fileId) {
		List<Count> list = find("select * from count where fileId=?",fileId);
		if (list.size() != 0){
			return list.get(0);
		}
		return null;
	}
    
    
}

package com.sg.model;

import com.jfinal.plugin.activerecord.Model;

/**
 * 
 * @author Kalus Yu
 *
 */
public class Group extends Model<Group>{

    public static Group dao = new Group();

	public void saveGroup(String groupName) {
		set("groupName", groupName).save();
	}
}

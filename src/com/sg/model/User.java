package com.sg.model;


import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Record;

/*mysql> desc user;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| userId | smallint(6)  | YES  |     | NULL    |       |
| name   | varchar(255) | YES  |     | NULL    |       |
| age    | smallint(6)  | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
3 rows in set (0.01 sec)*/

public class User extends Model<User>{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6555919526998605714L;
	
	public static final User dao = new User();
	
	public java.util.List<User> findAll(){
		return find("select * from user order by userId asc");
	}
	
	public void saveUser(){
		//Db + Record 模式
		Record r = new Record().set("id", 10).set("name", "Sugur").set("age", 10);
		Db.save("user", r);
		
//		findByCache(cacheName, key, sql)  //使用缓存 提高性能
	}

	
}

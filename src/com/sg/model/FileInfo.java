package com.sg.model;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.upload.UploadFile;

/**+-------+--------------+------+-----+---------+-------+
| Field | Type         | Null | Key | Default | Extra |
+-------+--------------+------+-----+---------+-------+
| id    | int(11)      | NO   | PRI | 0       |       |
| name  | varchar(255) | YES  |     | NULL    |       |
| url   | varchar(255) | YES  |     | NULL    |       |
+-------+--------------+------+-----+---------+-------+
3 rows in set (0.01 sec)*/
public class FileInfo extends Model<FileInfo>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2350358862407290875L;
	public static final FileInfo dao = new FileInfo();
	
	public java.util.List<FileInfo> findAll(){
		return find("select * from fileinfo order by id asc");
	}
	
	public void saveFile(UploadFile file){
		new FileInfo().set("name", file.getFileName()).set("url", file.getSaveDirectory()).save();
	}
}

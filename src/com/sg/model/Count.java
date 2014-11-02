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
    public static final int DEFAULT_UPDATE_SIZE = 1;
    
    public static final int INIT_SIZE = 10;

    /**
     * 
     * @author Kalus Yu
     * @param updateLoveSize 增加的喜欢数量
     * @param upadteDownloadSize 增加的下载数量
     * 2014年11月2日 下午2:38:05
     */
	public void updateCount(int updateLoveSize,int upadteDownloadSize) {
		set("loveNum", getLong("loveNum") + updateLoveSize)
		.set("downloadNum", getLong("downloadNum") + upadteDownloadSize).update();
	}
	
	public List<Count> findList(){
	    return find("select * from count");
	}

	public Count findByFileId(int fileId) {
		List<Count> list = find("select * from count where fileId=?",fileId);
		if (list.size() != 0){
			return list.get(0);
		}
		return null;
	}

    public void initSave(int fileId) {
        set("loveNum", INIT_SIZE)
        .set("downloadNum", INIT_SIZE).set("fileId", fileId).save();
    }
    
    
}

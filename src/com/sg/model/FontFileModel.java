
package com.sg.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

import com.jfinal.plugin.activerecord.Model;
import com.sg.mtfont.bean.FontFile;


public class FontFileModel extends Model<FontFileModel> {

    /**
	 * 
	 */
    private static final long serialVersionUID = 2350358862407290875L;
    public static final FontFileModel dao = new FontFileModel();

    public java.util.List<FontFileModel> findAll() {
        return find("select * from fileinfo order by id asc");
    }
    
    public FontFileModel getFontFileById(int id){
    	return find("select * from fileinfo where id="+id).get(0);
    }

    public void saveFile(FontFile file) {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        try {
            set("fontDisplayName", file.getFontDisplayName())
                    .set("fontName", new String(str.getBytes(),"UTF-8"))
                    .set("fontSize", file.getFontSize())
                    .set("fontUri", file.getFontLocalPath())
                    .set("fontNamePic", file.getFontNamePic())
                    .set("fontNamePicUri", file.getFontNamePicUri())
                    .set("fontThumnailPic", file.getFontThumnailPic())
                    .set("fontThumnailPicUri", file.getFontThumnailPicUri())
                    .set("pictureUri", file.getPictureUri())
                    .set("fontLocalPath", file.getFontLocalPath())
                    .set("pictureLocalPath", file.getPictureLocalPath())
                    .set("packageName", file.getPackageName())
                    .set("loveNumbers", file.getLoveNumbers())
                    .set("downloadNumbers", file.getDownloadNumbers()).save();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}

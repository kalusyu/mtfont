
package com.sg.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.upload.UploadFile;


public class FileInfo extends Model<FileInfo> {

    /**
	 * 
	 */
    private static final long serialVersionUID = 2350358862407290875L;
    public static final FileInfo dao = new FileInfo();

    public java.util.List<FileInfo> findAll() {
        return find("select * from fileinfo order by id asc");
    }

    public void saveFile(File file) {
        UUID uuid = UUID.randomUUID();
        FileInputStream fis;
        try {
            fis = new FileInputStream(file);
            new FileInfo().set("fontDisplayName", file.getName())
                    .set("fontName", uuid)
                    .set("fontSize", String.valueOf(fis.available()))
                    .set("fontUri", file.getAbsolutePath()).save();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.sg.ext;

import java.io.IOException;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.resource.WebAppResourceLoader;
import org.beetl.ext.jfinal.BeetlRender;

import com.jfinal.kit.PathKit;
import com.jfinal.render.IMainRenderFactory;
import com.jfinal.render.Render;
import com.sg.Constant;

/**
 * 
 * @author KaluYu
 *
 */
public class MyMainRenderFactory implements IMainRenderFactory{
	
	public static final String sViewExtention = ".html";
	private GroupTemplate gt;
	
	public MyMainRenderFactory() {
		
		try{
			WebAppResourceLoader loader = new WebAppResourceLoader(PathKit.getWebRootPath() + Constant.BEETL_ROOT_DIR);
			Configuration config = Configuration.defaultConfiguration();
			config.setStatementStart("@");
			config.setStatementEnd(null);
			gt = new GroupTemplate(loader, config);
		} catch (IOException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public Render getRender(String view) {
		return new BeetlRender(gt, sViewExtention);
	}

	@Override
	public String getViewExtension() {
		return sViewExtention;
	}

}

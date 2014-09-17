package com.sg;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.sg.controller.FontController;
import com.sg.interceptor.GlobalInterceptor;
import com.sg.model.FontFileModel;
import com.sg.model.FreeUserModel;
import com.sg.model.ModelDeviceInfo;
import com.sg.routes.BackRoutes;

public class MainConfig extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		loadPropertyFile("dbconfig.txt");
		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
//		me.setUrlParaSeparator("?"); //设置参数分隔符
	}

	@Override
	public void configRoute(Routes me) {
		me.add("/font",FontController.class);
		me.add(new BackRoutes());
	}

	@Override
	public void configPlugin(Plugins me) {
		C3p0Plugin plugin = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password"));
		me.add(plugin);
		
//		me.add(new EhCachePlugin());//
		
		ActiveRecordPlugin arp = new ActiveRecordPlugin(plugin);
		me.add(arp);
		
		arp.addMapping("fileinfo", FontFileModel.class);
		arp.addMapping("deviceinfo", ModelDeviceInfo.class);
		arp.addMapping("freeuser", FreeUserModel.class);
	}

	@Override
	public void configInterceptor(Interceptors me) {
		me.add(new GlobalInterceptor());//这里是配置全局的拦截器
	}

	@Override
	public void configHandler(Handlers me) {
	}
	
	@Override
	public void afterJFinalStart() {
		super.afterJFinalStart();
		//项目启动之后  一些额外操作
	}
	
	@Override
	public void beforeJFinalStop() {
		super.beforeJFinalStop();
		//项目关闭之前  写缓存之类的
	}

	
}

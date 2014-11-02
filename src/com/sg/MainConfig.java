package com.sg;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.render.ViewType;
import com.sg.controller.AdminController;
import com.sg.ext.MyMainRenderFactory;
import com.sg.interceptor.GlobalInterceptor;
import com.sg.model.Count;
import com.sg.model.FreeUser;
import com.sg.model.Group;
import com.sg.model.MobileDevice;
import com.sg.model.NFile;
import com.sg.routes.BackRoutes;
import com.sg.routes.FrontRoutes;

public class MainConfig extends JFinalConfig{

    @Override
    public void configConstant(Constants me) {
        me.setDevMode(true);
        loadPropertyFile("dbconfig.properties");
//      me.setUrlParaSeparator("?"); //设置参数分隔符
        me.setError404View("/common/404.html");
        me.setError500View("/common/500.html");
        me.setMainRenderFactory(new MyMainRenderFactory());
        me.setMaxPostSize(1024 * 1024 * 10 * 2);
    }

    @Override
    public void configRoute(Routes me) {
        me.add(new FrontRoutes());
        me.add(new BackRoutes());
    }

    @Override
    public void configPlugin(Plugins me) {
        C3p0Plugin plugin = new C3p0Plugin(getProperty("jdbcUrl"), getProperty("user"), getProperty("password"));
        me.add(plugin);
        
        ActiveRecordPlugin arp = new ActiveRecordPlugin(plugin);
        arp.setShowSql(true);
        
        arp.addMapping("deviceinfo", MobileDevice.class);
        arp.addMapping("freeuser", FreeUser.class);
        arp.addMapping("nfile", NFile.class).addMapping("group", Group.class).addMapping("count", Count.class);
        
        me.add(arp);
    }

    @Override
    public void configInterceptor(Interceptors me) {
//      me.add(new GlobalInterceptor());//这里是配置全局的拦截器
    }

    @Override
    public void configHandler(Handlers me) {
        me.add(new ContextPathHandler(Constant.CONTEXT_PATH));
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
    
    public static void main(String[] args) {
        JFinal.start("WebRoot", 80, "/", 5);
    }

    
}

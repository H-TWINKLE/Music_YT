package com.yt.plugin;

import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.IPlugin;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;

import javax.sql.DataSource;

public class TestPlugin implements IPlugin {

    private Prop p;

    private ActiveRecordPlugin activeRecordPlugin;

    private DruidPlugin druidPlugin;

    private void _init() {
        p = PropKit.use("config-dev.properties");
    }

    private void init() {

        druidPlugin = new DruidPlugin(p.get("jdbcUrl"), p.get("user"), p.get("password"));

        activeRecordPlugin = new ActiveRecordPlugin(druidPlugin);
        activeRecordPlugin.setShowSql(PropKit.getBoolean("devMode", false));

        //_MappingKit.mapping(activeRecordPlugin);

    }

    public TestPlugin() {

        _init();
        init();

    }


    public TestPlugin(boolean flag) {

        if (flag) {

            _init();

            druidPlugin = new DruidPlugin(p.get("jdbcUrl"), p.get("user"), p.get("password"));

            druidPlugin.start();
        } else {
            init();
        }
    }


    public DataSource getDateSource() {
        return druidPlugin.getDataSource();
    }


    @Override
    public boolean start() {

        if (activeRecordPlugin == null || druidPlugin == null)
            return true;

        return druidPlugin.start() && activeRecordPlugin.start();
    }

    @Override
    public boolean stop() {
        return activeRecordPlugin.stop() && druidPlugin.stop();
    }


}

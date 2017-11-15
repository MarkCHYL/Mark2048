package com.game.show.mark2048;

import android.app.Application;

import net.youmi.android.AdManager;

/**
 * Created by mark on 2017/11/14.
 * $desc$
 * Mail: 2285581945@qq.com
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initYMAds();
    }
    /**
     * 有米广告
     */
    private void initYMAds() {
        AdManager.getInstance(this).init("a694b18cb287cfe2", "2cf4d2ab7481575e", false);
    }
}

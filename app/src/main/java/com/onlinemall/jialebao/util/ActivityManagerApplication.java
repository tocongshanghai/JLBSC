package com.onlinemall.jialebao.util;

import android.app.Activity;
import android.app.Application;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 陶聪
 * 创作时间: 2016-08-24.16:28
 * 该类的作用: 替代系统的application, 添加销毁activity
 * 公司：上海家乐宝真好电子商务公司
 */
public class ActivityManagerApplication extends Application {
    private static Map<String, Activity> destoryMap = new HashMap<>();


    @Override
    public void onCreate() {
        super.onCreate();
    }


    /*
    *@author 陶聪
    *@desc 增加activity
    */
    public static void addDestoryActivity(Activity activity, String activityName) {
        if (!destoryMap.containsValue(activity)) {
            destoryMap.put(activityName, activity);
        }
    }


    /*
    *@author 陶聪
    *@desc 销毁activity
    */
    public static void destoryActivity(String activityName) {
        Activity activity = destoryMap.get(activityName);
        activity.finish();
    }


}

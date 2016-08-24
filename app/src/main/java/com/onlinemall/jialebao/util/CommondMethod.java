package com.onlinemall.jialebao.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by 陶聪
 * 创作时间: 2016-08-24.16:57
 * 该类的作用: 常规方法
 * 公司：上海家乐宝真好电子商务公司
 */
public class CommondMethod {

    /*
    *@author 陶聪
    *@desc 获取网路状态
    */

    public static boolean getNetState(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager == null) {
            return false;
        }
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return !(!networkInfo.isAvailable() || networkInfo == null) && networkInfo.isConnected();

    }


    /*
    *@author 陶聪
    *@desc 获取本地版本号
    */
    public static int getNativeVersion(Context context) {
        int versionCode = 0;
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            versionCode = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return versionCode;
    }


    /*
    *@author 陶聪
    *@desc获取屏幕的宽高
    */
    public static int[] getScreenWH(Activity activity) {
        int[] WH = new int[2];
        WindowManager windowManager = activity.getWindowManager();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        WH[0] = displayMetrics.widthPixels;
        WH[1] = displayMetrics.heightPixels;
        return WH;
    }

    /*
    *@author 陶聪
    *@desc px转dp
    */
    public static int px2dp(Activity activity, int px) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = activity.getWindowManager();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        float density = displayMetrics.density;
        return (int) (px / density + 0.5f);
    }

    /*
    *@author 陶聪
    *@desc 判断是不是平板
    */
    public static boolean isPad(Context context) {
        return (context.getResources().getConfiguration().screenLayout & Configuration.SCREENLAYOUT_SIZE_MASK) >= Configuration.SCREENLAYOUT_SIZE_LARGE;
    }
}

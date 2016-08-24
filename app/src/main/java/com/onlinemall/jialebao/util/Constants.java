package com.onlinemall.jialebao.util;

/**
 * 此类描述的是：储存常量
 * 作者：肖雷
 * 时间：2015/12/10 15:01
 * 公司：上海家乐宝真好电子商务有限公司
 */
public interface Constants {
    // 请求服务端的地址
    /** 田总 */
//     String URL = "http://192.168.1.168:8080/jialebao/";
    /** 肖雷 */
//	 String URL = "http://192.168.1.68:8080/jialebao/";
    /** 李博凯 */
    // String URL = "http://192.168.1.188:8080/jialebao/";
    /** 王洛龙 */
//	 String URL = "http://192.168.1.66:8080/jialebao/";
    /** 正式库 */
//	 String URL = "http://www.jialebao.cc/";//121.40.205.167
    /** 测试库 */
    String URL = "http://121.40.155.207/";
    /** webapp测试入口 */
    String WEB_APP_URL = "http://121.40.155.207/mobile_web_app/index.html";
    /** webapp庞博入口 */
//    String WEB_APP_URL = "http://192.168.1.9:8080/jialebao/mobile_web_app/index.html";
    /** webapp正式入口*/
//    String WEB_APP_URL="http://www.jialebao.cc/mobile_web_app/index.html";
    /** webappIPad测试入口 */
    String WEB_APP_IPAD_URL = "http://121.40.155.207";
    /** webappIPad正式入口 */
//    String WEB_APP_IPAD_URL = "http://www.jialebao.cc";
    // 接口
    /** APP首页获取分类接口 */
    String IF_website_info = "website_info";
    // 接口中的方法
    /** APP首页获取分类及默认选择数据方法 */
    String MD_app_load_page = "app_load_page";
    /** APP首页获取新闻信息  */
    String MD_news_list = "news_list";
    /** APP首页获取招聘信息 */
    String MD_job_info_list = "job_info_list";
    //错误信息
    String NETWORKERRORINFO = "网络状态欠佳，请稍后再试";
    //服务端返回状态标示
    String STATUS = "status";
    //服务端返回信息标示
    String MSG = "msg";
    //服务端返回数据标示
    String RETURNDATA = "returnData";
}

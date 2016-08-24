package com.onlinemall.jialebao.util;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 陶聪
 * 创作时间: 2016-08-24.17:32
 * 该类的作用: 将json转换成jsonobject
 * 公司：上海家乐宝真好电子商务公司
 */
public class ParseData {
    public  static JSONObject getJsonObject(String json){
        JSONObject jsonObject=new JSONObject();
        Gson gson=new Gson();
        int status=-1;
        String msg=Constants.NETWORKERRORINFO;
        try {
            jsonObject.put(Constants.STATUS,status);
            jsonObject.put(Constants.MSG,msg);
            JSONObject data=gson.fromJson(json,JSONObject.class);
            status= (int) data.get(Constants.STATUS);
            msg= (String) data.get(Constants.MSG);
            if ((int)data.get(Constants.STATUS) != 0) {
                jsonObject = data;
            } else {
                jsonObject = (JSONObject) data.get(Constants.RETURNDATA);
                if (jsonObject != null) {
                    jsonObject.put(Constants.STATUS, status);
                    jsonObject.put(Constants.MSG, msg);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return  jsonObject;
    }

}

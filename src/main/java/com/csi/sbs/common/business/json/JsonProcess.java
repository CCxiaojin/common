package com.csi.sbs.common.business.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonProcess {
	
	   /**
	    * 将返回的JSON字符串转为JSON对象(针对单个JSON字符串对象)
	    */
	   public static JSONObject changeToJSONObject(String str){
		   return (JSONObject) JSON.parse(str);
	   }
	   
	   /**
	    * 将返回的JSON字符串转为JSONArray数组(针对JSON对象数组)
	    */
	   public static JSONArray changeToJSONArray(String str){
		   return JSON.parseArray(str);
	   }
	   
	   /**
	    * 返回JSONObject的value
	    */
	   public static String returnValue(JSONObject jsonObject,String key){
		   return jsonObject.getString(key);
	   }
	   
	   /**
	    * 将实体对象转换为JSON
	    * @param <T>
	    */
	   public static <T> String changeEntityTOJSON(T t){
		   return JSONObject.toJSONString(t);
	   }

}

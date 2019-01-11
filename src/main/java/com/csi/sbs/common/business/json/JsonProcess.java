package com.csi.sbs.common.business.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class JsonProcess {
	
	   /**
	    * �����ص�JSON�ַ���תΪJSON����(��Ե���JSON�ַ�������)
	    */
	   public static JSONObject changeToJSONObject(String str){
		   return (JSONObject) JSON.parse(str);
	   }
	   
	   /**
	    * �����ص�JSON�ַ���תΪJSONArray����(���JSON��������)
	    */
	   public static JSONArray changeToJSONArray(String str){
		   return JSON.parseArray(str);
	   }
	   
	   /**
	    * ����JSONObject��value
	    */
	   public static String returnValue(JSONObject jsonObject,String key){
		   return jsonObject.getString(key);
	   }
	   
	   /**
	    * ��ʵ�����ת��ΪJSON
	    * @param <T>
	    */
	   public static <T> String changeEntityTOJSON(T t){
		   return JSONObject.toJSONString(t);
	   }

}

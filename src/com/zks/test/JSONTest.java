package com.zks.test;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import com.zks.test.entity.Root;

public class JSONTest {

	@Test
	public void testOne() {
		try{
		String str="{\"ID\": \"9caaa29a-7297-4195-89ee-b7bbefccc9cc\",     \"VER\": \"1.0\",     \"name\": \" la_storehouse\",     \"orgno\": \"la0100440000002\",     \"orgname\": \"郑州代储库\",     \"sendtime\": \"2016-09-28 17:05:51\",     \"type\": \"i\",     \"body\": [     {         \"code\": \"la0100440000002001\",         \"name\": \"1号仓\",         \"orgcode\": \"la0100440000002\",         \"orgname\": \"郑州代储库\",         \"gtmatypecode\": \"001\",         \"gtmatypename\": \"平房仓\",         \"submitdate\": \"2003-08-29\",         \"wall\": \"砖\",         \"roof\": \"砖\",         \"structure\": \"砖 \",         \"ground\": \"砖 \",         \"designcapacity\": 5000,         \"confirmcapacity\": 5000,         \"outlength\": 20,         \"outwidth\": 20,         \"outeavesheight\": 20,         \"outroofheight\": 20,         \"outdiameter\": 20,         \"outwallarea\": 20,         \"inlength\": 20,         \"inwidth\": 20,         \"ineavesheight\": 20,         \"instoreheight\": 20,         \"indiameter\": 20,         \"involume\": 20,         \"doornumber\": 10,         \"doorheight\": 10,         \"doorwidth\": 10,         \"memo\": \"1号仓\"     },     {         \"code\": \"la0100440000002002\",         \"name\": \"2号仓\",         \"orgcode\": \"la0100440000002\",         \"orgname\": \"郑州代储库\",         \"gtmatypecode\": \"001\",         \"gtmatypename\": \"平房仓\",         \"submitdate\": \"2003-08-29\",         \"wall\": \"砖\",         \"roof\": \"砖\",         \"structure\": \"砖 \",         \"ground\": \"砖 \",         \"designcapacity\": 5000,         \"confirmcapacity\": 5000,         \"outlength\": 20,         \"outwidth\": 20,         \"outeavesheight\": 20,         \"outroofheight\": 20,         \"outdiameter\": 20,         \"outwallarea\": 20,         \"inlength\": 20,         \"inwidth\": 20,         \"ineavesheight\": 20,         \"instoreheight\": 20,         \"indiameter\": 20,         \"involume\": 20,         \"doornumber\": 10,         \"doorheight\": 10,         \"doorwidth\": 10,         \"memo\": \"2号仓\"     } ],     \"digest1\": \"上传仓房基本信息数据\" }";
/*		JSONObject jsonObject=JSONObject.fromObject(str);
		Root root=(Root) jsonObject.toBean(jsonObject,Root.class);
		System.out.println(root);*/
	    ObjectMapper mapper = new ObjectMapper();
		Root readValue = mapper.readValue(str,Root.class);
		System.out.println(readValue);
	}catch(Exception e){
		e.printStackTrace();
	}
	}

}

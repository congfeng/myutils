/**
 * Copyright (c) mbaobao.com 2011 All Rights Reserved.
 */
package com.cf.code.utils;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.AccessLogValve;

/**
 *                       
 * @Filename: AccessLogValveExt.java
 * @Version: 1.0
 * @Author: 丛峰
 * @Email: congfeng@ehaier.com
 *
 */
public class AccessLogValveExt extends AccessLogValve{

	@Override
	public void log(Request request, Response response, long time) {
		if("head".equalsIgnoreCase(request.getMethod())){
			return ;
		}
		
		super.log(request, response, time);
	}
	
}

package com.sf.gxl.dubbo.service.impl;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.sf.gxl.dubbo.service.TextTransform;
@Service
public class TextTransformImpl implements TextTransform {

	public String transform2Upper(String text) {
		if(StringUtils.isBlank(text)){
			return text;
		}
		return text.toUpperCase();
	}
	
	public String transform2Lower(String text){
		if(StringUtils.isBlank(text)){
			return text;
		}
		return text.toLowerCase();
	}
}

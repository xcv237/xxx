package com.zhiyou100.springBoot.Invo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHandler {
	@org.springframework.web.bind.annotation.ExceptionHandler
	@ResponseBody
	public String exceptionHandler(HttpServletRequest req, Exception e){
		return "网页走丢了";
	}
}

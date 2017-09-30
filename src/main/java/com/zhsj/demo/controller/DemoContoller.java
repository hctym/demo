package com.zhsj.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhsj.demo.domain.User;
import com.zhsj.demo.util.DataResult;
import com.zhsj.demo.util.Result;

@Controller
public class DemoContoller {

	@RequestMapping(value="test")
	@ResponseBody
	public Object test(){
		User user = new User();
		user.setName("xlc");
		user.setAge(2000);
		return DataResult.defaultSuccess(user);
	}
	
	@RequestMapping(value="test01")
	@ResponseBody
	public Object test01(){
		return Result.defaultSuccess();
	}
	
	@RequestMapping(value="test02")
	@ResponseBody
	public Object test02(){
		return Result.defaultError();
	}
	
	
}

package com.qa.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springboot.pojo.User;
import com.qa.springboot.pojo.Userinfo;
import com.qa.springboot.service.UserInfoService;
import com.qa.springboot.service.UserService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	UserService us;
	
	@Autowired
	UserInfoService uis;
	
	@RequestMapping("/rg")
	public String register(@Valid Userinfo userinfo,Errors e,User user,String repwd){
		
		int userid= (int)(Math.random()*10000);
		
		user.setUserid(userid);
		userinfo.setUserid(userid);
		
		user.setUtid(1);
		
		//账号是否存在
		String logname = user.getLogname();
		boolean b = us.checkLogname(logname);
		
		//只能为字母或数字，长度6-16
		String reg="^[a-zA-Z0-9]{6,16}$";
		if(!logname.matches(reg)){
			return"账号不符合规范";
		}
		if(!b){
			return"账号已存在";
		}
		//密码6-16
		String pwdreg="^[a-zA-Z0-9]{6,16}$";
		String pwd = user.getPassword();
		if(!pwd.matches(pwdreg)){
			return"密码不符合规范";
		}
		//确认密码
		if(!repwd.equals(pwd)){
			return"密码输入不一致";
		}
		
		//生日为过去时间
		FieldError error = e.getFieldError();
		
		if(error!=null){
			return error.getDefaultMessage();
		}
		
		us.addUser(user);
		uis.addUserinfo(userinfo);
		
		
		return "ok";
	}
}

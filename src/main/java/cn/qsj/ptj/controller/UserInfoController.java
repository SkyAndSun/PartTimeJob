package cn.qsj.ptj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qsj.ptj.common.web.JsonResult;
import cn.qsj.ptj.entity.UserInfo;
import cn.qsj.ptj.service.UserInfoService;

@Controller
@RequestMapping("user/")
public class UserInfoController {
	
	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value="addUserInfo",method = RequestMethod.POST,consumes = "application/json")
	@ResponseBody
	public JsonResult addUserInfo(@RequestBody UserInfo entity){
		System.out.println(entity);
		userInfoService.addUserInfo(entity);
		return new JsonResult();
	}
	
	@RequestMapping("findByUserId")
	@ResponseBody
	public JsonResult findByUserId(Integer userId){
		UserInfo userInfo = userInfoService.findByUserId(userId);
		return new JsonResult(userInfo);
	}
	
	@RequestMapping("login")
	@ResponseBody
	public JsonResult login(@RequestBody UserInfo user){
		UserInfo userInfo = userInfoService.findByUserName(user.getUserName());
		System.out.println(userInfo.getFlag());
		return new JsonResult(userInfo.getFlag());
	}
	
	



}

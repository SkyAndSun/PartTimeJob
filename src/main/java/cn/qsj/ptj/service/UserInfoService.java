package cn.qsj.ptj.service;

import cn.qsj.ptj.entity.UserInfo;

public interface UserInfoService {
	
	void addUserInfo(UserInfo entity);
	
	UserInfo findByUserId(Integer userId);
	
	UserInfo findByUserName(String userName);

}

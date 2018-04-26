package cn.qsj.ptj.dao;

import java.util.List;

import cn.qsj.ptj.entity.UserInfo;

public interface UserInfoDao {
	
	int addUserInfo(UserInfo entity);
	
	List<UserInfo> findByUserId(Integer userId);
	
	List<UserInfo> findByUserName(String userName);

}

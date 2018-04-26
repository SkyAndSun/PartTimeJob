package cn.qsj.ptj.service.serviecImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qsj.ptj.common.exception.HandleServiceException;
import cn.qsj.ptj.dao.UserInfoDao;
import cn.qsj.ptj.entity.UserInfo;
import cn.qsj.ptj.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	private UserInfoDao userInfoDao;

	@Override
	public void addUserInfo(UserInfo entity) {
		
		if(entity == null){
			throw new HandleServiceException("entity is null!");
		}
		int row = userInfoDao.addUserInfo(entity);
		if(row != 1){
			throw new HandleServiceException("新增数量出错");
		}
		

	}

	@Override
	public UserInfo findByUserId(Integer userId) {
		if(userId == null || "".equals(userId)){
			throw new HandleServiceException("userId is null!");
		}
		List<UserInfo> list = userInfoDao.findByUserId(userId);
		if(list != null && list.size()>0){
			UserInfo userInfo = list.get(0);
			return userInfo;
		}
		return null;
	}

	@Override
	public UserInfo findByUserName(String userName) {
		if(userName == null || "".equals(userName)){
			throw new HandleServiceException("userName is null!");
		}
		List<UserInfo> list = userInfoDao.findByUserName(userName);
		if(list != null && list.size()>0){
			UserInfo userInfo = list.get(0);
			return userInfo;
		}
		return null;
	}

}

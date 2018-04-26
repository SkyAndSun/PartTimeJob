package cn.qsj.ptj.service.serviecImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qsj.ptj.common.exception.HandleServiceException;
import cn.qsj.ptj.dao.PublishInfoDao;
import cn.qsj.ptj.entity.PublishInfo;
import cn.qsj.ptj.service.PublishInfoService;

@Service
public class PublishInfoServiceImpl implements PublishInfoService {
	
	@Autowired
	private PublishInfoDao publishInfoDao;

	@Override
	public void addPublishInfo(PublishInfo entity) {
		if(entity == null){
			throw new HandleServiceException("entity is null");
		}
		int row = publishInfoDao.addPublishInfo(entity);
		if(row !=1){
			throw new HandleServiceException("增加出现异常!");
		}

	}

	@Override
	public List<PublishInfo> list() {
		List<PublishInfo> list = publishInfoDao.list();
		System.out.println(list);
		return list;
	}

	@Override
	public PublishInfo findById(Integer id) {
		if(id==null || "".equals(id)){
			throw new HandleServiceException("id is null ");
		}
		List<PublishInfo> list = publishInfoDao.findById(id);
		if(list!=null && list.size()>0){
			PublishInfo entity = list.get(0);
			return entity;
		}
		return null;
	}

	@Override
	public List<PublishInfo> findByUserId(Integer userId) {
		if(userId==null || "".equals(userId)){
			throw new HandleServiceException("userId is null ");
		}
		List<PublishInfo> list = publishInfoDao.findByUserId(userId);
		if(list!=null && list.size()>0){
			return list;
		}
		return null;
	}

	@Override
	public void deletePublishInfo(Integer id) {
		if(id == null){
			throw new HandleServiceException("id is null");
		}
		int row = publishInfoDao.deletePublishInfo(id);
		if(row !=1){
			throw new HandleServiceException("删除出现异常!");
		}
		
	}

	@Override
	public void toTop(PublishInfo entity) {
		if(entity == null){
			throw new HandleServiceException("entity is null");
		}
		int row = publishInfoDao.toTop(entity);
		if(row !=1){
			throw new HandleServiceException("toTOp出现异常!");
		}
	}

}

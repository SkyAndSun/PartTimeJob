package cn.qsj.ptj.service.serviecImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qsj.ptj.common.exception.HandleServiceException;
import cn.qsj.ptj.dao.CollectionDao;
import cn.qsj.ptj.dao.PublishInfoDao;
import cn.qsj.ptj.entity.Collection;
import cn.qsj.ptj.entity.PublishInfo;
import cn.qsj.ptj.service.CollectionService;

@Service
public class CollectionServiceImpl implements CollectionService {
	
	@Autowired
	private CollectionDao collectionDao;
	
	@Autowired
	private PublishInfoDao publishInfoDao;

	/**
	 * 获得 自己收藏的 兼职信息
	 */
	@Override
	public List<PublishInfo> findByUserId(Integer userId) {
		List<PublishInfo> infos = new ArrayList<PublishInfo>();
		if(userId != null){
			List<Collection> list = collectionDao.findByUserId(userId);
			if(list != null && list.size()>0){
				for(Collection c : list){
					//根据工作id 获得每一条 兼职信息
					List<PublishInfo> list2 = publishInfoDao.findById(c.getJobId());
					infos.addAll(list2);
				}
			}
			return infos;
		}else{
			throw new HandleServiceException("id is null！");
		}
	}

	/**
	 * 删除收藏  应该根据 userId  和 jobId
	 */
	@Override
	public void deleteCollection(Integer jobId,Integer userId) {
		if(jobId != null && userId != null){
			
			int i = collectionDao.deleteCollection(jobId,userId);
			if(i != 1){
				throw new HandleServiceException("删除数量出错！");
			}
					
			
		}else{
			throw new HandleServiceException("id is null！");
		}

	}

	@Override
	public void addCollection(Collection entity) {
		if(entity != null){
			int i = collectionDao.addCollection(entity);
			if(i != 1){
				throw new HandleServiceException("增加数量出错！");
			}
		}else{
			throw new HandleServiceException("entity is null！");
		}

	}

}

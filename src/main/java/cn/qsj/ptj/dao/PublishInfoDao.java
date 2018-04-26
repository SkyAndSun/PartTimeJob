package cn.qsj.ptj.dao;

import java.util.List;

import cn.qsj.ptj.entity.PublishInfo;

public interface PublishInfoDao {
	
	int addPublishInfo(PublishInfo entity);
	
	int toTop(PublishInfo entity);
	
	List<PublishInfo> findById(Integer id);
	
	List<PublishInfo> findByUserId(Integer userId);
	
	List<PublishInfo> list();
	
	int deletePublishInfo(Integer id);
}

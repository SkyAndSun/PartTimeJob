package cn.qsj.ptj.service;

import java.util.List;

import cn.qsj.ptj.entity.PublishInfo;

public interface PublishInfoService {
	
	void addPublishInfo(PublishInfo entity);
	
	void toTop(PublishInfo entity);
	
	List<PublishInfo> list();
	
	PublishInfo findById(Integer id);
	
	List<PublishInfo> findByUserId(Integer userId);
	
	void deletePublishInfo(Integer id);

}

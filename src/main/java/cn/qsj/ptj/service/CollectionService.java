package cn.qsj.ptj.service;

import java.util.List;

import cn.qsj.ptj.entity.Collection;
import cn.qsj.ptj.entity.PublishInfo;

public interface CollectionService {
	
	List<PublishInfo> findByUserId(Integer userId);
	void deleteCollection(Integer id,Integer userId);
	void addCollection(Collection entity);

}

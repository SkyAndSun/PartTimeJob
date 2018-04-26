package cn.qsj.ptj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.qsj.ptj.entity.Collection;

public interface CollectionDao {
	
	List<Collection> findByUserId(Integer userId);
	int deleteCollection(@Param("jobId")Integer jobId,@Param("userId")Integer userId);
	int addCollection(Collection entity);

}

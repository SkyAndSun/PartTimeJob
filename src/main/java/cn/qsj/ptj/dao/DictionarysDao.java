package cn.qsj.ptj.dao;

import java.util.List;

import cn.qsj.ptj.entity.Dictionarys;

public interface DictionarysDao {
	
	//根据 keyword 分类查找 数据字典
	List<Dictionarys> findByKeyword(String keyword);
}

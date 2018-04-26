package cn.qsj.ptj.service;

import java.util.List;

import cn.qsj.ptj.entity.Dictionarys;

public interface DictionarysService {
	
	List<Dictionarys> findByKeyword(String keyword);

}

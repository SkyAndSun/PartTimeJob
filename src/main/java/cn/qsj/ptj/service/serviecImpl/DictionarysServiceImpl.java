package cn.qsj.ptj.service.serviecImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qsj.ptj.common.exception.HandleServiceException;
import cn.qsj.ptj.dao.DictionarysDao;
import cn.qsj.ptj.entity.Dictionarys;
import cn.qsj.ptj.service.DictionarysService;

@Service
public class DictionarysServiceImpl implements DictionarysService {
	
	@Autowired
	private DictionarysDao dictionaryDao;

	@Override
	public List<Dictionarys> findByKeyword(String keyword) {
		if(keyword == null){
			throw new HandleServiceException("keyword is null !");
		}
		List<Dictionarys> list = dictionaryDao.findByKeyword(keyword);
		if(list == null || list.size() <=0){
			throw new HandleServiceException("data is null !");
		}
		return list;
	}

}

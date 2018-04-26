package cn.qsj.ptj.service.serviecImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.qsj.ptj.common.exception.HandleServiceException;
import cn.qsj.ptj.dao.AdvertisementDao;
import cn.qsj.ptj.entity.Advertisement;
import cn.qsj.ptj.service.AdvertisementService;

@Service("advertisementService")
public class AdvertisementServiceImpl implements AdvertisementService {

	@Autowired
	private AdvertisementDao advertisementDao;
	
	@Override
	public void deleteAdvertisement(Integer id) {
		if(id != null){
			int i = advertisementDao.deleteAdvertisement(id);
			if(i != 1){
				throw new HandleServiceException("delete number exception");
			}
		}else{
			throw new HandleServiceException("id is null");
		}
	}

	@Override
	public Advertisement findById(Integer id) {
		if(id != null){
			List<Advertisement> list = advertisementDao.findById(id);
			if(list != null && list.size()>0){
				return list.get(0);
			}else{
				throw new HandleServiceException("list is null ");
			}
		}else{
			throw new HandleServiceException("id is null");
		}
	}

	@Override
	public void addAdvertisement(Advertisement entity) {
		if(entity != null){
			int i = advertisementDao.addAdvertisement(entity);
			if(i != 1){
				throw new HandleServiceException("update number exception");
			}
		}else{
			throw new HandleServiceException("entity is null");
		}

	}

	@Override
	public List<Advertisement> list() {
		return advertisementDao.list();
	}

}

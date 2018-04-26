package cn.qsj.ptj.dao;

import java.util.List;

import cn.qsj.ptj.entity.Advertisement;

public interface AdvertisementDao {
	
	int deleteAdvertisement(Integer id);
	List<Advertisement> findById(Integer id);
	int addAdvertisement(Advertisement entity);
	List<Advertisement> list();

}

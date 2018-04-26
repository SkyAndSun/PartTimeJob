package cn.qsj.ptj.service;

import java.util.List;

import cn.qsj.ptj.entity.Advertisement;

public interface AdvertisementService {
	
	void deleteAdvertisement(Integer id);
	Advertisement findById(Integer id);
	void addAdvertisement(Advertisement entity);
	List<Advertisement> list();

}

package cn.qsj.ptj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qsj.ptj.common.web.JsonResult;
import cn.qsj.ptj.entity.Advertisement;
import cn.qsj.ptj.service.AdvertisementService;

@Controller
@RequestMapping("advertisement/")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService advertisementService;
	
	@RequestMapping("list")
	@ResponseBody
	public JsonResult list(){
		return new JsonResult(advertisementService.list());
	}
	
	@RequestMapping("addAdvertisement")
	@ResponseBody
	public JsonResult addAdvertisement(@RequestBody Advertisement entity){
		advertisementService.addAdvertisement(entity);
		return new JsonResult();
	}
	
	@RequestMapping("findById")
	@ResponseBody
	public JsonResult findById(Integer id) {
		Advertisement ad = advertisementService.findById(id);
		return new JsonResult(ad);
	}
	
	@RequestMapping("deleteAdvertisement")
	@ResponseBody
	public JsonResult deleteAdvertisement(Integer id) {
		advertisementService.deleteAdvertisement(id);
		return new JsonResult();
	}


}

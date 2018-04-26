package cn.qsj.ptj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qsj.ptj.common.web.JsonResult;
import cn.qsj.ptj.entity.Collection;
import cn.qsj.ptj.entity.PublishInfo;
import cn.qsj.ptj.service.CollectionService;

@Controller
@RequestMapping("collection/")
public class CollectionController {
	
	@Autowired
	private CollectionService collectionService;
	
	/**
	 * 
	 * 用户收藏列表
	 * @param userId
	 * @return
	 */
	@RequestMapping("findByUserId")
	@ResponseBody
	public JsonResult findByUserId(Integer userId){
		List<PublishInfo> list = collectionService.findByUserId(userId);
		return new JsonResult(list);
	}
	
	
	
	@RequestMapping("addCollection")
	@ResponseBody
	public JsonResult addCollection(@RequestBody Collection entity){
		collectionService.addCollection(entity);
		return new JsonResult();
	}
	
	
	@RequestMapping("deleteCollection")
	@ResponseBody
	public JsonResult deleteCollection(Integer jobId,Integer userId){
		collectionService.deleteCollection(jobId,userId);
		return new JsonResult();
	}
	
	

}

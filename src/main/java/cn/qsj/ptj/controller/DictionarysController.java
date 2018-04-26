package cn.qsj.ptj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qsj.ptj.common.web.JsonResult;
import cn.qsj.ptj.entity.Dictionarys;
import cn.qsj.ptj.service.DictionarysService;

@Controller
@RequestMapping("dictionarys/")
public class DictionarysController {

	@Autowired
	private DictionarysService dictionarysService;
	
	@RequestMapping("findByKeyword")
	@ResponseBody
	public JsonResult findByKeyword(String keyword){
		List<Dictionarys> list = dictionarysService.findByKeyword(keyword);
		return new JsonResult(list);
	}
}

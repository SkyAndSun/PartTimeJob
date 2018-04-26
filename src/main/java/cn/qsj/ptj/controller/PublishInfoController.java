package cn.qsj.ptj.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import cn.qsj.ptj.common.web.JsonResult;
import cn.qsj.ptj.entity.PublishInfo;
import cn.qsj.ptj.service.PublishInfoService;

@Controller
@RequestMapping("publish/")
public class PublishInfoController {
	
	@Autowired
	private PublishInfoService publishInfoService;
	
	@RequestMapping("uploadFile")
	@ResponseBody
	public JsonResult uploadFile(HttpServletResponse response,HttpServletRequest request,MultipartFile file){
		String realPath = request.getSession().getServletContext().getRealPath("/temp");
		try{
			CommonsMultipartFile cf = (CommonsMultipartFile)file;
			DiskFileItem fi = (DiskFileItem)cf.getFileItem();
			String fName = fi.getName();
			System.out.println("Name:"+fName);
			File f1 = fi.getStoreLocation();
			InputStream ips = new FileInputStream(f1);
			FileOutputStream ops = new FileOutputStream(realPath+"/"+"xhs.jpg");
			byte[] b = new byte[1024];
			int len;
			try{
				while((len = ips.read(b))!= -1){
					ops.write(b,0,len);
				}
			}catch (IOException e){
				e.printStackTrace();
			}finally{
				try {  
                    ops.close();  
                    ips.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		System.out.println("realPath:"+realPath);
		return new JsonResult(realPath);
	}
	
	
	@RequestMapping("addPublishInfo")
	@ResponseBody
	public JsonResult addPublishInfo(@RequestBody PublishInfo entity){
		publishInfoService.addPublishInfo(entity);
		return new JsonResult();
	}
	
	@RequestMapping("toTop")
	@ResponseBody
	public JsonResult toTop(@RequestBody PublishInfo entity){
		publishInfoService.toTop(entity);;
		return new JsonResult();
	}
	
	/**
	 * 查询兼职
	 * @return
	 */
	@RequestMapping("list")
	@ResponseBody
	public JsonResult list(){
		List<PublishInfo> list = publishInfoService.list();
		return new JsonResult(list);
	}
	
	/**
	 * 展示每一条兼职的详情
	 * @param id
	 * @return
	 */
	@RequestMapping("findById")
	@ResponseBody
	public JsonResult findById(Integer id){
		PublishInfo publishInfo = publishInfoService.findById(id);
		return new JsonResult(publishInfo);
	}
	
	/**
	 * 我的发布
	 * @param userId
	 * @return
	 */
	@RequestMapping("findByUserId")
	@ResponseBody
	public JsonResult findByUserId(Integer userId){
		List<PublishInfo> list = publishInfoService.findByUserId(userId);
		return new JsonResult(list);
	}
	
	@RequestMapping("deletePublishInfo")
	@ResponseBody
	public JsonResult deletePublishInfo(Integer id){
		publishInfoService.deletePublishInfo(id);
		return new JsonResult();
	}

}

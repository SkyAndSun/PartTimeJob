package cn.qsj.ptj.common.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qsj.ptj.common.web.JsonResult;

/**通过此注解声明此类为一个全局异常处理类型*/
@ControllerAdvice
public class HandleControllerException {

	@ExceptionHandler(HandleServiceException.class)
	@ResponseBody
	public JsonResult handleServiceException(HandleServiceException e){
		e.printStackTrace();
		return new JsonResult(e);
	}
	

}

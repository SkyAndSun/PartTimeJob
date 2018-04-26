package cn.qsj.ptj.common.exception;

/**细化运行时异常,自己定义一个业务异常*/
public class HandleServiceException extends RuntimeException{

	public HandleServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HandleServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public HandleServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public HandleServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public HandleServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}

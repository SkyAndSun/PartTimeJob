package cn.qsj.ptj.entity;

import java.io.Serializable;

public class Collection implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4800480879027047657L;

	private Integer id;
	private Integer userId;
	private Integer jobId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

}

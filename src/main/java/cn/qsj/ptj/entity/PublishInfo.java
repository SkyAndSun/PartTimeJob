package cn.qsj.ptj.entity;

import java.io.Serializable;
import java.util.Date;

public class PublishInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8166846201208122371L;

	private Integer id;
	private Integer userId; // 查出userName
	private String publishMan;
	private String title;
	private String jobType;
	private String adderss;
	private Date expiryDate;
	private String linkMan;
	private String linkPhone;
	private String qq;
	private String email;
	private Integer number;
	private Double salary;
	private String note;
	private Date publishDate;
	private Integer status;
	private Integer flag;
	private String salaryType;
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
	public String getPublishMan() {
		return publishMan;
	}
	public void setPublishMan(String publishMan) {
		this.publishMan = publishMan;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getJobType() {
		return jobType;
	}
	public void setJobType(String jobType) {
		this.jobType = jobType;
	}
	public String getAdderss() {
		return adderss;
	}
	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getLinkMan() {
		return linkMan;
	}
	public void setLinkMan(String linkMan) {
		this.linkMan = linkMan;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getFlag() {
		return flag;
	}
	public void setFlag(Integer flag) {
		this.flag = flag;
	}
	public String getSalaryType() {
		return salaryType;
	}
	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}
	@Override
	public String toString() {
		return "PublishInfo [id=" + id + ", userId=" + userId + ", publishMan=" + publishMan + ", title=" + title
				+ ", jobType=" + jobType + ", adderss=" + adderss + ", expiryDate=" + expiryDate + ", linkMan="
				+ linkMan + ", linkPhone=" + linkPhone + ", qq=" + qq + ", email=" + email + ", number=" + number
				+ ", salary=" + salary + ", note=" + note + ", publishDate=" + publishDate + ", status=" + status
				+ ", flag=" + flag + ", salaryType=" + salaryType + "]";
	}

	
}

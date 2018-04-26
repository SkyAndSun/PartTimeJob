package cn.qsj.ptj.entity;

import java.io.Serializable;

public class Dictionarys implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 665988374343321650L;

	private Integer id;
	private String keyword;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

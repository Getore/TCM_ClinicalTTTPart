package com.bootdo.staff.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-28 09:56:21
 */
public class StaffDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//日 志  id
	private Integer id;
	//项目名称
	private String projectname;
	//完成进度
	private Long done;
	//备      注
	private String remarks;
	//当前日期
	private Date doneTime;

	/**
	 * 设置：日 志  id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：日 志  id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：项目名称
	 */
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	/**
	 * 获取：项目名称
	 */
	public String getProjectname() {
		return projectname;
	}
	/**
	 * 设置：完成进度
	 */
	public void setDone(Long done) {
		this.done = done;
	}
	/**
	 * 获取：完成进度
	 */
	public Long getDone() {
		return done;
	}
	/**
	 * 设置：备      注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备      注
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：当前日期
	 */
	public void setDoneTime(Date doneTime) {
		this.doneTime = doneTime;
	}
	/**
	 * 获取：当前日期
	 */
	public Date getDoneTime() {
		return doneTime;
	}
}

package com.bootdo.shenli.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-03-27 16:35:34
 */
public class LogDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//项目名称
	private String projectname;
	//完成进度（0 - 100%）
	private String done;
	//备注
	private String remarks;
	//填写时间
	private Date writetime;

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
	 * 设置：完成进度（0 - 100%）
	 */
	public void setDone(String done) {
		this.done = done;
	}
	/**
	 * 获取：完成进度（0 - 100%）
	 */
	public String getDone() {
		return done;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * 设置：填写时间
	 */
	public void setWritetime(Date writetime) {
		this.writetime = writetime;
	}
	/**
	 * 获取：填写时间
	 */
	public Date getWritetime() {
		return writetime;
	}
}

package com.bootdo.image_check.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author shenli
 * @email 1992lcg@163.com
 * @date 2019-04-01 16:58:57
 */
public class CheckErrorDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//错误类型(01-头,02-脸,05-其他)
	private String errType;
	//错误信息
	private String errMsg;
	//
	private Date createTime;
	//备注
	private String remark;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：错误类型(01-头,02-脸,05-其他)
	 */
	public void setErrType(String errType) {
		this.errType = errType;
	}
	/**
	 * 获取：错误类型(01-头,02-脸,05-其他)
	 */
	public String getErrType() {
		return errType;
	}
	/**
	 * 设置：错误信息
	 */
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	/**
	 * 获取：错误信息
	 */
	public String getErrMsg() {
		return errMsg;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：备注
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：备注
	 */
	public String getRemark() {
		return remark;
	}
}

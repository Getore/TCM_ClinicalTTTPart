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
public class ImageCheckDO implements Serializable {
	private static final long serialVersionUID = 1L;

	//
	private Integer id;
	//相片受理编号
	private String acceptNo;
	//上传客户端id
	private String customId;
	//上传照片的客户端ip
	private String uploadIp;
	//上传照片的时间
	private Date uploadTime;
	//照片存放路径
	private String imagePath;
	//照片名称
	private String imageName;
	//照片大小
	private String imageSize;
	//特检标志(0-菲特检,1-特检)
	private String imageSpecial;
	//特检信息
	private String specialMsg;
	//所属检测标准的id
	private Integer checkTypeId;
	//
	private Integer machineId;
	//
	private Date machineCheckTime;
	//
	private String machineResult;
	//
	private String machineCheckValue;
	//
	private String machineResultMsg;
	//人检id
	private Integer userCheckId;
	//人检开始时间
	private Date userCheckBegin;
	//人检结束时间
	private Date userCheckEnd;
	//人检结果(0-未处理,1-合格,2-不合格,3-严重不合格)
	private String userResult;
	//人检文字结果
	private String userResultMsg;
	//最终检测结果(0-未处理,1-合格,2-不合格,3-严重不合格)
	private String finalResult;
	//处理结果已达阶段(0-未处理,1-机检完,3-人检完)
	private String dealStage;
	//
	private Date createTime;
	//
	private Integer createUser;
	//
	private Date updateTime;
	//
	private Integer updateUser;
	//
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
	 * 设置：相片受理编号
	 */
	public void setAcceptNo(String acceptNo) {
		this.acceptNo = acceptNo;
	}
	/**
	 * 获取：相片受理编号
	 */
	public String getAcceptNo() {
		return acceptNo;
	}
	/**
	 * 设置：上传客户端id
	 */
	public void setCustomId(String customId) {
		this.customId = customId;
	}
	/**
	 * 获取：上传客户端id
	 */
	public String getCustomId() {
		return customId;
	}
	/**
	 * 设置：上传照片的客户端ip
	 */
	public void setUploadIp(String uploadIp) {
		this.uploadIp = uploadIp;
	}
	/**
	 * 获取：上传照片的客户端ip
	 */
	public String getUploadIp() {
		return uploadIp;
	}
	/**
	 * 设置：上传照片的时间
	 */
	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}
	/**
	 * 获取：上传照片的时间
	 */
	public Date getUploadTime() {
		return uploadTime;
	}
	/**
	 * 设置：照片存放路径
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	/**
	 * 获取：照片存放路径
	 */
	public String getImagePath() {
		return imagePath;
	}
	/**
	 * 设置：照片名称
	 */
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	/**
	 * 获取：照片名称
	 */
	public String getImageName() {
		return imageName;
	}
	/**
	 * 设置：照片大小
	 */
	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}
	/**
	 * 获取：照片大小
	 */
	public String getImageSize() {
		return imageSize;
	}
	/**
	 * 设置：特检标志(0-菲特检,1-特检)
	 */
	public void setImageSpecial(String imageSpecial) {
		this.imageSpecial = imageSpecial;
	}
	/**
	 * 获取：特检标志(0-菲特检,1-特检)
	 */
	public String getImageSpecial() {
		return imageSpecial;
	}
	/**
	 * 设置：特检信息
	 */
	public void setSpecialMsg(String specialMsg) {
		this.specialMsg = specialMsg;
	}
	/**
	 * 获取：特检信息
	 */
	public String getSpecialMsg() {
		return specialMsg;
	}
	/**
	 * 设置：所属检测标准的id
	 */
	public void setCheckTypeId(Integer checkTypeId) {
		this.checkTypeId = checkTypeId;
	}
	/**
	 * 获取：所属检测标准的id
	 */
	public Integer getCheckTypeId() {
		return checkTypeId;
	}
	/**
	 * 设置：
	 */
	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}
	/**
	 * 获取：
	 */
	public Integer getMachineId() {
		return machineId;
	}
	/**
	 * 设置：
	 */
	public void setMachineCheckTime(Date machineCheckTime) {
		this.machineCheckTime = machineCheckTime;
	}
	/**
	 * 获取：
	 */
	public Date getMachineCheckTime() {
		return machineCheckTime;
	}
	/**
	 * 设置：
	 */
	public void setMachineResult(String machineResult) {
		this.machineResult = machineResult;
	}
	/**
	 * 获取：
	 */
	public String getMachineResult() {
		return machineResult;
	}
	/**
	 * 设置：
	 */
	public void setMachineCheckValue(String machineCheckValue) {
		this.machineCheckValue = machineCheckValue;
	}
	/**
	 * 获取：
	 */
	public String getMachineCheckValue() {
		return machineCheckValue;
	}
	/**
	 * 设置：
	 */
	public void setMachineResultMsg(String machineResultMsg) {
		this.machineResultMsg = machineResultMsg;
	}
	/**
	 * 获取：
	 */
	public String getMachineResultMsg() {
		return machineResultMsg;
	}
	/**
	 * 设置：人检id
	 */
	public void setUserCheckId(Integer userCheckId) {
		this.userCheckId = userCheckId;
	}
	/**
	 * 获取：人检id
	 */
	public Integer getUserCheckId() {
		return userCheckId;
	}
	/**
	 * 设置：人检开始时间
	 */
	public void setUserCheckBegin(Date userCheckBegin) {
		this.userCheckBegin = userCheckBegin;
	}
	/**
	 * 获取：人检开始时间
	 */
	public Date getUserCheckBegin() {
		return userCheckBegin;
	}
	/**
	 * 设置：人检结束时间
	 */
	public void setUserCheckEnd(Date userCheckEnd) {
		this.userCheckEnd = userCheckEnd;
	}
	/**
	 * 获取：人检结束时间
	 */
	public Date getUserCheckEnd() {
		return userCheckEnd;
	}
	/**
	 * 设置：人检结果(0-未处理,1-合格,2-不合格,3-严重不合格)
	 */
	public void setUserResult(String userResult) {
		this.userResult = userResult;
	}
	/**
	 * 获取：人检结果(0-未处理,1-合格,2-不合格,3-严重不合格)
	 */
	public String getUserResult() {
		return userResult;
	}
	/**
	 * 设置：人检文字结果
	 */
	public void setUserResultMsg(String userResultMsg) {
		this.userResultMsg = userResultMsg;
	}
	/**
	 * 获取：人检文字结果
	 */
	public String getUserResultMsg() {
		return userResultMsg;
	}
	/**
	 * 设置：最终检测结果(0-未处理,1-合格,2-不合格,3-严重不合格)
	 */
	public void setFinalResult(String finalResult) {
		this.finalResult = finalResult;
	}
	/**
	 * 获取：最终检测结果(0-未处理,1-合格,2-不合格,3-严重不合格)
	 */
	public String getFinalResult() {
		return finalResult;
	}
	/**
	 * 设置：处理结果已达阶段(0-未处理,1-机检完,3-人检完)
	 */
	public void setDealStage(String dealStage) {
		this.dealStage = dealStage;
	}
	/**
	 * 获取：处理结果已达阶段(0-未处理,1-机检完,3-人检完)
	 */
	public String getDealStage() {
		return dealStage;
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
	 * 设置：
	 */
	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：
	 */
	public Integer getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateUser(Integer updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：
	 */
	public Integer getUpdateUser() {
		return updateUser;
	}
	/**
	 * 设置：
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：
	 */
	public String getRemark() {
		return remark;
	}
}

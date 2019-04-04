package com.bootdo.image_check.domain;

import java.util.Date;

/**
 * @author shenli - XD02551
 * @email
 * @createDate 2019/4/4 16:17
 */
public class ImageCheckViewDO {
    private static final long serialVersionUID = 1L;

    // 检测员检测用时(单位：秒)
    private Integer timeDiffer;
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

    public Integer getTimeDiffer() {
        return timeDiffer;
    }

    public void setTimeDiffer(Integer timeDiffer) {
        this.timeDiffer = timeDiffer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcceptNo() {
        return acceptNo;
    }

    public void setAcceptNo(String acceptNo) {
        this.acceptNo = acceptNo;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public String getUploadIp() {
        return uploadIp;
    }

    public void setUploadIp(String uploadIp) {
        this.uploadIp = uploadIp;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    public String getImageSpecial() {
        return imageSpecial;
    }

    public void setImageSpecial(String imageSpecial) {
        this.imageSpecial = imageSpecial;
    }

    public String getSpecialMsg() {
        return specialMsg;
    }

    public void setSpecialMsg(String specialMsg) {
        this.specialMsg = specialMsg;
    }

    public Integer getCheckTypeId() {
        return checkTypeId;
    }

    public void setCheckTypeId(Integer checkTypeId) {
        this.checkTypeId = checkTypeId;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Date getMachineCheckTime() {
        return machineCheckTime;
    }

    public void setMachineCheckTime(Date machineCheckTime) {
        this.machineCheckTime = machineCheckTime;
    }

    public String getMachineResult() {
        return machineResult;
    }

    public void setMachineResult(String machineResult) {
        this.machineResult = machineResult;
    }

    public String getMachineCheckValue() {
        return machineCheckValue;
    }

    public void setMachineCheckValue(String machineCheckValue) {
        this.machineCheckValue = machineCheckValue;
    }

    public String getMachineResultMsg() {
        return machineResultMsg;
    }

    public void setMachineResultMsg(String machineResultMsg) {
        this.machineResultMsg = machineResultMsg;
    }

    public Integer getUserCheckId() {
        return userCheckId;
    }

    public void setUserCheckId(Integer userCheckId) {
        this.userCheckId = userCheckId;
    }

    public Date getUserCheckBegin() {
        return userCheckBegin;
    }

    public void setUserCheckBegin(Date userCheckBegin) {
        this.userCheckBegin = userCheckBegin;
    }

    public Date getUserCheckEnd() {
        return userCheckEnd;
    }

    public void setUserCheckEnd(Date userCheckEnd) {
        this.userCheckEnd = userCheckEnd;
    }

    public String getUserResult() {
        return userResult;
    }

    public void setUserResult(String userResult) {
        this.userResult = userResult;
    }

    public String getUserResultMsg() {
        return userResultMsg;
    }

    public void setUserResultMsg(String userResultMsg) {
        this.userResultMsg = userResultMsg;
    }

    public String getFinalResult() {
        return finalResult;
    }

    public void setFinalResult(String finalResult) {
        this.finalResult = finalResult;
    }

    public String getDealStage() {
        return dealStage;
    }

    public void setDealStage(String dealStage) {
        this.dealStage = dealStage;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
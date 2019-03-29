package com.bootdo.staff.domain;

import com.xuxueli.poi.excel.annotation.ExcelField;

import java.io.Serializable;

/**
 * @author shenli - XD02551
 * @email
 * @createDate 2019/3/28 16:54
 */
public class StaffExcelExport implements Serializable {
    private static final long serialVersionUID = 1L;

    @ExcelField(name = "项目名称")
    private String projectName;

    @ExcelField(name = "完成进度(%)")
    private String done;

    @ExcelField(name = "备 注")
    private String remarks;

    @ExcelField(name = "填写日期")
    private String done_time;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDone_time() {
        return done_time;
    }

    public void setDone_time(String done_time) {
        this.done_time = done_time;
    }
}
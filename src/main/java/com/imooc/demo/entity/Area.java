package com.imooc.demo.entity;

import java.util.Date;

public class Area {
    private Integer areaId;

    private String areaName;

    private Integer priority;

    private Date cerateTime;

    private Date lastEditTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getCerateTime() {
        return cerateTime;
    }

    public void setCerateTime(Date cerateTime) {
        this.cerateTime = cerateTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}

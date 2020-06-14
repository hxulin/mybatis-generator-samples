package com.example.mbg.entity;

import java.util.Date;

public class Project {
    private Long id;

    private String name;

    private String entranceUrl;

    private Byte type;

    private Integer sequence;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public Project(Long id, String name, String entranceUrl, Byte type, Integer sequence, Byte status, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.entranceUrl = entranceUrl;
        this.type = type;
        this.sequence = sequence;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Project() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEntranceUrl() {
        return entranceUrl;
    }

    public void setEntranceUrl(String entranceUrl) {
        this.entranceUrl = entranceUrl == null ? null : entranceUrl.trim();
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
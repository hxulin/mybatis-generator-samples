package com.example.mbg.entity;

import java.util.Date;

public class User {
    private Long id;

    private String nickname;

    private String authCode;

    private String lanIp;

    private Date lastUpdated;

    private Byte status;

    private Date createTime;

    private Date updateTime;

    public User(Long id, String nickname, String authCode, String lanIp, Date lastUpdated, Byte status, Date createTime, Date updateTime) {
        this.id = id;
        this.nickname = nickname;
        this.authCode = authCode;
        this.lanIp = lanIp;
        this.lastUpdated = lastUpdated;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode == null ? null : authCode.trim();
    }

    public String getLanIp() {
        return lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp == null ? null : lanIp.trim();
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
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
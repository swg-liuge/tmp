package com.song.entity.po;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @ description: 公司信息
 * @ author: swg
 * @ created: 2018/2/12
 */
public class Company {

    private int id;
    private String compName;
    private String contactName;
    private String contactMobile;
    private String contactTel;
    private String address;

    private String homePage;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", compName='" + compName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactMobile='" + contactMobile + '\'' +
                ", contactTel='" + contactTel + '\'' +
                ", address='" + address + '\'' +
                ", homePage=" + homePage +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }
}

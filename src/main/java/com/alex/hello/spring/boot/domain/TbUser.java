package com.alex.hello.spring.boot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser {
    @Id
    private Long uid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码,加密存储
     */
    private String password;

    /**
     * 注册手机号
     */
    private String phone;

    /**
     * 注册邮箱
     */
    private String email;

    private Date created;

    private Date updated;

    /**
     * 图片地址
     */
    @Column(name = "img_src")
    private String imgSrc;

    /**
     * 学校
     */
    private String school;

    /**
     * 性别
     */
    private String gender;

    /**
     * 专业
     */
    private String specialty;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 婚姻状况
     */
    @Column(name = "marital_status")
    private String maritalStatus;

    /**
     * 身份证
     */
    private String identitys;

    /**
     * 当前账号状态
     */
    @Column(name = "current_state")
    private Integer currentState;

    @Column(name = "depart_id")
    private Integer departId;

    /**
     * 权限id
     */
    @Column(name = "role_id")
    private Integer roleId;

    /**
     * @return uid
     */
    public Long getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码,加密存储
     *
     * @return password - 密码,加密存储
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码,加密存储
     *
     * @param password 密码,加密存储
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取注册手机号
     *
     * @return phone - 注册手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置注册手机号
     *
     * @param phone 注册手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取注册邮箱
     *
     * @return email - 注册邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置注册邮箱
     *
     * @param email 注册邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return created
     */
    public Date getCreated() {
        return created;
    }

    /**
     * @param created
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * @return updated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * @param updated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * 获取图片地址
     *
     * @return img_src - 图片地址
     */
    public String getImgSrc() {
        return imgSrc;
    }

    /**
     * 设置图片地址
     *
     * @param imgSrc 图片地址
     */
    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    /**
     * 获取学校
     *
     * @return school - 学校
     */
    public String getSchool() {
        return school;
    }

    /**
     * 设置学校
     *
     * @param school 学校
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取专业
     *
     * @return specialty - 专业
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * 设置专业
     *
     * @param specialty 专业
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * 获取年龄
     *
     * @return age - 年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     *
     * @param age 年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取婚姻状况
     *
     * @return marital_status - 婚姻状况
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * 设置婚姻状况
     *
     * @param maritalStatus 婚姻状况
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * 获取身份证
     *
     * @return identitys - 身份证
     */
    public String getIdentitys() {
        return identitys;
    }

    /**
     * 设置身份证
     *
     * @param identitys 身份证
     */
    public void setIdentitys(String identitys) {
        this.identitys = identitys;
    }

    /**
     * 获取当前账号状态
     *
     * @return current_state - 当前账号状态
     */
    public Integer getCurrentState() {
        return currentState;
    }

    /**
     * 设置当前账号状态
     *
     * @param currentState 当前账号状态
     */
    public void setCurrentState(Integer currentState) {
        this.currentState = currentState;
    }

    /**
     * @return depart_id
     */
    public Integer getDepartId() {
        return departId;
    }

    /**
     * @param departId
     */
    public void setDepartId(Integer departId) {
        this.departId = departId;
    }

    /**
     * 获取权限id
     *
     * @return role_id - 权限id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置权限id
     *
     * @param roleId 权限id
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
package com.alex.hello.spring.boot.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_diary")
public class TbDiary {
    @Id
    @Column(name = "diary_id")
    private Long diaryId;

    /**
     * 用户姓名
     */
    private String username;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 周id
     */
    @Column(name = "week_id")
    private Integer weekId;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    @Column(name = "diary_des")
    private String diaryDes;

    /**
     * @return diary_id
     */
    public Long getDiaryId() {
        return diaryId;
    }

    /**
     * @param diaryId
     */
    public void setDiaryId(Long diaryId) {
        this.diaryId = diaryId;
    }

    /**
     * 获取用户姓名
     *
     * @return username - 用户姓名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户姓名
     *
     * @param username 用户姓名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取创建日期
     *
     * @return created - 创建日期
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建日期
     *
     * @param created 创建日期
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取周id
     *
     * @return week_id - 周id
     */
    public Integer getWeekId() {
        return weekId;
    }

    /**
     * 设置周id
     *
     * @param weekId 周id
     */
    public void setWeekId(Integer weekId) {
        this.weekId = weekId;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容
     *
     * @return diary_des - 内容
     */
    public String getDiaryDes() {
        return diaryDes;
    }

    /**
     * 设置内容
     *
     * @param diaryDes 内容
     */
    public void setDiaryDes(String diaryDes) {
        this.diaryDes = diaryDes;
    }
}
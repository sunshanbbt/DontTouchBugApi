package com.zhengshun.touch.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_code_info
 *
 * @mbg.generated do_not_delete_during_merge
 */
@SuppressWarnings("serial")
public class TbCodeInfo implements Serializable{
    private Integer id;

    /**
     * Database Column Remarks:
     *   代码内容
     */
    private String content;

    /**
     * Database Column Remarks:
     *   代码对应分值
     */
    private BigDecimal score;

    /**
     * Database Column Remarks:
     *   代码块对应倒计时
     */
    private Integer time;

    /**
     * Database Column Remarks:
     *   是否是bug 0 否 1 是
     */
    private Integer isBug;

    /**
     * Database Column Remarks:
     *   难度系数 1：易 2：中 3：难
     */
    private Integer difficult;

    /**
     * Database Column Remarks:
     *   状态 0停用 1正常
     */
    private Integer status;

    /**
     * Database Column Remarks:
     *   是否删除 0否 1是
     */
    private Integer deleteFlag;

    /**
     * Database Column Remarks:
     *   创建时间
     */
    private Date createDate;

    /**
     * Database Column Remarks:
     *   更新时间
     */
    private Date updateDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }


    public Integer getDifficult() {
        return difficult;
    }

    public void setDifficult(Integer difficult) {
        this.difficult = difficult;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsBug() {
        return isBug;
    }

    public void setIsBug(Integer isBug) {
        this.isBug = isBug;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
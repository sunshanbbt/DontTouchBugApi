package com.zhengshun.touch.api.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table tb_user_score_log
 *
 * @mbg.generated do_not_delete_during_merge
 */
@SuppressWarnings("serial")
public class TbUserScoreLog implements Serializable {
    private Long id;

    private Long userId;

    /**
     * Database Column Remarks:
     *   分值
     */
    private BigDecimal score;

    /**
     * Database Column Remarks:
     *   游戏类型
     */
    private Integer gameTypeId;

    /**
     * Database Column Remarks:
     *   状态 0 停用 1正常
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
     *   修改时间
     */
    private Date updateDate;

    private Integer time;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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

    public Integer getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(Integer gameTypeId) {
        this.gameTypeId = gameTypeId;
    }
}
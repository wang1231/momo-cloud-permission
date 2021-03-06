package com.momo.mapper.dataobject;

import java.util.Date;

/**
 * The table 产品提优
 */
public class BugDO{

    /**
     * id ID.
     */
    private Long id;
    /**
     * uuid UUID.
     */
    private String uuid;
    /**
     * createBy CREATE_BY.
     */
    private String createBy;
    /**
     * updateBy UPDATE_BY.
     */
    private String updateBy;
    /**
     * sysProductImg 图片.
     */
    private String sysProductImg;
    /**
     * sysProductName 登记人.
     */
    private String sysProductName;
    /**
     * sysProductReply 回复.
     */
    private String sysProductReply;
    /**
     * sysProductDetail BUG详细说明.
     */
    private String sysProductDetail;
    /**
     * disabledFlag 状态 0启用  1禁用.
     */
    private Integer disabledFlag;
    /**
     * createTime CREATE_TIME.
     */
    private Date createTime;
    /**
     * updateTime UPDATE_TIME.
     */
    private Date updateTime;

    /**
     * Set id ID.
     */
    public void setId(Long id){
        this.id = id;
    }

    /**
     * Get id ID.
     *
     * @return the string
     */
    public Long getId(){
        return id;
    }

    /**
     * Set uuid UUID.
     */
    public void setUuid(String uuid){
        this.uuid = uuid;
    }

    /**
     * Get uuid UUID.
     *
     * @return the string
     */
    public String getUuid(){
        return uuid;
    }

    /**
     * Set createBy CREATE_BY.
     */
    public void setCreateBy(String createBy){
        this.createBy = createBy;
    }

    /**
     * Get createBy CREATE_BY.
     *
     * @return the string
     */
    public String getCreateBy(){
        return createBy;
    }

    /**
     * Set updateBy UPDATE_BY.
     */
    public void setUpdateBy(String updateBy){
        this.updateBy = updateBy;
    }

    /**
     * Get updateBy UPDATE_BY.
     *
     * @return the string
     */
    public String getUpdateBy(){
        return updateBy;
    }

    /**
     * Set sysProductImg 图片.
     */
    public void setSysProductImg(String sysProductImg){
        this.sysProductImg = sysProductImg;
    }

    /**
     * Get sysProductImg 图片.
     *
     * @return the string
     */
    public String getSysProductImg(){
        return sysProductImg;
    }

    /**
     * Set sysProductName 登记人.
     */
    public void setSysProductName(String sysProductName){
        this.sysProductName = sysProductName;
    }

    /**
     * Get sysProductName 登记人.
     *
     * @return the string
     */
    public String getSysProductName(){
        return sysProductName;
    }

    /**
     * Set sysProductReply 回复.
     */
    public void setSysProductReply(String sysProductReply){
        this.sysProductReply = sysProductReply;
    }

    /**
     * Get sysProductReply 回复.
     *
     * @return the string
     */
    public String getSysProductReply(){
        return sysProductReply;
    }

    /**
     * Set sysProductDetail BUG详细说明.
     */
    public void setSysProductDetail(String sysProductDetail){
        this.sysProductDetail = sysProductDetail;
    }

    /**
     * Get sysProductDetail BUG详细说明.
     *
     * @return the string
     */
    public String getSysProductDetail(){
        return sysProductDetail;
    }

    /**
     * Set disabledFlag 状态 0启用  1禁用.
     */
    public void setDisabledFlag(Integer disabledFlag){
        this.disabledFlag = disabledFlag;
    }

    /**
     * Get disabledFlag 状态 0启用  1禁用.
     *
     * @return the string
     */
    public Integer getDisabledFlag(){
        return disabledFlag;
    }

    /**
     * Set createTime CREATE_TIME.
     */
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }

    /**
     * Get createTime CREATE_TIME.
     *
     * @return the string
     */
    public Date getCreateTime(){
        return createTime;
    }

    /**
     * Set updateTime UPDATE_TIME.
     */
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }

    /**
     * Get updateTime UPDATE_TIME.
     *
     * @return the string
     */
    public Date getUpdateTime(){
        return updateTime;
    }
}

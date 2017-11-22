/**
 * OrderService.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-22 20:12:47 Created By null
*/
package com.adatafun.datascreen.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * OrderService.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-22 20:12:47 Created By husai
*/
@ApiModel(value="OrderService",description="order_service")
public class OrderService {
    @ApiModelProperty(value="主键自增id",name="orderServiceId", required=true)
    @NotEmpty
    private Long orderServiceId;

    @ApiModelProperty(value="主键自增id",name="orderId", required=true)
    @NotEmpty
    private Long orderId;

    @ApiModelProperty(value="主键自增id",name="serviceDetail", required=true)
    @NotEmpty
    private String serviceDetail;

    @ApiModelProperty(value="价格规则",name="priceRule")
    private String priceRule;

    @ApiModelProperty(value="是否删除：默认为0，0：不删除，1：删除",name="isDeleted")
    private Short isDeleted;

    @ApiModelProperty(value="机场code",name="airportCode", required=true)
    @NotEmpty
    private String airportCode;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="创建人",name="createUser")
    private Long createUser;

    @ApiModelProperty(value="修改时间",name="updateTime")
    private Date updateTime;

    @ApiModelProperty(value="修改人",name="updateUser")
    private Long updateUser;

    /**
     * 主键自增id
     * @return order_service_id 主键自增id
     */
    public Long getOrderServiceId() {
        return orderServiceId;
    }

    /**
     * 主键自增id
     * @param orderServiceId 主键自增id
     */
    public void setOrderServiceId(Long orderServiceId) {
        this.orderServiceId = orderServiceId;
    }

    /**
     * 主键自增id
     * @return order_id 主键自增id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 主键自增id
     * @param orderId 主键自增id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 主键自增id
     * @return service_detail 主键自增id
     */
    public String getServiceDetail() {
        return serviceDetail;
    }

    /**
     * 主键自增id
     * @param serviceDetail 主键自增id
     */
    public void setServiceDetail(String serviceDetail) {
        this.serviceDetail = serviceDetail;
    }

    /**
     * 价格规则
     * @return price_rule 价格规则
     */
    public String getPriceRule() {
        return priceRule;
    }

    /**
     * 价格规则
     * @param priceRule 价格规则
     */
    public void setPriceRule(String priceRule) {
        this.priceRule = priceRule;
    }

    /**
     * 是否删除：默认为0，0：不删除，1：删除
     * @return is_deleted 是否删除：默认为0，0：不删除，1：删除
     */
    public Short getIsDeleted() {
        return isDeleted;
    }

    /**
     * 是否删除：默认为0，0：不删除，1：删除
     * @param isDeleted 是否删除：默认为0，0：不删除，1：删除
     */
    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 机场code
     * @return airport_code 机场code
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * 机场code
     * @param airportCode 机场code
     */
    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    /**
     * 创建时间
     * @return create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建人
     * @return create_user 创建人
     */
    public Long getCreateUser() {
        return createUser;
    }

    /**
     * 创建人
     * @param createUser 创建人
     */
    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    /**
     * 修改时间
     * @return update_time 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 修改人
     * @return update_user 修改人
     */
    public Long getUpdateUser() {
        return updateUser;
    }

    /**
     * 修改人
     * @param updateUser 修改人
     */
    public void setUpdateUser(Long updateUser) {
        this.updateUser = updateUser;
    }
}
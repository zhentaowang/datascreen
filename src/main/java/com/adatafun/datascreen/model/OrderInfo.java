/**
 * OrderInfo.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-22 11:14:11 Created By null
*/
package com.adatafun.datascreen.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * OrderInfo.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-22 11:14:11 Created By husai
*/
@ApiModel(value="OrderInfo",description="order_info")
public class OrderInfo {
    @ApiModelProperty(value="主键自增id",name="orderId", required=true)
    @NotEmpty
    private Long orderId;

    @ApiModelProperty(value="航班id",name="flightId", required=true)
    @NotEmpty
    private Long flightId;

    @ApiModelProperty(value="机构名称id",name="customerId")
    private Long customerId;

    @ApiModelProperty(value="客户名称",name="customerName")
    private String customerName;

    @ApiModelProperty(value="协议id",name="protocolId", required=true)
    @NotEmpty
    private Long protocolId;

    @ApiModelProperty(value="协议名称",name="protocolName")
    private String protocolName;

    @ApiModelProperty(value="协议类型",name="protocolType")
    private Long protocolType;

    @ApiModelProperty(value="预约人",name="bookingPerson")
    private Long bookingPerson;

    @ApiModelProperty(value="预约人姓名",name="bookingPersonName")
    private String bookingPersonName;

    @ApiModelProperty(value="通知人",name="noticePerson")
    private String noticePerson;

    @ApiModelProperty(value="预约方式：0：电话，1：邮件，2：传真，3：短信，4：其他",name="bookingWay")
    private Short bookingWay;

    @ApiModelProperty(value="是否重要订单：0：重要，1：不重要",name="isImportant")
    private Short isImportant;

    @ApiModelProperty(value="产品id",name="productId")
    private Long productId;

    @ApiModelProperty(value="产品名称",name="productName")
    private String productName;

    @ApiModelProperty(value="代办登机牌 1:需要，0：不需要",name="printCheck")
    private Short printCheck;

    @ApiModelProperty(value="座位要求: 靠窗 靠走道 不要安全门 前排 后排",name="printCheckRemark")
    private String printCheckRemark;

    @ApiModelProperty(value="代办托运 1:需要，0：不需要",name="consign")
    private Short consign;

    @ApiModelProperty(value="是否托运说明",name="consignRemark")
    private String consignRemark;

    @ApiModelProperty(value="服务说明",name="otherRemark")
    private String otherRemark;

    @ApiModelProperty(value="0:预约成功，1：消费,2 : 取消，3：草稿",name="orderStatus")
    private String orderStatus;

    @ApiModelProperty(value="订单类型：0：预约订单，1：服务订单",name="orderType")
    private Short orderType;

    @ApiModelProperty(value="代办完成：0：是，1：否",name="agentComplete")
    private Short agentComplete;

    @ApiModelProperty(value="安排代办人",name="agentPerson")
    private Long agentPerson;

    @ApiModelProperty(value="安排代办人姓名",name="agentPersonName")
    private String agentPersonName;

    @ApiModelProperty(value="证件",name="serverCardNo")
    private String serverCardNo;

    @ApiModelProperty(value="贵宾卡",name="vipCard")
    private String vipCard;

    @ApiModelProperty(value="现金",name="cash")
    private BigDecimal cash;

    @ApiModelProperty(value="座位号",name="sitNo")
    private String sitNo;

    @ApiModelProperty(value="服务地点",name="serverLocation")
    private String serverLocation;

    @ApiModelProperty(value="服务完成：0：否,1：是",name="serverComplete")
    private Short serverComplete;

    @ApiModelProperty(value="服务完成时间",name="serverCompleteTime")
    private Date serverCompleteTime;

    @ApiModelProperty(value="服务完成人id",name="serverCompleteId")
    private Long serverCompleteId;

    @ApiModelProperty(value="服务完成人名称",name="serverCompleteName")
    private String serverCompleteName;

    @ApiModelProperty(value="服务人数",name="serverPersonNum")
    private Integer serverPersonNum;

    @ApiModelProperty(value="随行人数",name="alongTotal")
    private Integer alongTotal;

    @ApiModelProperty(value="是否删除：默认为0，0：不删除，1：删除",name="isDeleted")
    private Short isDeleted;

    @ApiModelProperty(value="机场code",name="airportCode", required=true)
    @NotEmpty
    private String airportCode;

    @ApiModelProperty(value="创建时间",name="createTime")
    private Date createTime;

    @ApiModelProperty(value="创建人",name="createUser")
    private Long createUser;

    @ApiModelProperty(value="创建人姓名",name="createUserName")
    private String createUserName;

    @ApiModelProperty(value="修改时间",name="updateTime")
    private Date updateTime;

    @ApiModelProperty(value="修改人",name="updateUser")
    private Long updateUser;

    @ApiModelProperty(value="服务订单创建时间",name="serverCreateTime")
    private Date serverCreateTime;

    @ApiModelProperty(value="服务订单创建人id",name="serverCreateUserId")
    private Long serverCreateUserId;

    @ApiModelProperty(value="服务订单创建人姓名",name="serverCreateUserName")
    private String serverCreateUserName;

    @ApiModelProperty(value="服务订单修改时间",name="serverUpdateTime")
    private Date serverUpdateTime;

    @ApiModelProperty(value="服务订单修改人id",name="serverUpdateUserId")
    private Long serverUpdateUserId;

    @ApiModelProperty(value="服务订单修改人姓名",name="serverUpdateUserName")
    private String serverUpdateUserName;

    @ApiModelProperty(value="创建人角色（多个）",name="createRole")
    private String createRole;

    @ApiModelProperty(value="安检礼遇 1:需要，0：不需要",name="securityCheck")
    private Short securityCheck;

    @ApiModelProperty(value="安检礼遇备注",name="securityCheckRemark")
    private String securityCheckRemark;

    @ApiModelProperty(value="渠道人数",name="numbers")
    private long numbers;

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
     * 航班id
     * @return flight_id 航班id
     */
    public Long getFlightId() {
        return flightId;
    }

    /**
     * 航班id
     * @param flightId 航班id
     */
    public void setFlightId(Long flightId) {
        this.flightId = flightId;
    }

    /**
     * 机构名称id
     * @return customer_id 机构名称id
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 机构名称id
     * @param customerId 机构名称id
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 客户名称
     * @return customer_name 客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 客户名称
     * @param customerName 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /**
     * 协议id
     * @return protocol_id 协议id
     */
    public Long getProtocolId() {
        return protocolId;
    }

    /**
     * 协议id
     * @param protocolId 协议id
     */
    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    /**
     * 协议名称
     * @return protocol_name 协议名称
     */
    public String getProtocolName() {
        return protocolName;
    }

    /**
     * 协议名称
     * @param protocolName 协议名称
     */
    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }

    /**
     * 协议类型
     * @return protocol_type 协议类型
     */
    public Long getProtocolType() {
        return protocolType;
    }

    /**
     * 协议类型
     * @param protocolType 协议类型
     */
    public void setProtocolType(Long protocolType) {
        this.protocolType = protocolType;
    }

    /**
     * 预约人
     * @return booking_person 预约人
     */
    public Long getBookingPerson() {
        return bookingPerson;
    }

    /**
     * 预约人
     * @param bookingPerson 预约人
     */
    public void setBookingPerson(Long bookingPerson) {
        this.bookingPerson = bookingPerson;
    }

    /**
     * 预约人姓名
     * @return booking_person_name 预约人姓名
     */
    public String getBookingPersonName() {
        return bookingPersonName;
    }

    /**
     * 预约人姓名
     * @param bookingPersonName 预约人姓名
     */
    public void setBookingPersonName(String bookingPersonName) {
        this.bookingPersonName = bookingPersonName;
    }

    /**
     * 通知人
     * @return notice_person 通知人
     */
    public String getNoticePerson() {
        return noticePerson;
    }

    /**
     * 通知人
     * @param noticePerson 通知人
     */
    public void setNoticePerson(String noticePerson) {
        this.noticePerson = noticePerson;
    }

    /**
     * 预约方式：0：电话，1：邮件，2：传真，3：短信，4：其他
     * @return booking_way 预约方式：0：电话，1：邮件，2：传真，3：短信，4：其他
     */
    public Short getBookingWay() {
        return bookingWay;
    }

    /**
     * 预约方式：0：电话，1：邮件，2：传真，3：短信，4：其他
     * @param bookingWay 预约方式：0：电话，1：邮件，2：传真，3：短信，4：其他
     */
    public void setBookingWay(Short bookingWay) {
        this.bookingWay = bookingWay;
    }

    /**
     * 是否重要订单：0：重要，1：不重要
     * @return is_important 是否重要订单：0：重要，1：不重要
     */
    public Short getIsImportant() {
        return isImportant;
    }

    /**
     * 是否重要订单：0：重要，1：不重要
     * @param isImportant 是否重要订单：0：重要，1：不重要
     */
    public void setIsImportant(Short isImportant) {
        this.isImportant = isImportant;
    }

    /**
     * 产品id
     * @return product_id 产品id
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * 产品id
     * @param productId 产品id
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * 产品名称
     * @return product_name 产品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 产品名称
     * @param productName 产品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 代办登机牌 1:需要，0：不需要
     * @return print_check 代办登机牌 1:需要，0：不需要
     */
    public Short getPrintCheck() {
        return printCheck;
    }

    /**
     * 代办登机牌 1:需要，0：不需要
     * @param printCheck 代办登机牌 1:需要，0：不需要
     */
    public void setPrintCheck(Short printCheck) {
        this.printCheck = printCheck;
    }

    /**
     * 座位要求: 靠窗 靠走道 不要安全门 前排 后排
     * @return print_check_remark 座位要求: 靠窗 靠走道 不要安全门 前排 后排
     */
    public String getPrintCheckRemark() {
        return printCheckRemark;
    }

    /**
     * 座位要求: 靠窗 靠走道 不要安全门 前排 后排
     * @param printCheckRemark 座位要求: 靠窗 靠走道 不要安全门 前排 后排
     */
    public void setPrintCheckRemark(String printCheckRemark) {
        this.printCheckRemark = printCheckRemark;
    }

    /**
     * 代办托运 1:需要，0：不需要
     * @return consign 代办托运 1:需要，0：不需要
     */
    public Short getConsign() {
        return consign;
    }

    /**
     * 代办托运 1:需要，0：不需要
     * @param consign 代办托运 1:需要，0：不需要
     */
    public void setConsign(Short consign) {
        this.consign = consign;
    }

    /**
     * 是否托运说明
     * @return consign_remark 是否托运说明
     */
    public String getConsignRemark() {
        return consignRemark;
    }

    /**
     * 是否托运说明
     * @param consignRemark 是否托运说明
     */
    public void setConsignRemark(String consignRemark) {
        this.consignRemark = consignRemark;
    }

    /**
     * 服务说明
     * @return other_remark 服务说明
     */
    public String getOtherRemark() {
        return otherRemark;
    }

    /**
     * 服务说明
     * @param otherRemark 服务说明
     */
    public void setOtherRemark(String otherRemark) {
        this.otherRemark = otherRemark;
    }

    /**
     * 0:预约成功，1：消费,2 : 取消，3：草稿
     * @return order_status 0:预约成功，1：消费,2 : 取消，3：草稿
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 0:预约成功，1：消费,2 : 取消，3：草稿
     * @param orderStatus 0:预约成功，1：消费,2 : 取消，3：草稿
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 订单类型：0：预约订单，1：服务订单
     * @return order_type 订单类型：0：预约订单，1：服务订单
     */
    public Short getOrderType() {
        return orderType;
    }

    /**
     * 订单类型：0：预约订单，1：服务订单
     * @param orderType 订单类型：0：预约订单，1：服务订单
     */
    public void setOrderType(Short orderType) {
        this.orderType = orderType;
    }

    /**
     * 代办完成：0：是，1：否
     * @return agent_complete 代办完成：0：是，1：否
     */
    public Short getAgentComplete() {
        return agentComplete;
    }

    /**
     * 代办完成：0：是，1：否
     * @param agentComplete 代办完成：0：是，1：否
     */
    public void setAgentComplete(Short agentComplete) {
        this.agentComplete = agentComplete;
    }

    /**
     * 安排代办人
     * @return agent_person 安排代办人
     */
    public Long getAgentPerson() {
        return agentPerson;
    }

    /**
     * 安排代办人
     * @param agentPerson 安排代办人
     */
    public void setAgentPerson(Long agentPerson) {
        this.agentPerson = agentPerson;
    }

    /**
     * 安排代办人姓名
     * @return agent_person_name 安排代办人姓名
     */
    public String getAgentPersonName() {
        return agentPersonName;
    }

    /**
     * 安排代办人姓名
     * @param agentPersonName 安排代办人姓名
     */
    public void setAgentPersonName(String agentPersonName) {
        this.agentPersonName = agentPersonName;
    }

    /**
     * 证件
     * @return server_card_no 证件
     */
    public String getServerCardNo() {
        return serverCardNo;
    }

    /**
     * 证件
     * @param serverCardNo 证件
     */
    public void setServerCardNo(String serverCardNo) {
        this.serverCardNo = serverCardNo;
    }

    /**
     * 贵宾卡
     * @return vip_card 贵宾卡
     */
    public String getVipCard() {
        return vipCard;
    }

    /**
     * 贵宾卡
     * @param vipCard 贵宾卡
     */
    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }

    /**
     * 现金
     * @return cash 现金
     */
    public BigDecimal getCash() {
        return cash;
    }

    /**
     * 现金
     * @param cash 现金
     */
    public void setCash(BigDecimal cash) {
        this.cash = cash;
    }

    /**
     * 座位号
     * @return sit_no 座位号
     */
    public String getSitNo() {
        return sitNo;
    }

    /**
     * 座位号
     * @param sitNo 座位号
     */
    public void setSitNo(String sitNo) {
        this.sitNo = sitNo;
    }

    /**
     * 服务地点
     * @return server_location 服务地点
     */
    public String getServerLocation() {
        return serverLocation;
    }

    /**
     * 服务地点
     * @param serverLocation 服务地点
     */
    public void setServerLocation(String serverLocation) {
        this.serverLocation = serverLocation;
    }

    /**
     * 服务完成：0：否,1：是
     * @return server_complete 服务完成：0：否,1：是
     */
    public Short getServerComplete() {
        return serverComplete;
    }

    /**
     * 服务完成：0：否,1：是
     * @param serverComplete 服务完成：0：否,1：是
     */
    public void setServerComplete(Short serverComplete) {
        this.serverComplete = serverComplete;
    }

    /**
     * 服务完成时间
     * @return server_complete_time 服务完成时间
     */
    public Date getServerCompleteTime() {
        return serverCompleteTime;
    }

    /**
     * 服务完成时间
     * @param serverCompleteTime 服务完成时间
     */
    public void setServerCompleteTime(Date serverCompleteTime) {
        this.serverCompleteTime = serverCompleteTime;
    }

    /**
     * 服务完成人id
     * @return server_complete_id 服务完成人id
     */
    public Long getServerCompleteId() {
        return serverCompleteId;
    }

    /**
     * 服务完成人id
     * @param serverCompleteId 服务完成人id
     */
    public void setServerCompleteId(Long serverCompleteId) {
        this.serverCompleteId = serverCompleteId;
    }

    /**
     * 服务完成人名称
     * @return server_complete_name 服务完成人名称
     */
    public String getServerCompleteName() {
        return serverCompleteName;
    }

    /**
     * 服务完成人名称
     * @param serverCompleteName 服务完成人名称
     */
    public void setServerCompleteName(String serverCompleteName) {
        this.serverCompleteName = serverCompleteName;
    }

    /**
     * 服务人数
     * @return server_person_num 服务人数
     */
    public Integer getServerPersonNum() {
        return serverPersonNum;
    }

    /**
     * 服务人数
     * @param serverPersonNum 服务人数
     */
    public void setServerPersonNum(Integer serverPersonNum) {
        this.serverPersonNum = serverPersonNum;
    }

    /**
     * 随行人数
     * @return along_total 随行人数
     */
    public Integer getAlongTotal() {
        return alongTotal;
    }

    /**
     * 随行人数
     * @param alongTotal 随行人数
     */
    public void setAlongTotal(Integer alongTotal) {
        this.alongTotal = alongTotal;
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
     * 创建人姓名
     * @return create_user_name 创建人姓名
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 创建人姓名
     * @param createUserName 创建人姓名
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
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

    /**
     * 服务订单创建时间
     * @return server_create_time 服务订单创建时间
     */
    public Date getServerCreateTime() {
        return serverCreateTime;
    }

    /**
     * 服务订单创建时间
     * @param serverCreateTime 服务订单创建时间
     */
    public void setServerCreateTime(Date serverCreateTime) {
        this.serverCreateTime = serverCreateTime;
    }

    /**
     * 服务订单创建人id
     * @return server_create_user_id 服务订单创建人id
     */
    public Long getServerCreateUserId() {
        return serverCreateUserId;
    }

    /**
     * 服务订单创建人id
     * @param serverCreateUserId 服务订单创建人id
     */
    public void setServerCreateUserId(Long serverCreateUserId) {
        this.serverCreateUserId = serverCreateUserId;
    }

    /**
     * 服务订单创建人姓名
     * @return server_create_user_name 服务订单创建人姓名
     */
    public String getServerCreateUserName() {
        return serverCreateUserName;
    }

    /**
     * 服务订单创建人姓名
     * @param serverCreateUserName 服务订单创建人姓名
     */
    public void setServerCreateUserName(String serverCreateUserName) {
        this.serverCreateUserName = serverCreateUserName;
    }

    /**
     * 服务订单修改时间
     * @return server_update_time 服务订单修改时间
     */
    public Date getServerUpdateTime() {
        return serverUpdateTime;
    }

    /**
     * 服务订单修改时间
     * @param serverUpdateTime 服务订单修改时间
     */
    public void setServerUpdateTime(Date serverUpdateTime) {
        this.serverUpdateTime = serverUpdateTime;
    }

    /**
     * 服务订单修改人id
     * @return server_update_user_id 服务订单修改人id
     */
    public Long getServerUpdateUserId() {
        return serverUpdateUserId;
    }

    /**
     * 服务订单修改人id
     * @param serverUpdateUserId 服务订单修改人id
     */
    public void setServerUpdateUserId(Long serverUpdateUserId) {
        this.serverUpdateUserId = serverUpdateUserId;
    }

    /**
     * 服务订单修改人姓名
     * @return server_update_user_name 服务订单修改人姓名
     */
    public String getServerUpdateUserName() {
        return serverUpdateUserName;
    }

    /**
     * 服务订单修改人姓名
     * @param serverUpdateUserName 服务订单修改人姓名
     */
    public void setServerUpdateUserName(String serverUpdateUserName) {
        this.serverUpdateUserName = serverUpdateUserName;
    }

    /**
     * 创建人角色（多个）
     * @return create_role 创建人角色（多个）
     */
    public String getCreateRole() {
        return createRole;
    }

    /**
     * 创建人角色（多个）
     * @param createRole 创建人角色（多个）
     */
    public void setCreateRole(String createRole) {
        this.createRole = createRole;
    }

    /**
     * 安检礼遇 1:需要，0：不需要
     * @return security_check 安检礼遇 1:需要，0：不需要
     */
    public Short getSecurityCheck() {
        return securityCheck;
    }

    /**
     * 安检礼遇 1:需要，0：不需要
     * @param securityCheck 安检礼遇 1:需要，0：不需要
     */
    public void setSecurityCheck(Short securityCheck) {
        this.securityCheck = securityCheck;
    }

    /**
     * 安检礼遇备注
     * @return security_check_remark 安检礼遇备注
     */
    public String getSecurityCheckRemark() {
        return securityCheckRemark;
    }

    /**
     * 安检礼遇备注
     * @param securityCheckRemark 安检礼遇备注
     */
    public void setSecurityCheckRemark(String securityCheckRemark) {
        this.securityCheckRemark = securityCheckRemark;
    }

    /**
     * 服务订单创建人id
     * @return numbers 服务订单创建人id
     */
    public Long getnumbers() {
        return numbers;
    }

    /**
     * 服务订单创建人id
     * @param numbers 服务订单创建人id
     */
    public void setnumbers(Long numbers) {
        this.numbers = numbers;
    }


}
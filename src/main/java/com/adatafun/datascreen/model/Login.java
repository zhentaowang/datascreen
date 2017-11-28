/**
 * Login.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-28 10:23:26 Created By null
*/
package com.adatafun.datascreen.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Login.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-28 10:23:26 Created By null
*/
@ApiModel(value="Login",description="login")
public class Login {
    @ApiModelProperty(value="主键自增id",name="userId", required=true)
    @NotEmpty
    private Long userId;

    @ApiModelProperty(value="用户名",name="username", required=true)
    @NotEmpty
    private String username;

    @ApiModelProperty(value="密码",name="userpwd", required=true)
    @NotEmpty
    private String userpwd;

    /**
     * 主键自增id
     * @return user_id 主键自增id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 主键自增id
     * @param userId 主键自增id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 用户名
     * @return username 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码
     * @return userpwd 密码
     */
    public String getUserpwd() {
        return userpwd;
    }

    /**
     * 密码
     * @param userpwd 密码
     */
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}
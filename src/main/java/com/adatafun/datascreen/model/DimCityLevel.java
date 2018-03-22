/**
 * DimCityLevel.java
 * Copyright(C) 2016 杭州量子金融信息服务有限公司
 * https://www.zhiweicloud.com
 * 2017-11-27 17:07:22 Created By wzt
*/
package com.adatafun.datascreen.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * DimCityLevel.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/27.
 */
@ApiModel(value="DimCityLevel",description="dim_city_level")
public class DimCityLevel {
    @ApiModelProperty(value="",name="id", required=true)
    @NotEmpty
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @ApiModelProperty(value="",name="name")
    private String name;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return name 
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }
}
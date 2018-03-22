/**
 * DimLocation.java
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
 * DimLocation.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/27.
 */
@ApiModel(value="DimLocation",description="dim_location")
public class DimLocation {
    @ApiModelProperty(value=" 编号",name="id", required=true)
    @NotEmpty
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    @ApiModelProperty(value="名称",name="name")
    private String name;

    @ApiModelProperty(value="级别 1洲；2国家；3地域；4省/州；5城市；6县/区域",name="level")
    private Integer level;

    @ApiModelProperty(value="上级中级别为1的id",name="l1")
    private Integer l1;

    @ApiModelProperty(value="上级中级别为2的id",name="l2")
    private Integer l2;

    @ApiModelProperty(value="上级中级别为3的id",name="l3")
    private Integer l3;

    @ApiModelProperty(value="上级中级别为4的id",name="l4")
    private Integer l4;

    @ApiModelProperty(value="上级中级别为5的id",name="l5")
    private Integer l5;

    @ApiModelProperty(value="上级中级别为6的id",name="l6")
    private Integer l6;

    @ApiModelProperty(value="上级中级别为1的name",name="l1Name")
    private String l1Name;

    @ApiModelProperty(value="上级中级别为2的name",name="l2Name")
    private String l2Name;

    @ApiModelProperty(value="上级中级别为3的name",name="l3Name")
    private String l3Name;

    @ApiModelProperty(value="上级中级别为4的name",name="l4Name")
    private String l4Name;

    @ApiModelProperty(value="上级中级别为5的name",name="l5Name")
    private String l5Name;

    @ApiModelProperty(value="上级中级别为5的name",name="l6Name")
    private String l6Name;

    @ApiModelProperty(value="城市类型，1：旅游城市，-1：默认值",name="type")
    private Byte type;

    @ApiModelProperty(value="",name="cityLevel")
    private String cityLevel;

    /**
     *  编号
     * @return id  编号
     */
    public Integer getId() {
        return id;
    }

    /**
     *  编号
     * @param id  编号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 级别 1洲；2国家；3地域；4省/州；5城市；6县/区域
     * @return level 级别 1洲；2国家；3地域；4省/州；5城市；6县/区域
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 级别 1洲；2国家；3地域；4省/州；5城市；6县/区域
     * @param level 级别 1洲；2国家；3地域；4省/州；5城市；6县/区域
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 上级中级别为1的id
     * @return l1 上级中级别为1的id
     */
    public Integer getL1() {
        return l1;
    }

    /**
     * 上级中级别为1的id
     * @param l1 上级中级别为1的id
     */
    public void setL1(Integer l1) {
        this.l1 = l1;
    }

    /**
     * 上级中级别为2的id
     * @return l2 上级中级别为2的id
     */
    public Integer getL2() {
        return l2;
    }

    /**
     * 上级中级别为2的id
     * @param l2 上级中级别为2的id
     */
    public void setL2(Integer l2) {
        this.l2 = l2;
    }

    /**
     * 上级中级别为3的id
     * @return l3 上级中级别为3的id
     */
    public Integer getL3() {
        return l3;
    }

    /**
     * 上级中级别为3的id
     * @param l3 上级中级别为3的id
     */
    public void setL3(Integer l3) {
        this.l3 = l3;
    }

    /**
     * 上级中级别为4的id
     * @return l4 上级中级别为4的id
     */
    public Integer getL4() {
        return l4;
    }

    /**
     * 上级中级别为4的id
     * @param l4 上级中级别为4的id
     */
    public void setL4(Integer l4) {
        this.l4 = l4;
    }

    /**
     * 上级中级别为5的id
     * @return l5 上级中级别为5的id
     */
    public Integer getL5() {
        return l5;
    }

    /**
     * 上级中级别为5的id
     * @param l5 上级中级别为5的id
     */
    public void setL5(Integer l5) {
        this.l5 = l5;
    }

    /**
     * 上级中级别为6的id
     * @return l6 上级中级别为6的id
     */
    public Integer getL6() {
        return l6;
    }

    /**
     * 上级中级别为6的id
     * @param l6 上级中级别为6的id
     */
    public void setL6(Integer l6) {
        this.l6 = l6;
    }

    /**
     * 上级中级别为1的name
     * @return l1_name 上级中级别为1的name
     */
    public String getL1Name() {
        return l1Name;
    }

    /**
     * 上级中级别为1的name
     * @param l1Name 上级中级别为1的name
     */
    public void setL1Name(String l1Name) {
        this.l1Name = l1Name;
    }

    /**
     * 上级中级别为2的name
     * @return l2_name 上级中级别为2的name
     */
    public String getL2Name() {
        return l2Name;
    }

    /**
     * 上级中级别为2的name
     * @param l2Name 上级中级别为2的name
     */
    public void setL2Name(String l2Name) {
        this.l2Name = l2Name;
    }

    /**
     * 上级中级别为3的name
     * @return l3_name 上级中级别为3的name
     */
    public String getL3Name() {
        return l3Name;
    }

    /**
     * 上级中级别为3的name
     * @param l3Name 上级中级别为3的name
     */
    public void setL3Name(String l3Name) {
        this.l3Name = l3Name;
    }

    /**
     * 上级中级别为4的name
     * @return l4_name 上级中级别为4的name
     */
    public String getL4Name() {
        return l4Name;
    }

    /**
     * 上级中级别为4的name
     * @param l4Name 上级中级别为4的name
     */
    public void setL4Name(String l4Name) {
        this.l4Name = l4Name;
    }

    /**
     * 上级中级别为5的name
     * @return l5_name 上级中级别为5的name
     */
    public String getL5Name() {
        return l5Name;
    }

    /**
     * 上级中级别为5的name
     * @param l5Name 上级中级别为5的name
     */
    public void setL5Name(String l5Name) {
        this.l5Name = l5Name;
    }

    /**
     * 上级中级别为5的name
     * @return l6_name 上级中级别为5的name
     */
    public String getL6Name() {
        return l6Name;
    }

    /**
     * 上级中级别为5的name
     * @param l6Name 上级中级别为5的name
     */
    public void setL6Name(String l6Name) {
        this.l6Name = l6Name;
    }

    /**
     * 城市类型，1：旅游城市，-1：默认值
     * @return type 城市类型，1：旅游城市，-1：默认值
     */
    public Byte getType() {
        return type;
    }

    /**
     * 城市类型，1：旅游城市，-1：默认值
     * @param type 城市类型，1：旅游城市，-1：默认值
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 
     * @return city_level 
     */
    public String getCityLevel() {
        return cityLevel;
    }

    /**
     * 
     * @param cityLevel 
     */
    public void setCityLevel(String cityLevel) {
        this.cityLevel = cityLevel;
    }
}
package com.adatafun.datascreen.model;

import io.searchbox.annotations.JestId;

/**
 * User.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 05/09/2017.
 */
public class User {

    @JestId
    private String  userId;
    private Long  nameValidation;
    private Long  sex;
    private Long  age;
    private String  city;
    private String  cityLevel;
    private String  cityRegion;
    private String  institutionType;
    private String  protocolType;
    private String  productType;
    private Long  jianhangting;
    private Long  jht_accumulationUsage;
    private String  jht_recencyUsage;
    private String  jht_notRecencyUsage;
    private Long  jht_serviceCount;
    private Long  longtengting;
    private Long  ltt_accumulationUsage;
    private String  ltt_recencyUsage;
    private String  ltt_notRecencyUsage;
    private Long  ltt_serviceCount;
    private Long  toudengcang;
    private Long  tdc_accumulationUsage;
    private String  tdc_recencyUsage;
    private String  tdc_notRecencyUsage;
    private Long  tdc_serviceCount;
    private Long  houjianqu;
    private Long  hjq_accumulationUsage;
    private String  hjq_recencyUsage;
    private String  hjq_notRecencyUsage;
    private Long  hjq_serviceCount;
    private Long  huiyuanqu;
    private Long  hyq_accumulationUsage;
    private String  hyq_recencyUsage;
    private String  hyq_notRecencyUsage;
    private Long  hyq_serviceCount;
    private Long  bieyuanting;
    private Long  byt_accumulationUsage;
    private String  byt_recencyUsage;
    private String  byt_notRecencyUsage;
    private Long  byt_serviceCount;
    private Long  liuhaoting;
    private Long  lht_accumulationUsage;
    private String  lht_recencyUsage;
    private String  lht_notRecencyUsage;
    private Long  lht_serviceCount;
    private Long  zhaohangting;
    private Long  zht_accumulationUsage;
    private String  zht_recencyUsage;
    private String  zht_notRecencyUsage;
    private Long  zht_serviceCount;
    private Long  nonghangting;
    private Long  nht_accumulationUsage;
    private String  nht_recencyUsage;
    private String  nht_notRecencyUsage;
    private Long  nht_serviceCount;
    private Long  gonghangting;
    private Long  ght_accumulationUsage;
    private String  ght_recencyUsage;
    private String  ght_notRecencyUsage;
    private Long  ght_serviceCount;
    private Long  zhengyaoting;
    private Long  zyt_accumulationUsage;
    private String  zyt_recencyUsage;
    private String  zyt_notRecencyUsage;
    private Long  zyt_serviceCount;
    private String  province;
    private Long  accumulationUsageTotal;


    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public User(String userId, Long nameValidation, Long sex, Long age, String city,
                String cityLevel, String cityRegion, String institutionType, String protocolType,
                String  productType, Long  jianhangting, Long  jht_accumulationUsage,
                String jht_recencyUsage, String jht_notRecencyUsage, Long jht_serviceCount,
                Long  lontengting, Long  ltt_accumulationUsage,
                String ltt_recencyUsage, String ltt_notRecencyUsage, Long ltt_serviceCount,
                Long  toudengcang, Long  tdc_accumulationUsage,
                String tdc_recencyUsage, String tdc_notRecencyUsage, Long tdc_serviceCount,
                Long  houjianqu, Long  hjq_accumulationUsage,
                String hjq_recencyUsage, String hjq_notRecencyUsage, Long hjq_serviceCount,
                Long  huiyuanqu, Long  hyq_accumulationUsage,
                String hyq_recencyUsage, String hyq_notRecencyUsage, Long hyq_serviceCount,
                Long  bieyuanting, Long  byt_accumulationUsage,
                String byt_recencyUsage, String byt_notRecencyUsage, Long byt_serviceCount,
                Long  liuhaoting, Long  lht_accumulationUsage,
                String lht_recencyUsage, String lht_notRecencyUsage, Long lht_serviceCount,
                Long  zhanhangting, Long  zht_accumulationUsage,
                String zht_recencyUsage, String zht_notRecencyUsage, Long zht_serviceCount,
                Long  nonghangting, Long  nht_accumulationUsage,
                String nht_recencyUsage, String nht_notRecencyUsage, Long nht_serviceCount,
                Long  gonghangting, Long  ght_accumulationUsage,
                String ght_recencyUsage, String ght_notRecencyUsage, Long ght_serviceCount,
                Long  zhengyaoting, Long  zyt_accumulationUsage,
                String zyt_recencyUsage, String zyt_notRecencyUsage, Long zyt_serviceCount,
                String province, Long accumulationUsageTotal) {
        super();
        this.userId = userId;
        this.nameValidation = nameValidation;
        this.sex = sex;
        this.age = age;
        this.city = city;
        this.cityLevel = cityLevel;
        this.cityRegion = cityRegion;
        this.institutionType = institutionType;
        this.protocolType = protocolType;
        this.productType = productType;
        this.jianhangting = jianhangting;
        this.jht_accumulationUsage = jht_accumulationUsage;
        this.jht_recencyUsage = jht_recencyUsage;
        this.jht_notRecencyUsage = jht_notRecencyUsage;
        this.jht_serviceCount = jht_serviceCount;
        this.longtengting = lontengting;
        this.ltt_accumulationUsage = ltt_accumulationUsage;
        this.ltt_recencyUsage = ltt_recencyUsage;
        this.ltt_notRecencyUsage = ltt_notRecencyUsage;
        this.ltt_serviceCount = ltt_serviceCount;
        this.toudengcang = toudengcang;
        this.tdc_accumulationUsage = tdc_accumulationUsage;
        this.tdc_recencyUsage = tdc_recencyUsage;
        this.tdc_notRecencyUsage = tdc_notRecencyUsage;
        this.tdc_serviceCount = tdc_serviceCount;
        this.houjianqu = houjianqu;
        this.hjq_accumulationUsage = hjq_accumulationUsage;
        this.hjq_recencyUsage = hjq_recencyUsage;
        this.hjq_notRecencyUsage = hjq_notRecencyUsage;
        this.hjq_serviceCount = hjq_serviceCount;
        this.huiyuanqu = huiyuanqu;
        this.hyq_accumulationUsage = hyq_accumulationUsage;
        this.hyq_recencyUsage = hyq_recencyUsage;
        this.hyq_notRecencyUsage = hyq_notRecencyUsage;
        this.hyq_serviceCount = hyq_serviceCount;
        this.bieyuanting = bieyuanting;
        this.byt_accumulationUsage = byt_accumulationUsage;
        this.byt_recencyUsage = byt_recencyUsage;
        this.byt_notRecencyUsage = byt_notRecencyUsage;
        this.byt_serviceCount = byt_serviceCount;
        this.liuhaoting = liuhaoting;
        this.lht_accumulationUsage = lht_accumulationUsage;
        this.lht_recencyUsage = lht_recencyUsage;
        this.lht_notRecencyUsage = lht_notRecencyUsage;
        this.lht_serviceCount = lht_serviceCount;
        this.zhaohangting = zhanhangting;
        this.zht_accumulationUsage = zht_accumulationUsage;
        this.zht_recencyUsage = zht_recencyUsage;
        this.zht_notRecencyUsage = zht_notRecencyUsage;
        this.zht_serviceCount = zht_serviceCount;
        this.nonghangting = nonghangting;
        this.nht_accumulationUsage = nht_accumulationUsage;
        this.nht_recencyUsage = nht_recencyUsage;
        this.nht_notRecencyUsage = nht_notRecencyUsage;
        this.nht_serviceCount = nht_serviceCount;
        this.gonghangting = gonghangting;
        this.ght_accumulationUsage = ght_accumulationUsage;
        this.ght_recencyUsage = ght_recencyUsage;
        this.ght_notRecencyUsage = ght_notRecencyUsage;
        this.ght_serviceCount = ght_serviceCount;
        this.zhengyaoting = zhengyaoting;
        this.zyt_accumulationUsage = zyt_accumulationUsage;
        this.zyt_recencyUsage = zyt_recencyUsage;
        this.zyt_notRecencyUsage = zyt_notRecencyUsage;
        this.zyt_serviceCount = zyt_serviceCount;
        this.province = province;
        this.accumulationUsageTotal = accumulationUsageTotal;
    }

    public String getTermsLabelName() {
        String termsRegex = getSexName() + "|" + getNameValidationName()  + "|" + getCityName()  + "|" + getCityLevelName()
                + "|" + getCityRegionName()  + "|" + getInstitutionTypeName()  + "|" + getProtocolTypeName()  + "|" + getProductTypeName()
                + "|" + getJht_recencyUsageName()  + "|" + getJht_notRecencyUsageName()  + "|" + getLtt_recencyUsageName()
                + "|" + getLtt_notRecencyUsageName()  + "|" + getTdc_recencyUsageName()  + "|" + getTdc_notRecencyUsageName()
                + "|" + getHjq_recencyUsageName()  + "|" + getHjq_notRecencyUsageName()  + "|" + getHyq_recencyUsagName()
                + "|" + getHyq_notRecencyUsageName()  + "|" + getByt_recencyUsageName()  + "|" + getByt_notRecencyUsageName()
                + "|" + getLht_recencyUsageName()  + "|" + getLht_notRecencyUsageName()  + "|" + getZht_recencyUsageName()
                + "|" + getZht_notRecencyUsageName()  + "|" + getNht_recencyUsageName()  + "|" + getNht_notRecencyUsageName()
                + "|" + getGht_recencyUsageName()  + "|" + getGht_notRecencyUsageName()  + "|" + getZyt_recencyUsageName()
                + "|" + getZyt_notRecencyUsageName() + "|" + getProvinceName();
        return termsRegex;
    }

    public String getRangesLabelName() {
        String rangesRegex = getAgeName() + "|" + getJht_accumulationUsagName() + "|" + getJht_serviceCountName()
                + "|" + getLtt_accumulationUsagName() + "|" + getLtt_serviceCountName() + "|" + getTdc_accumulationUsageName()
                + "|" + getTdc_serviceCountName() + "|" + getHjq_serviceCountName() + "|" + getHjq_accumulationUsageName()
                + "|" + getHyq_accumulationUsageName() + "|" + getHyq_serviceCountName() + "|" + getByt_accumulationUsageName()
                + "|" + getByt_serviceCountName() + "|" + getLht_accumulationUsageName() + "|" + getLht_serviceCountName()
                + "|" + getZht_accumulationUsageName() + "|" + getZht_serviceCountName() + "|" + getNht_accumulationUsageName()
                + "|" + getNht_serviceCountName() + "|" + getGht_accumulationUsageName() + "|" + getGht_serviceCountName()
                + "|" + getZyt_accumulationUsageName() + "|" + getZyt_serviceCountName() + "|" + getAccumulationUsageTotalName();
        return rangesRegex;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", nameValidation=" + nameValidation + ", sex=" + sex +
                ", age=" + age + ", city=" + city + ", cityLevel=" + cityLevel + ", cityRegion=" + cityRegion +
                ", institutionType=" + institutionType + ", protocolType=" + protocolType + ", productType=" + productType +
                ", jianhangting=" + jianhangting + "jht_accumulationUsage" + jht_accumulationUsage +
                ", jht_recencyUsage=" + jht_recencyUsage + ", jht_notRecencyUsage=" + jht_notRecencyUsage + ", jht_serviceCount=" + jht_serviceCount +
                ", longtengting=" + longtengting + "ltt_accumulationUsage" + ltt_accumulationUsage +
                ", ltt_recencyUsage=" + ltt_recencyUsage + ", ltt_notRecencyUsage=" + ltt_notRecencyUsage + ", ltt_serviceCount=" + ltt_serviceCount +
                ", toudengcang=" + toudengcang + "tdc_accumulationUsage" + tdc_accumulationUsage +
                ", tdc_recencyUsage=" + tdc_recencyUsage + ", tdc_notRecencyUsage=" + tdc_notRecencyUsage + ", tdc_serviceCount=" + tdc_serviceCount +
                ", houjianqu=" + houjianqu + "hjq_accumulationUsage" + hjq_accumulationUsage +
                ", hjq_recencyUsage=" + hjq_recencyUsage + ", hjq_notRecencyUsage=" + hjq_notRecencyUsage + ", hjq_serviceCount=" + hjq_serviceCount +
                ", huiyuanqu=" + huiyuanqu + "hyq_accumulationUsage" + hyq_accumulationUsage +
                ", hyq_recencyUsage=" + hyq_recencyUsage + ", hyq_notRecencyUsage=" + hyq_notRecencyUsage + ", hyq_serviceCount=" + hyq_serviceCount +
                ", bieyuanting=" + bieyuanting+ "byt_accumulationUsage" + byt_accumulationUsage +
                ", byt_recencyUsage=" + byt_recencyUsage + ", byt_notRecencyUsage=" + byt_notRecencyUsage + ", byt_serviceCount=" + byt_serviceCount +
                ", liuhaoting=" + liuhaoting + "lht_accumulationUsage" + lht_accumulationUsage +
                ", lht_recencyUsage=" + lht_recencyUsage + ", lht_notRecencyUsage=" + lht_notRecencyUsage + ", lht_serviceCount=" + lht_serviceCount +
                ", zhaohangting=" + zhaohangting + "zht_accumulationUsage" + zht_accumulationUsage +
                ", zht_recencyUsage=" + zht_recencyUsage + ", zht_notRecencyUsage=" + zht_notRecencyUsage + ", zht_serviceCount=" + zht_serviceCount +
                ", nonghangting=" + nonghangting + "nht_accumulationUsage" + nht_accumulationUsage +
                ", nht_recencyUsage=" + nht_recencyUsage + ", nht_notRecencyUsage=" + nht_notRecencyUsage + ", nht_serviceCount=" + nht_serviceCount +
                ", gonghangting=" + gonghangting + "ght_accumulationUsage" + ght_accumulationUsage +
                ", ght_recencyUsage=" + ght_recencyUsage + ", ght_notRecencyUsage=" + ght_notRecencyUsage + ", ght_serviceCount=" + ght_serviceCount +
                ", zhengyaoting=" + zhengyaoting + "zyt_accumulationUsage" + zyt_accumulationUsage +
                ", zyt_recencyUsage=" + zyt_recencyUsage + ", zyt_notRecencyUsage=" + zyt_notRecencyUsage + ", zyt_serviceCount=" + zyt_serviceCount +
                ", province=" + province + ", accumulationUsageTotal=" + accumulationUsageTotal +"]";
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getNameValidation() {
        return nameValidation;
    }

    public void setNameValidation(Long nameValidation) {
        this.nameValidation = nameValidation;
    }

    public String getNameValidationName() {
        return "nameValidation";
    }

    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    public String getSexName() {
        return "sex";
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public String getAgeName() {
        return "age";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCityName() {
        return "city";
    }

    public String getCityLevel() {
        return cityLevel;
    }

    public void setCityLevel(String cityLevel) {
        this.cityLevel = cityLevel;
    }

    public String getCityLevelName() {
        return "cityLevel";
    }

    public String getCityRegion() {
        return cityRegion;
    }

    public void setCityRegion(String cityRegion) {
        this.cityRegion = cityRegion;
    }

    public String getCityRegionName() {
        return "cityRegion";
    }

    public String getInstitutionType() {
        return institutionType;
    }

    public void setInstitutionType(String institutionType) {
        this.institutionType = institutionType;
    }

    public String getInstitutionTypeName() {
        return "institutionType";
    }

    public String getProtocolType() {
        return protocolType;
    }

    public void setProtocolType(String protocolType) {
        this.protocolType = protocolType;
    }

    public String getProtocolTypeName() {
        return "protocolType";
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductTypeName() {
        return "productType";
    }

    public Long getJianhangting() {
        return jianhangting;
    }

    public void setJianhangting(Long jianhangting) {
        this.jianhangting = jianhangting;
    }

    public String getJianhangtingName() {
        return "jianhangting";
    }

    public Long getJht_accumulationUsage() {
        return jht_accumulationUsage;
    }

    public void setJht_accumulationUsage(Long jht_accumulationUsage) {
        this.jht_accumulationUsage = jht_accumulationUsage;
    }

    public String getJht_accumulationUsagName() {
        return "jht_accumulationUsage";
    }

    public String getJht_recencyUsage() {
        return jht_recencyUsage;
    }

    public void setJht_recencyUsage(String jht_recencyUsage) {
        this.jht_recencyUsage = jht_recencyUsage;
    }

    public String getJht_recencyUsageName() {
        return "jht_recencyUsage";
    }

    public String getJht_notRecencyUsage() {
        return jht_notRecencyUsage;
    }

    public void setJht_notRecencyUsage(String jht_notRecencyUsage) {
        this.jht_notRecencyUsage = jht_notRecencyUsage;
    }

    public String getJht_notRecencyUsageName() {
        return "jht_notRecencyUsage";
    }

    public Long getJht_serviceCount() {
        return jht_serviceCount;
    }

    public void setJht_serviceCount(Long jht_serviceCount) {
        this.jht_serviceCount = jht_serviceCount;
    }

    public String getJht_serviceCountName() {
        return "jht_serviceCount";
    }

    public Long getLongtengting() {
        return longtengting;
    }

    public void setLongtengting(Long longtengting) {
        this.longtengting = longtengting;
    }

    public String getLongtengtingName() {
        return "longtengting";
    }

    public Long getLtt_accumulationUsage() {
        return ltt_accumulationUsage;
    }

    public void setLtt_accumulationUsage(Long ltt_accumulationUsage) {
        this.ltt_accumulationUsage = ltt_accumulationUsage;
    }

    public String getLtt_accumulationUsagName() {
        return "ltt_accumulationUsage";
    }

    public String getLtt_recencyUsage() {
        return ltt_recencyUsage;
    }

    public void setLtt_recencyUsage(String ltt_recencyUsage) {
        this.ltt_recencyUsage = ltt_recencyUsage;
    }

    public String getLtt_recencyUsageName() {
        return "ltt_recencyUsage";
    }

    public String getLtt_notRecencyUsage() {
        return ltt_notRecencyUsage;
    }

    public void setLtt_notRecencyUsage(String ltt_notRecencyUsage) {
        this.ltt_notRecencyUsage = ltt_notRecencyUsage;
    }

    public String getLtt_notRecencyUsageName() {
        return "ltt_notRecencyUsage";
    }

    public Long getLtt_serviceCount() {
        return ltt_serviceCount;
    }

    public void setLtt_serviceCount(Long ltt_serviceCount) {
        this.ltt_serviceCount = ltt_serviceCount;
    }

    public String getLtt_serviceCountName() {
        return "ltt_serviceCount";
    }

    public Long getToudengcang() {
        return toudengcang;
    }

    public void setToudengcang(Long toudengcang) {
        this.toudengcang = toudengcang;
    }

    public String getToudengcangName() {
        return "toudengcang";
    }

    public Long getTdc_accumulationUsage() {
        return tdc_accumulationUsage;
    }

    public void setTdc_accumulationUsage(Long tdc_accumulationUsage) {
        this.tdc_accumulationUsage = tdc_accumulationUsage;
    }

    public String getTdc_accumulationUsageName() {
        return "tdc_accumulationUsage";
    }

    public String getTdc_recencyUsage() {
        return tdc_recencyUsage;
    }

    public void setTdc_recencyUsage(String tdc_recencyUsage) {
        this.tdc_recencyUsage = tdc_recencyUsage;
    }

    public String getTdc_recencyUsageName() {
        return "tdc_recencyUsage";
    }

    public String getTdc_notRecencyUsage() {
        return tdc_notRecencyUsage;
    }

    public void setTdc_notRecencyUsage(String tdc_notRecencyUsage) {
        this.tdc_notRecencyUsage = tdc_notRecencyUsage;
    }

    public String getTdc_notRecencyUsageName() {
        return "tdc_notRecencyUsage";
    }

    public Long getTdc_serviceCount() {
        return tdc_serviceCount;
    }

    public void setTdc_serviceCount(Long tdc_serviceCount) {
        this.tdc_serviceCount = tdc_serviceCount;
    }

    public String getTdc_serviceCountName() {
        return "tdc_serviceCount";
    }

    public Long getHoujianqu() {
        return houjianqu;
    }

    public void setHoujianqu(Long houjianqu) {
        this.houjianqu = houjianqu;
    }

    public String getHoujianquName() {
        return "houjianqu";
    }

    public Long getHjq_accumulationUsage() {
        return hjq_accumulationUsage;
    }

    public void setHjq_accumulationUsage(Long hjq_accumulationUsage) {
        this.hjq_accumulationUsage = hjq_accumulationUsage;
    }

    public String getHjq_accumulationUsageName() {
        return "hjq_accumulationUsage";
    }

    public String getHjq_recencyUsage() {
        return hjq_recencyUsage;
    }

    public void setHjq_recencyUsage(String hjq_recencyUsage) {
        this.hjq_recencyUsage = hjq_recencyUsage;
    }

    public String getHjq_recencyUsageName() {
        return "hjq_recencyUsage";
    }

    public String getHjq_notRecencyUsage() {
        return hjq_notRecencyUsage;
    }

    public void setHjq_notRecencyUsage(String hjq_notRecencyUsage) {
        this.hjq_notRecencyUsage = hjq_notRecencyUsage;
    }

    public String getHjq_notRecencyUsageName() {
        return "hjq_notRecencyUsage";
    }

    public Long getHjq_serviceCount() {
        return hjq_serviceCount;
    }

    public void setHjq_serviceCount(Long hjq_serviceCount) {
        this.hjq_serviceCount = hjq_serviceCount;
    }

    public String getHjq_serviceCountName() {
        return "hjq_serviceCount";
    }

    public Long getHuiyuanqu() {
        return huiyuanqu;
    }

    public void setHuiyuanqu(Long huiyuanqu) {
        this.huiyuanqu = huiyuanqu;
    }

    public String getHuiyuanquName() {
        return "huiyuanqu";
    }

    public Long getHyq_accumulationUsage() {
        return hyq_accumulationUsage;
    }

    public void setHyq_accumulationUsage(Long hyq_accumulationUsage) {
        this.hyq_accumulationUsage = hyq_accumulationUsage;
    }

    public String getHyq_accumulationUsageName() {
        return "hyq_accumulationUsage";
    }

    public String getHyq_recencyUsage() {
        return hyq_recencyUsage;
    }

    public void setHyq_recencyUsage(String hyq_recencyUsage) {
        this.hyq_recencyUsage = hyq_recencyUsage;
    }

    public String getHyq_recencyUsagName() {
        return "hyq_recencyUsage";
    }

    public String getHyq_notRecencyUsage() {
        return hyq_notRecencyUsage;
    }

    public void setHyq_notRecencyUsage(String hyq_notRecencyUsage) {
        this.hyq_notRecencyUsage = hyq_notRecencyUsage;
    }

    public String getHyq_notRecencyUsageName() {
        return "hyq_notRecencyUsage";
    }


    public Long getHyq_serviceCount() {
        return hyq_serviceCount;
    }

    public void setHyq_serviceCount(Long hyq_serviceCount) {
        this.hyq_serviceCount = hyq_serviceCount;
    }

    public String getHyq_serviceCountName() {
        return "hyq_serviceCount";
    }

    public Long getBieyuanting() {
        return bieyuanting;
    }

    public void setBieyuanting(Long bieyuanting) {
        this.bieyuanting = bieyuanting;
    }

    public String getBieyuantingName() {
        return "bieyuanting";
    }

    public Long getByt_accumulationUsage() {
        return byt_accumulationUsage;
    }

    public void setByt_accumulationUsage(Long byt_accumulationUsage) {
        this.byt_accumulationUsage = byt_accumulationUsage;
    }

    public String getByt_accumulationUsageName() {
        return "byt_accumulationUsage";
    }

    public String getByt_recencyUsage() {
        return byt_recencyUsage;
    }

    public void setByt_recencyUsage(String byt_recencyUsage) {
        this.byt_recencyUsage = byt_recencyUsage;
    }

    public String getByt_recencyUsageName() {
        return "byt_recencyUsage";
    }

    public String getByt_notRecencyUsage() {
        return byt_notRecencyUsage;
    }

    public void setByt_notRecencyUsage(String byt_notRecencyUsage) {
        this.byt_notRecencyUsage = byt_notRecencyUsage;
    }

    public String getByt_notRecencyUsageName() {
        return "byt_notRecencyUsage";
    }

    public Long getByt_serviceCount() {
        return byt_serviceCount;
    }

    public void setByt_serviceCount(Long byt_serviceCount) {
        this.byt_serviceCount = byt_serviceCount;
    }

    public String getByt_serviceCountName() {
        return "byt_serviceCount";
    }

    public Long getLiuhaoting() {
        return liuhaoting;
    }

    public void setLiuhaoting(Long liuhaoting) {
        this.liuhaoting = liuhaoting;
    }

    public String getLiuhaotingName() {
        return "liuhaoting";
    }

    public Long getLht_accumulationUsage() {
        return lht_accumulationUsage;
    }

    public void setLht_accumulationUsage(Long lht_accumulationUsage) {
        this.lht_accumulationUsage = lht_accumulationUsage;
    }

    public String getLht_accumulationUsageName() {
        return "lht_accumulationUsage";
    }

    public String getLht_recencyUsage() {
        return lht_recencyUsage;
    }

    public void setLht_recencyUsage(String lht_recencyUsage) {
        this.lht_recencyUsage = lht_recencyUsage;
    }

    public String getLht_recencyUsageName() {
        return "lht_recencyUsage";
    }

    public String getLht_notRecencyUsage() {
        return lht_notRecencyUsage;
    }

    public void setLht_notRecencyUsage(String lht_notRecencyUsage) {
        this.lht_notRecencyUsage = lht_notRecencyUsage;
    }

    public String getLht_notRecencyUsageName() {
        return "lht_notRecencyUsage";
    }

    public Long getLht_serviceCount() {
        return lht_serviceCount;
    }

    public void setLht_serviceCount(Long lht_serviceCount) {
        this.lht_serviceCount = lht_serviceCount;
    }

    public String getLht_serviceCountName() {
        return "lht_serviceCount";
    }

    public Long getZhaohangting() {
        return zhaohangting;
    }

    public void setZhaohangting(Long zhaohangting) {
        this.zhaohangting = zhaohangting;
    }

    public String getZhaohangtingName() {
        return "zhaohangting";
    }

    public Long getZht_accumulationUsage() {
        return zht_accumulationUsage;
    }

    public void setZht_accumulationUsage(Long zht_accumulationUsage) {
        this.zht_accumulationUsage = zht_accumulationUsage;
    }

    public String getZht_accumulationUsageName() {
        return "zht_accumulationUsage";
    }

    public String getZht_recencyUsage() {
        return zht_recencyUsage;
    }

    public void setZht_recencyUsage(String zht_recencyUsage) {
        this.zht_recencyUsage = zht_recencyUsage;
    }

    public String getZht_recencyUsageName() {
        return "zht_recencyUsage";
    }

    public String getZht_notRecencyUsage() {
        return zht_notRecencyUsage;
    }

    public void setZht_notRecencyUsage(String zht_notRecencyUsage) {
        this.zht_notRecencyUsage = zht_notRecencyUsage;
    }

    public String getZht_notRecencyUsageName() {
        return "zht_notRecencyUsage";
    }

    public Long getZht_serviceCount() {
        return zht_serviceCount;
    }

    public void setZht_serviceCount(Long zht_serviceCount) {
        this.zht_serviceCount = zht_serviceCount;
    }

    public String getZht_serviceCountName() {
        return "zht_serviceCount";
    }

    public Long getNonghangting() {
        return nonghangting;
    }

    public void setNonghangting(Long nonghangting) {
        this.nonghangting = nonghangting;
    }

    public String getNonghangtingName() {
        return "nonghangting";
    }

    public Long getNht_accumulationUsage() {
        return nht_accumulationUsage;
    }

    public void setNht_accumulationUsage(Long nht_accumulationUsage) {
        this.nht_accumulationUsage = nht_accumulationUsage;
    }

    public String getNht_accumulationUsageName() {
        return "nht_accumulationUsage";
    }

    public String getNht_recencyUsage() {
        return nht_recencyUsage;
    }

    public void setNht_recencyUsage(String nht_recencyUsage) {
        this.nht_recencyUsage = nht_recencyUsage;
    }

    public String getNht_recencyUsageName() {
        return "nht_recencyUsage";
    }

    public String getNht_notRecencyUsage() {
        return nht_notRecencyUsage;
    }

    public void setNht_notRecencyUsage(String nht_notRecencyUsage) {
        this.nht_notRecencyUsage = nht_notRecencyUsage;
    }

    public String getNht_notRecencyUsageName() {
        return "nht_notRecencyUsage";
    }

    public Long getNht_serviceCount() {
        return nht_serviceCount;
    }

    public void setNht_serviceCount(Long nht_serviceCount) {
        this.nht_serviceCount = nht_serviceCount;
    }

    public String getNht_serviceCountName() {
        return "nht_serviceCount";
    }

    public Long getGonghangting() {
        return gonghangting;
    }

    public void setGonghangting(Long gonghangting) {
        this.gonghangting = gonghangting;
    }

    public String getGonghangtingName() {
        return "gonghangting";
    }

    public Long getGht_accumulationUsage() {
        return ght_accumulationUsage;
    }

    public void setGht_accumulationUsage(Long ght_accumulationUsage) {
        this.ght_accumulationUsage = ght_accumulationUsage;
    }

    public String getGht_accumulationUsageName() {
        return "ght_accumulationUsage";
    }

    public String getGht_recencyUsage() {
        return ght_recencyUsage;
    }

    public void setGht_recencyUsage(String ght_recencyUsage) {
        this.ght_recencyUsage = ght_recencyUsage;
    }

    public String getGht_recencyUsageName() {
        return "ght_recencyUsage";
    }

    public String getGht_notRecencyUsage() {
        return ght_notRecencyUsage;
    }

    public void setGht_notRecencyUsage(String ght_notRecencyUsage) {
        this.ght_notRecencyUsage = ght_notRecencyUsage;
    }

    public String getGht_notRecencyUsageName() {
        return "ght_notRecencyUsage";
    }

    public Long getGht_serviceCount() {
        return ght_serviceCount;
    }

    public void setGht_serviceCount(Long ght_serviceCount) {
        this.ght_serviceCount = ght_serviceCount;
    }

    public String getGht_serviceCountName() {
        return "ght_serviceCount";
    }

    public Long getZhengyaoting() {
        return zhengyaoting;
    }

    public void setZhengyaoting(Long zhengyaoting) {
        this.zhengyaoting = zhengyaoting;
    }

    public String getZhengyaotingName() {
        return "zhengyaoting";
    }

    public Long getZyt_accumulationUsage() {
        return zyt_accumulationUsage;
    }

    public void setZyt_accumulationUsage(Long zyt_accumulationUsage) {
        this.zyt_accumulationUsage = zyt_accumulationUsage;
    }

    public String getZyt_accumulationUsageName() {
        return "zyt_accumulationUsage";
    }

    public String getZyt_recencyUsage() {
        return zyt_recencyUsage;
    }

    public void setZyt_recencyUsage(String zyt_recencyUsage) {
        this.zyt_recencyUsage = zyt_recencyUsage;
    }

    public String getZyt_recencyUsageName() {
        return "zyt_recencyUsage";
    }

    public String getZyt_notRecencyUsage() {
        return zyt_notRecencyUsage;
    }

    public void setZyt_notRecencyUsage(String zyt_notRecencyUsage) {
        this.zyt_notRecencyUsage = zyt_notRecencyUsage;
    }

    public String getZyt_notRecencyUsageName() {
        return "zyt_notRecencyUsage";
    }

    public Long getZyt_serviceCount() {
        return zyt_serviceCount;
    }

    public void setZyt_serviceCount(Long zyt_serviceCount) {
        this.zyt_serviceCount = zyt_serviceCount;
    }

    public String getZyt_serviceCountName() {
        return "zyt_serviceCount";
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvinceName() {
        return "province";
    }

    public Long getAccumulationUsageTotal() {
        return accumulationUsageTotal;
    }

    public void setAccumulationUsageTotal(Long accumulationUsageTotal) {
        this.accumulationUsageTotal = accumulationUsageTotal;
    }

    public String getAccumulationUsageTotalName() {
        return "accumulationUsageTotal";
    }
}

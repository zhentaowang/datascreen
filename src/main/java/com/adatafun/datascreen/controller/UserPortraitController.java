package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.service.DimGenerationService;
import com.adatafun.datascreen.service.UserPortraitService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UserPortraitController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/29.
 */
@Component
public class UserPortraitController {

    private final UserPortraitService userPortraitService;
    private final DimGenerationService dimGenerationService;

    @Autowired
    public UserPortraitController(UserPortraitService userPortraitService, DimGenerationService dimGenerationService) {
        this.userPortraitService = userPortraitService;
        this.dimGenerationService = dimGenerationService;
    }

    public String getUserPortraitResult(final JSONObject request) {

        try {
            JSONArray data = JSONArray.parseArray(request.get("data").toString());
            String portraitType = request.get("portrait_type").toString();
            JSONObject jsonObject = JSONObject.parseObject(data.get(0).toString());
//            List<Long> level = dimGenerationService.getGenerationList(age);

            Map<String, Object> param = new HashMap<>();
            param.put("indexName", "lj-user");
            param.put("typeName", "lj-user");
            param.put("userPortrait", portraitType);
            List<String> aggsList = Arrays.asList("institutionType", "sex", "cityRegion", "accumulationUsageTotal", "province", "age", "userPortrait");
            param.put("aggsList", aggsList);
            return userPortraitService.getUserPortraitResult(param, jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }
}

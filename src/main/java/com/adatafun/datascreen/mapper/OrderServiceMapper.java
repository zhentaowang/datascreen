package com.adatafun.datascreen.mapper;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;
import java.util.Map;

/**
 * OrderInfoMapper.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
public interface OrderServiceMapper {
    List<Map<String, Object>> getServiceDetail(Map<String, Object> map);
}
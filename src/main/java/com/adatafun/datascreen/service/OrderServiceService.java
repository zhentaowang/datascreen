package com.adatafun.datascreen.service;

import com.adatafun.datascreen.mapper.OrderInfoMapper;
import com.adatafun.datascreen.mapper.OrderServiceMapper;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * OrderInfoService.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Service
public class OrderServiceService {
    private final OrderServiceMapper orderServiceMapper;

    @Autowired
    public OrderServiceService(OrderServiceMapper orderServiceMapper) {
        this.orderServiceMapper = orderServiceMapper;
    }

    public List<Map<String, Object>> getServiceDetail(Map<String, Object> param) {
        return orderServiceMapper.getServiceDetail(param);
    }
}

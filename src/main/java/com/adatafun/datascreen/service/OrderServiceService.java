package com.adatafun.datascreen.service;

import com.adatafun.datascreen.mapper.OrderServiceMapper;
import com.adatafun.datascreen.utils.ElasticSearch;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
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

    public List<Map<String, Object>> getServiceDetail() {
        return orderServiceMapper.getServiceDetail();
    }
}

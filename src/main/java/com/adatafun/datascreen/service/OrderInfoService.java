package com.adatafun.datascreen.service;

import com.adatafun.datascreen.mapper.OrderInfoMapper;
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
public class OrderInfoService {
    private final OrderInfoMapper orderInfoMapper;

    @Autowired
    public OrderInfoService(OrderInfoMapper orderInfoMapper) {
        this.orderInfoMapper = orderInfoMapper;
    }

    public List<Map<String, Object>> getGuestArrByDate(Map<String, Object> param) {
        return orderInfoMapper.getGuestArrByDate(param);

    }

    public List<Map<String, Object>> getGuestDepByDate(Map<String, Object> param) {
        return orderInfoMapper.getGuestDepByDate(param);

    }

    public List<Map<String, Object>> getGuestByDate(Map<String, Object> param) {
        return orderInfoMapper.getGuestByDate(param);

    }

    public List<Map<String, Object>> getSourceChanByDate(Map<String, Object> param) {
        return orderInfoMapper.getSourceChanByDate(param);
    }
}

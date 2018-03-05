package com.adatafun.datascreen.mapper;

import com.adatafun.datascreen.model.OrderInfo;

import java.util.List;
import java.util.Map;

/**
 * OrderInfoMapper.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
public interface OrderInfoMapper {
    List<Map<String, Object>> getGuestArrByDate();
    List<Map<String, Object>> getGuestDepByDate();
    List<Map<String, Object>> getGuestByDate();
    List<Map<String, Object>> getSourceChanByDate();
}

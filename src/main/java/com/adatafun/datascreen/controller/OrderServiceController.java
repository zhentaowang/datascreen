package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.service.OrderServiceService;
import com.adatafun.datascreen.utils.DataProcessing;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OrderServiceController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Component
public class OrderServiceController {

    private final OrderServiceService orderServiceService;

    @Autowired
    public OrderServiceController(OrderServiceService orderServiceService) {
        this.orderServiceService = orderServiceService;
    }

    /**
     * 休息室/贵宾厅 - 根据 时间 查询
     * @param request  起始日期
     * @return 该时间段内 休息室/贵宾厅 使用人数
     */
    public String getServiceDetail(JSONObject request) {
        try {
            Map<String, Object> param = new HashMap<>();
            param.put("startDate", request.getString("startDate"));
            param.put("endDate", request.getString("endDate"));
            List<Map<String, Object>> serviceDetailList = orderServiceService.getServiceDetail(param);

//            读取到数据库的 json 乱码，强制转成 utf-8
            DataProcessing dataProcessing = new DataProcessing();
            List<Map<String, Object>> productList = dataProcessing.serviceDetailCal(serviceDetailList);
            return JSON.toJSONString(new LZResult<>(productList));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }
}
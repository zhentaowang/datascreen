package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.service.OrderInfoService;
import com.adatafun.datascreen.service.OrderServiceService;
import com.adatafun.datascreen.utils.DataProcessing;
import com.adatafun.datascreen.utils.ParameterDetection;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OrderInfoController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Component
public class OrderServiceController {

    private final OrderServiceService orderServiceService;
    private final static Logger logger = LoggerFactory.getLogger(OrderServiceController.class);

    @Autowired
    public OrderServiceController(OrderServiceService orderServiceService) {
        this.orderServiceService = orderServiceService;
    }

    /**
     * 来源渠道 - 根据 时间 查询
     * @param request  起始日期
     * @return 该时间段内 来源渠道
     */
    public String getServiceDetail(JSONObject request) {
        try {
            if (request.containsKey("startDate")
                    && request.containsKey("endDate")) {

//                验证日期合法性
                Map<String, Object> detectionResult = new HashMap<>();
                ParameterDetection parameterDetection = new ParameterDetection(request, detectionResult);
                detectionResult = parameterDetection.verifyDateValidity();
                if (!detectionResult.get("msg").equals(LZStatus.SUCCESS.display())) {
                    logger.error("日期不合法");
                    return JSON.toJSONString(LXResult.build(LZStatus.DATA_TRANSFER_ERROR.value(), LZStatus.DATA_TRANSFER_ERROR.display()));
                }

                Map<String, Object> param = new HashMap<>();
                param.put("startDate", request.getString("startDate"));
                param.put("endDate", request.getString("endDate"));
                List<Map<String, Object>> serviceDetailList = orderServiceService.getServiceDetail(param);

                System.out.println("test");
                DataProcessing dataProcessing = new DataProcessing();
                List<Map<String, Object>> productList = dataProcessing.serviceDetailCal(serviceDetailList);
                return JSON.toJSONString(new LZResult<>(productList));
            } else {
                logger.error("字段缺失");
                return JSON.toJSONString(LXResult.build(LZStatus.DATA_TRANSFER_ERROR.value(), LZStatus.DATA_TRANSFER_ERROR.display()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("throws Exception ", e);
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }
}
package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.utils.ParameterDetection;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import com.zhiweicloud.guest.APIUtil.LZResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.adatafun.datascreen.model.OrderInfo;
import com.adatafun.datascreen.service.OrderInfoService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * OrderInfoController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Component
public class OrderInfoController {

    private final OrderInfoService orderInfoService;
    private final static Logger logger = LoggerFactory.getLogger(OrderInfoController.class);

    @Autowired
    public OrderInfoController(OrderInfoService orderInfoService) {
        this.orderInfoService = orderInfoService;
    }
//
    /**
     * 目的地旅客分布 - 根据 时间段 查询
     * @param request  起始日期
     * @return 该时间段内 目的地旅客分布
     */
    public String getGuestDistribution(String operation, JSONObject request) {
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

                List<Map<String, Object>> sourceList = new ArrayList<>();
                switch (operation) {
                    case "queryGuestArr":
                        sourceList = orderInfoService.getGuestArrByDate(param);
                        break;
                    case "queryGuestDep":
                        sourceList = orderInfoService.getGuestDepByDate(param);
                        break;
                    case "queryGuest":
                    case "queryRestaurant":
                        sourceList = orderInfoService.getGuestByDate(param);
                        break;
                    default:
                        break;
                }
                return JSON.toJSONString(new LZResult<>(sourceList));
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

    /**
     * 来源渠道 - 根据 时间 查询
     * @param request  起始日期
     * @return 该时间段内 来源渠道
     */
    public String getSourceChannel(JSONObject request) {
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
                List<Map<String, Object>> sourceList = orderInfoService.getSourceChanByDate(param);
                return JSON.toJSONString(new LZResult<>(sourceList));
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
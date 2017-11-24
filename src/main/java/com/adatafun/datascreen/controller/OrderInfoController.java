package com.adatafun.datascreen.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import com.zhiweicloud.guest.APIUtil.LZResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.adatafun.datascreen.service.OrderInfoService;
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
public class OrderInfoController {

    private final OrderInfoService orderInfoService;

    @Autowired
    public OrderInfoController(OrderInfoService orderInfoService) {
        this.orderInfoService = orderInfoService;
    }
//
    /**
     * 旅客分布 - 根据 时间段 查询
     * @param request  起始日期
     * @return 该时间段内 旅客分布
     */
    public String getGuestDistribution(String operation, JSONObject request) {
        try {
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
                        sourceList = orderInfoService.getGuestByDate(param);
                        break;
                    default:
                        break;
                }
                return JSON.toJSONString(new LZResult<>(sourceList));
        } catch (Exception e) {
            e.printStackTrace();
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
            Map<String, Object> param = new HashMap<>();
            param.put("startDate", request.getString("startDate"));
            param.put("endDate", request.getString("endDate"));
            List<Map<String, Object>> sourceList = orderInfoService.getSourceChanByDate(param);
            return JSON.toJSONString(new LZResult<>(sourceList));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }
}
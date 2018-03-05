package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.service.ElasticSearchService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import com.zhiweicloud.guest.APIUtil.LZResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.adatafun.datascreen.service.OrderInfoService;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.*;

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
     * @return 旅客分布
     */
    public String getGuestDistribution(JSONObject request) {
        try {
                List<Map<String, Object>> sourceList = new ArrayList<>();
                switch (request.getString("type")) {
                    case "arr":
                        sourceList = orderInfoService.getGuestArrByDate();
                        break;
                    case "dep":
                        sourceList = orderInfoService.getGuestDepByDate();
                        break;
                    case "guest":
                        sourceList = orderInfoService.getGuestByDate();
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
     * @return 该时间段内 来源渠道
     */
    public String getSourceChannel() {
        try {
            List<Map<String, Object>> sourceList = orderInfoService.getSourceChanByDate();
            List<Map<String, Object>> result = getReslutList(sourceList);
            return JSON.toJSONString(new LZResult<>(result));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }

    public List<Map<String, Object>> getReslutList(List<Map<String, Object>> sourceList) {
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map map : sourceList) {
            Map<String, Object> param = new HashMap<>();
            param.put("customer_name", map.get("customer_name"));
            param.put("monthNums", map.get("monthNums"));
            param.put("dayNums", map.get("dayNums"));
            param.put("type", ((map.get("type").equals("航空公司"))?"航司":"协议单位"));
            result.add(param);
        }
        return result;
    }


}
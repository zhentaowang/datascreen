package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.service.ElasticSearchService;
import com.adatafun.datascreen.service.OrderServiceService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * OrderServiceController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Component
public class OrderServiceController {

    private final OrderServiceService orderServiceService;
    private final ElasticSearchService elasticSearchService;

    @Autowired
    public OrderServiceController(OrderServiceService orderServiceService,
                                  ElasticSearchService elasticSearchService) {
        this.orderServiceService = orderServiceService;
        this.elasticSearchService = elasticSearchService;
    }

    /**
     * 休息室/贵宾厅 - 根据 时间 查询
     * @return 该时间段内 休息室/贵宾厅 使用人数
     */
    public String getServiceDetail() {
        try {
            List<Map<String, Object>> serviceDetailList = orderServiceService.getServiceDetail();
            List<Map<String, Object>> result = getResult(serviceDetailList);
            return JSON.toJSONString(new LZResult<>(result));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }

    public List<Map<String, Object>> getResult(List<Map<String, Object>> serviceDetailList) {
        List<Map<String, Object>> result = new ArrayList<>();
        for (Map map : serviceDetailList) {
            Map<String, Object> param = new HashMap<>();
            param.put("serviceDetailName", map.get("serviceDetailName"));
            param.put("serverNum", map.get("serverNum"));
            Double isUp = Double.parseDouble(map.get("serverNum").toString()) - Double.parseDouble(map.get("yserverNum").toString());
            param.put("isUp", ((isUp>=0)?1:0));
            result.add(param);
        }
        return result;
    }

    /**
     * @return  服务人数
     */
    public String getUserCount(JSONObject request) {
        Map<String, Object> param = new HashMap<>();
        param.put("indexName", "lj-user");
        param.put("typeName", "lj-user");
        param.put("aggName", "SumAgg");

        switch (request.getString("type")) {
            case "userTotal":  //用户总数
                return elasticSearchService.getOrderTotalCount(param);
            case "lounge":  //两舱服务使用次数
                param.put("labelName", "loungeAccumulationUsageTotal");
                break;
            case "concierge":  //要客服务使用次数
                param.put("labelName", "conciergeAccumulationUsageTotal");
                break;
            default:
                break;
        }
        return elasticSearchService.getCategoryCount(param);
    }
}
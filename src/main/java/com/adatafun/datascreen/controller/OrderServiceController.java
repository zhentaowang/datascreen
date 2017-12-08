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
    private final ElasticSearchService elasticSearchService;

    @Autowired
    public OrderServiceController(OrderServiceService orderServiceService,
                                  ElasticSearchService elasticSearchService) {
        this.orderServiceService = orderServiceService;
        this.elasticSearchService = elasticSearchService;
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
            return JSON.toJSONString(new LZResult<>(serviceDetailList));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }

    /**
     * 两舱/要客服务使用次数 数据库中读取
     * @param request
     * @return  两舱/要客服务使用次数
     */
    public String getCategory(JSONObject request) {
        try {
            List<Map<String, Object>> serviceDetailList = orderServiceService.getCategory();
            return JSON.toJSONString(new LZResult<>(serviceDetailList));
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }

    /**
     * 两舱服务使用次数 从ES中取
     * @param request
     * @return  两舱服务使用次数
     */
   public String getLoungeCount(JSONObject request) {
        Map<String, Object> param = new HashMap<>();
        param.put("indexName", "lj-user");
        param.put("typeName", "lj-user");
        param.put("labelName", "accumulationUsageTotal");
        param.put("aggName", "LoungeSumAgg");
        return elasticSearchService.getCategoryCount(param);
   }

   /**
    * 要客服务使用次数 从ES中取
    * @param request
    * @return  要客服务使用次数
    */
    public String getConciergeCount(JSONObject request) {
        Map<String, Object> param = new HashMap<>();
        param.put("indexName", "lj-user");
        param.put("typeName", "lj-user");
        param.put("labelName", "accumulationUsageTotal");
        param.put("aggName", "ConciergeSumAgg");
        return elasticSearchService.getCategoryCount(param);
    }
}
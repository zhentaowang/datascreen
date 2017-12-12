package com.adatafun.datascreen.service;

import com.adatafun.datascreen.utils.ElasticSearch;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by m2shad0w on 17/12/7.
 */
@Service
public class ElasticSearchService {
    private static ElasticSearch elasticSearch = new ElasticSearch();

    public String getCategoryCount(Map<String, Object> param) {
        try {
            JSONObject jsonObjectAgg = createSumAgg(param.get("labelName").toString(), param.get("aggName").toString());

            elasticSearch.setUp();
            LZResult<Double> result = new LZResult<>(elasticSearch.getCount(param, jsonObjectAgg));
            elasticSearch.tearDown();
            return JSON.toJSONString(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }

    public String getOrderTotalCount(Map<String, Object> param) {
        try {
            elasticSearch.setUp();
            LZResult<Double> result = new LZResult<>(elasticSearch.getOrderCount(param));
            elasticSearch.tearDown();
            return JSON.toJSONString(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }

    public JSONObject createSumAgg(String labelName, String aggName) throws Exception {
        JSONObject sum = new JSONObject();
        JSONObject sum_json = new JSONObject();
        JSONObject agg_json = new JSONObject();
        sum_json.put("field", labelName);
        sum.put("sum", sum_json);
        agg_json.put(aggName, sum);
        return agg_json;
    }
}

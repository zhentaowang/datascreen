package com.adatafun.datascreen.utils;

import java.util.*;

/**
 * DataProcessing.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/23.
 */
public class DataProcessing {

    public List<Map<String, Object>> serviceDetailCal(List<Map<String, Object>> serviceDetailList) throws Exception {
        List<Map<String, Object>> productList = new ArrayList<>();

        for (Map<String, Object> serMap: serviceDetailList) {
            String name = serMap.get("serviceDetailName").toString();
            String key = new String(name.getBytes("ISO-8859-1"),"utf-8");

            Map<String, Object> map = new HashMap<>();
            map.put("serviceDetailName", key);
            map.put("serverNum", serMap.get("serverNum"));
            productList.add(map);
        }
        return productList;
    }

}

package com.adatafun.datascreen.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.io.ObjectInputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * ParameterDetection.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/23.
 */
public class DataProcessing {

    public List<Map<String, Object>> serviceDetailCal(List<Map<String, Object>> serviceDetailList) throws Exception {
        Map<String, Integer> serDetMap = new HashMap<>();

        for (Map<String, Object> list: serviceDetailList) {
            ObjectMapper objectMapper = new ObjectMapper();
            String str = list.get("service_detail").toString();
            ServiceDetail serviceDetail = objectMapper.readValue(str, ServiceDetail.class);
            int serNum = serviceDetail.getServerNum();
            String serName = serviceDetail.getServiceDetailName();
            System.out.println("serName:" + serName);

            Map<String, Object> map = new HashMap<>();
            if (!serName.equals("")) {
                if (!serDetMap.containsKey(serName)) {
                    serDetMap.put(serName, serNum);
                } else {
                    serDetMap.put(serName, serDetMap.get(serName) + serNum);
                }
            }
        }
        List<Map<String, Object>> productList = getRetList(serDetMap);
        return productList;
    }

    public List<Map<String, Object>> getRetList(Map<String, Integer> serDetMap) {
        List<Map<String, Object>> productList = new ArrayList<>();

        Set<String> set = serDetMap.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            int value = serDetMap.get(key);

            Map<String, Object> map = new HashMap<>();
            map.put("serviceDetailName", key);
            map.put("serverNum", value);
            productList.add(map);
        }
        return productList;
    }
}

class ServiceDetail {
    private int servId;
    private int serverNum;
    private int serviceId;
    private String serviceName;
    private long serviceDetailId;
    private String serviceDetailName;

    public  ServiceDetail() {};

    public void setServId(int servId) {
        this.servId = servId;
    }

    public int getServId() {
        return servId;
    }

    public void setServerNum(int serverNum) {
        this.serverNum = serverNum;
    }

    public int getServerNum() {
        return serverNum;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceDetailId(long serviceDetailId) {
        this.serviceDetailId = serviceDetailId;
    }

    public long getServiceDetailId() {
        return serviceDetailId;
    }

    public void setServiceDetailName(String serviceDetailName) {
        this.serviceDetailName = serviceDetailName;
    }

    public String getServiceDetailName() {
        return serviceDetailName;
    }
}
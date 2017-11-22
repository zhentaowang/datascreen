package com.adatafun.datascreen.utils;

import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LZStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * ParameterDetection.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
public class ParameterDetection {
    private JSONObject param;
    private Map<String, Object> result;
    private int status;

    public ParameterDetection(JSONObject param, Map<String, Object> result) {
        this.param = param;
        this.result = result;
    }

    public Map<String, Object> verifyDateValidity() throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            format.setLenient(false);
            format.parse(param.getString("startDate"));
            format.parse(param.getString("endDate"));
            result.put("status", LZStatus.SUCCESS.value());
            result.put("msg", LZStatus.SUCCESS.display());
        } catch (ParseException e) {
            result.put("status", LZStatus.DATA_TRANSFER_ERROR.value());
            result.put("msg", LZStatus.DATA_TRANSFER_ERROR.display());
        }
        return result;
    }
}

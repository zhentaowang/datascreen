package com.adatafun.datascreen.service;

import com.adatafun.datascreen.mapper.DimGenerationMapper;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DimGenerationService.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/29.
 */
@Service
public class DimGenerationService {
    private final DimGenerationMapper dimGenerationMapper;

    @Autowired
    public DimGenerationService(DimGenerationMapper dimGenerationMapper) {
        this.dimGenerationMapper = dimGenerationMapper;
    }

    public List<Long> getGenerationList(JSONArray age) throws Exception {
        StringBuffer ids = new StringBuffer();
        for (Object id : age) {
            ids.append(id).append(",");
        }
        Map<String, Object> param = new HashMap<>();
        param.put("ids", ids.substring(0, ids.length()-1));
        List<Long> result = dimGenerationMapper.getGenerationList(param);
        return result;
    }
}

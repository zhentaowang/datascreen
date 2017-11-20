package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.model.Permission;
import com.adatafun.datascreen.service.PermissionService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * PermissionController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/20.
 */
@Component
public class PermissionController {

    private final PermissionService permissionService;

    @Autowired
    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    /**
     * 权限详情 - 根据permissionId查询
     * @param request 权限id
     * @return 权限详情
     */
    public String view(JSONObject request) {

        try {
            Map<String, Object> param = new HashMap<>();
            param.put("airportCode", request.getString("airportCode"));
            param.put("permissionId", request.getLong("permissionId"));
            LZResult<Permission> result = new LZResult<>(permissionService.selectById(param));
            return JSON.toJSONString(result);
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }

    }

}

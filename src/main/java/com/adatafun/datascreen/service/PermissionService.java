package com.adatafun.datascreen.service;

import com.adatafun.datascreen.mapper.PermissionMapper;
import com.adatafun.datascreen.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * PermissionService.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/20.
 */
@Service
public class PermissionService {
    private final PermissionMapper permissionMapper;

    @Autowired
    public PermissionService(PermissionMapper permissionMapper) {
        this.permissionMapper = permissionMapper;
    }

    public Permission selectById(Map<String, Object> param) {

        return permissionMapper.selectById(param);

    }
}

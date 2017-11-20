package com.adatafun.datascreen.mapper;

import com.adatafun.datascreen.model.Permission;
import java.util.Map;

/**
 * PermissionMapper.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/10/23.
 */
public interface PermissionMapper {
    Permission selectById(Map<String, Object> map);
}

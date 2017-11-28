package com.adatafun.datascreen.mapper;

import com.adatafun.datascreen.model.Login;
import java.util.Map;

/**
 * OrderInfoMapper.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/28.
 */
public interface LoginMapper {
    Login getLogin(Map<String, Object> map);
}

package com.adatafun.datascreen.service;

import com.adatafun.datascreen.mapper.LoginMapper;
import com.adatafun.datascreen.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;

/**
 * OrderInfoService.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Service
public class LoginService {
    private final LoginMapper loginMapper;

    @Autowired
    public LoginService(LoginMapper loginMapper) {
        this.loginMapper = loginMapper;
    }

    public Login getLogin(Map<String, Object> param) {
        return loginMapper.getLogin(param);
    }
}

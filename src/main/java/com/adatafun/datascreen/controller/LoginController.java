package com.adatafun.datascreen.controller;

import com.adatafun.datascreen.model.Login;
import com.adatafun.datascreen.service.LoginService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhiweicloud.guest.APIUtil.LXResult;
import com.zhiweicloud.guest.APIUtil.LZResult;
import com.zhiweicloud.guest.APIUtil.LZStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * OrderServiceController.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by husai on 2017/11/22.
 */
@Component
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    /**
     * 用户登录 - 根据  用户名 查询
     * @param request  用户名密码
     * @return 登录结果
     */
    public String getLoginDetail(JSONObject request) {
        try {
            Map<String, Object> param = new HashMap<>();
            param.put("username", request.getString("username"));
            param.put("userpwd", request.getString("userpwd"));
            Login serviceDetailList = loginService.getLogin(param);
            if (serviceDetailList.getUserpwd().equals(request.getString("userpwd"))
                    && request.getString("userpwd") != null) {
                return JSON.toJSONString(LXResult.build(LZStatus.SUCCESS.value(), LZStatus.SUCCESS.display()));
            } else {
                return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return JSON.toJSONString(LXResult.build(LZStatus.ERROR.value(), LZStatus.ERROR.display()));
        }
    }
}
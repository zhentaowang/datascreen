/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 abel533@gmail.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.adatafun.datascreen.thrift;

import com.adatafun.datascreen.controller.PermissionController;
import com.adatafun.datascreen.controller.OrderInfoController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wyun.thrift.server.business.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * BusinessService.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 05/05/2017.
 */
@Component
public class BusinessService implements IBusinessService {

    private final PermissionController permissionController;
//    旅客分布 重要客户来源渠道
    private final OrderInfoController orderInfoController;

    @Autowired
    public BusinessService(PermissionController permissionController,
                           OrderInfoController orderInfoController) {
        this.permissionController = permissionController;
        this.orderInfoController = orderInfoController;
    }

    @Override
    public JSONObject handle(String operation,JSONObject request) {
        String success = null;

        switch (operation) {
            case "view":
                success = permissionController.view(request);
                break;
            case "queryGuestArr":
            case "queryGuestDep":
            case "queryGuest":
                success = orderInfoController.getGuestDistribution(operation, request);
                System.out.println("queryGuestArr");
                break;
            case "queryRestaurant":
                success = orderInfoController.getGuestDistribution(operation, request);
                System.out.println("queryRestaurant");
                break;
            case "querySourceChannel":
                success = orderInfoController.getSourceChannel(request);
                System.out.println("querySourceChannel");
                break;
            default:
                break;
        }
        return JSON.parseObject(success);
    }
}

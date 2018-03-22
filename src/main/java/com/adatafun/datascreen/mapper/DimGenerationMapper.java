package com.adatafun.datascreen.mapper;

import java.util.List;
import java.util.Map;

/**
 * DimGenerationMapper.java
 * Copyright(C) 2017 杭州风数科技有限公司
 * Created by wzt on 2017/11/27.
 */
public interface DimGenerationMapper {

    List<Long> getGenerationList(Map<String, Object> param);

}

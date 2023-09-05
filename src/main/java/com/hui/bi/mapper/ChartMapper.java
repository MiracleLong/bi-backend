package com.hui.bi.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hui.bi.model.entity.Chart;

import java.util.List;
import java.util.Map;

/**
 * @author dargon
 * @Entity com.hui.bi.model.entity.Chart
 */
public interface ChartMapper extends BaseMapper<Chart> {

    List<Map<String, Object>> queryChartData(String querySql);
}





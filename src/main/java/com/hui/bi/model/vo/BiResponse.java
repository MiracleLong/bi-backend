package com.hui.bi.model.vo;

import lombok.Data;

/**
 * Bi 的返回结果
 * @author dargon
 */
@Data
public class BiResponse {

    private String genChart;

    private String genResult;

    private Long chartId;
}

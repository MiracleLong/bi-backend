package com.hui.bi.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author 86176
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}
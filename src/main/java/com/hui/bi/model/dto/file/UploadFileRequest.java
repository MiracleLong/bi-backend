package com.hui.bi.model.dto.file;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dargon
 * @create 2023-07-04
 * 文件上传请求
 */
@Data
public class UploadFileRequest implements Serializable {

    /**
     * 业务
     */
    private String biz;

    private static final long serialVersionUID = 1L;
}

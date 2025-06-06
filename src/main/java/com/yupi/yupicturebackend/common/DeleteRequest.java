package com.yupi.yupicturebackend.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求 包装类实体
 *
 */
@Data
public class DeleteRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}


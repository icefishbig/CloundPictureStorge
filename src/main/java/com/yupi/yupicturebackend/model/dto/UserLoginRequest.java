package com.yupi.yupicturebackend.model.dto;

import lombok.Data;

/**
 * 用户登录实体类
 */
@Data
public class UserLoginRequest {
    //统一的序列化ID
    private static final long serialVersionUID = 3191241716373120793L;
    //用户账号
    private String userAccount;
    //密码
    private String userPassWorld;
}

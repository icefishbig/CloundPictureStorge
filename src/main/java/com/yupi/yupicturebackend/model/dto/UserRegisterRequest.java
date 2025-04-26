package com.yupi.yupicturebackend.model.dto;

import lombok.Data;
import java.io.Serializable;

/**
 * @author: Passion！ 无他,唯手熟尔！一定要敲和实践 菜鸟不要用AI
 * @Date 2025/4/27 05:28
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 3191241716373120793L;

    /**
     * 账号
     */
    private String userAccount;

    /**
     * 密码
     */
    private String userPassword;

    /**
     * 确认密码
     */
    private String checkPassword;
}


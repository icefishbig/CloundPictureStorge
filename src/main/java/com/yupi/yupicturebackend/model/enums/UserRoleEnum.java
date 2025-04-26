package com.yupi.yupicturebackend.model.enums;

import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

/**
 * @author: Passion！ 无他,唯手熟尔！一定要敲和实践 菜鸟不要用AI
 * @Date 2025/4/27 05:22
 * 如果枚举值特别多，可以Redis的 Map结构缓存所有枚举值来加速查找，而不是遍历列表。
 */
@Getter
public enum UserRoleEnum {
    //TODO enum枚举用 逗号 隔开
    USER("用户", "user"),
    ADMIN("管理员", "admin"),
    VIP_USER("会员用户","VIP_User");

    private final String text;

    private final String value;

    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据 value 获取枚举
     *
     * @param value 枚举值的value
     * @return 枚举值
     */
    public static UserRoleEnum getEnumByValue(String value) {
        if (ObjUtil.isEmpty(value)) {
            return null;
        }
        for (UserRoleEnum anEnum : UserRoleEnum.values()) {
            if (anEnum.value.equals(value)) {
                return anEnum;
            }
        }
        return null;
    }
}


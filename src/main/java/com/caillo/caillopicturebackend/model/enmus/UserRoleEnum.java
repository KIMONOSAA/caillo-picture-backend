package com.caillo.caillopicturebackend.model.enmus;


import cn.hutool.core.util.ObjUtil;
import lombok.Getter;

@Getter
public enum UserRoleEnum {
    USER("用户","user"),
    ADMIN("管理员","admin")
    ;
    private final String text;
    private final String value;


    UserRoleEnum(String text, String value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 根据value获取枚举
     * @param value
     * @return
     */
    public static UserRoleEnum getEnumByValue(String value){
        //使用hutool工具类判断当前value是否为空就返回null
        if(ObjUtil.isEmpty(value)){
            return null;
        }
        //遍历枚举
        for (UserRoleEnum userRoleEnum : UserRoleEnum.values()) {
            if (userRoleEnum.getValue().equals(value)){
                return userRoleEnum;
            }
        }
        return null;
    }
}

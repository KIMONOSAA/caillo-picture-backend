package com.caillo.caillopicturebackend.model.dto.user;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 2571089756371339191L;
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

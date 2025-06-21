package com.caillo.caillopicturebackend.exception;


/**
 * 异常处理工具类
 */
public class ThrowUtils {


    /**
     * 直接使用系统的异常
     * @param condition
     * @param runtimeException
     */
    public static void throwIf(boolean condition,RuntimeException runtimeException) {
        if (condition) {
            throw runtimeException;
        }
    }

    /**
     * 自定义异常
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition,ErrorCode errorCode) {
        if (condition) {
            throw new BusinessException(errorCode);
        }
    }

    /**
     * 自定义异常
     * @param condition
     * @param errorCode
     */
    public static void throwIf(boolean condition,ErrorCode errorCode,String message) {
        if (condition) {
            throw new BusinessException(errorCode,message);
        }
    }
}

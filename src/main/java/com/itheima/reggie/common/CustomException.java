package com.itheima.reggie.common;

/**
 * 自定义业务异常
 * @author ZayneChen
 * @date 2022年07月20日 16:21
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }

}

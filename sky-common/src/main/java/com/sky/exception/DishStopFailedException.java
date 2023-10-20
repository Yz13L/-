package com.sky.exception;


/**
 * 菜品停售失败异常
 */
public class DishStopFailedException extends BaseException {

    public DishStopFailedException(){}

    public DishStopFailedException(String msg){
        super(msg);
    }
}

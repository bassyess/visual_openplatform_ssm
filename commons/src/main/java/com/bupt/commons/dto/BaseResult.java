package com.bupt.commons.dto;

import com.bupt.commons.constant.ConstantUtils;

import java.io.Serializable;

/**
 *  自定义返回结果
 */
public class BaseResult implements Serializable{

    private int status;
    private String message;
    private Object data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    private static BaseResult createResult(int status,String message,Object data){
        BaseResult baseResult = new BaseResult();
        baseResult.setStatus(status);
        baseResult.setMessage(message);
        baseResult.setData(data);
        return baseResult;
    }

    public static BaseResult success(){
        return BaseResult.createResult(ConstantUtils.STATUS_SUCCESS,ConstantUtils.SUCCESS_MESSAGE,null);
    }

    public static BaseResult success(String message){
        return BaseResult.createResult(ConstantUtils.STATUS_SUCCESS,message,null);
    }

    public static BaseResult success(String message,Object data){
        return BaseResult.createResult(ConstantUtils.STATUS_SUCCESS,message,data);
    }

    public static BaseResult fail(){
        return BaseResult.createResult(ConstantUtils.STATUS_FAIL,ConstantUtils.FAIL_MESSAGE,null);
    }

    public static BaseResult fail(String message){
        return BaseResult.createResult(ConstantUtils.STATUS_FAIL,message,null);
    }

    public static BaseResult fail(int status,String message){
        return BaseResult.createResult(status,message,null);
    }
}

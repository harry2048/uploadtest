package com.zr.uploadtest.util;

import lombok.Data;
import lombok.extern.java.Log;

@Data
@Log
public class ResultVo<T> {
    private Boolean success;
    private String errorMessage;
    private T data;

    public static<T> ResultVo success(T data) {
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(true);
        resultVo.setData(data);
        return resultVo;
    }

    public static<T> ResultVo success() {
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(true);
        return resultVo;
    }

    public static<T> ResultVo error(String errorMessage) {
        ResultVo resultVo = new ResultVo();
        resultVo.setSuccess(false);
        resultVo.setErrorMessage(errorMessage);
        return resultVo;
    }
}

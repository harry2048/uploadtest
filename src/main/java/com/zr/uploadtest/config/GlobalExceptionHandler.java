package com.zr.uploadtest.config;

import com.google.gson.Gson;
import com.zr.uploadtest.util.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @Auther: gengwei
 * @Date: 2019-07-26 22:53
 * @Description: 统一异常
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultVo defaultErrorHandler(Exception e)throws Exception {
        if (e instanceof MaxUploadSizeExceededException) {
            return ResultVo.error("上传的文件大小不能超过1MB！");
        }
        String message = e.getMessage();
        e.printStackTrace();
        return ResultVo.error("网络开小差了！");
    }

    /*@ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletResponse response,HttpServletRequest request, Exception e)throws Exception {
        response.setContentType("application/json;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        Gson g = new Gson();
        e.printStackTrace();
        if (e instanceof MaxUploadSizeExceededException) {
            String s = g.toJson(ResultVo.error("上传的文件大小不能超过1MB！"));
            writer.write(s);
            writer.flush();
        }else {
            writer.write(g.toJson(ResultVo.error("网络开小差了！")));
        }
        return null;
    }*/
}

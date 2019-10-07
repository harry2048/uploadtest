package com.zr.uploadtest.async;

import com.zr.uploadtest.async.service.AsyncService;
import com.zr.uploadtest.pojo.User;
import com.zr.uploadtest.util.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: gengwei
 * @Date: 2019-07-27 11:10
 * @Description:
 */
@RestController
@Slf4j
public class AsyncController {
    @Autowired
    private AsyncService asyncService;

    /*@GetMapping("/async")
    public ResultVo doAsync() throws Exception {
        long start = System.currentTimeMillis();
        log.info("方法执行开始：{}", start);
        //调用同步方法
        asyncService.syncEvent();
        long syncTime = System.currentTimeMillis();
        log.info("同步方法用时：{}", syncTime - start);


        //调用异步方法
        Future<String> stringFuture = asyncService.asyncEvent();
        long asyncTime = System.currentTimeMillis();
        log.info("异步方法用时：{}", asyncTime - syncTime);
        log.info("方法执行完成：{}!",asyncTime);
        return ResultVo.success(stringFuture.get(2, TimeUnit.SECONDS));
    }*/

    @GetMapping("/async")
    public ResultVo doAsync() throws Exception {
        long start = System.currentTimeMillis();
        log.info("方法执行开始：{}", start);
        //调用同步方法
        asyncService.syncEvent();
        long syncTime = System.currentTimeMillis();
        log.info("同步方法用时：{}", syncTime - start);


        //调用异步方法
        User user = asyncService.asyncEvent().get(4, TimeUnit.SECONDS);
        long asyncTime = System.currentTimeMillis();
        log.info("异步方法用时：{}", asyncTime - syncTime);
        log.info("方法执行完成：{}!",asyncTime);
        return ResultVo.success(user);
    }

}

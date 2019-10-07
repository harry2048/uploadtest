package com.zr.uploadtest.async.service;

import com.zr.uploadtest.pojo.User;
import com.zr.uploadtest.util.ResultVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: gengwei
 * @Date: 2019-07-27 11:10
 * @Description:
 */
@Service
@Slf4j
public class AsyncService {

    /*@Async("asyncPoolTaskExecutor")
    public void asyncEvent() throws InterruptedException {
        //休眠1s
        Thread.sleep(1000);
        log.info("异步方法内部线程名称：{}!", Thread.currentThread().getName());
    }*/

    @Async("asyncPoolTaskExecutor")
    public Future<User> asyncEvent() throws Exception {
        //休眠1s
        Thread.sleep(1000);
        log.info("异步方法内部线程名称：{}!", Thread.currentThread().getName());
        User user = new User(1,12,"zs");
        return new AsyncResult<>(user);
//        return new AsyncResult<>("异步方法返回值");
    }

    public void syncEvent() throws InterruptedException {
        //休眠1s
        Thread.sleep(1000);
        log.info("同步方法内部线程名称：{}!", Thread.currentThread().getName());
    }
}

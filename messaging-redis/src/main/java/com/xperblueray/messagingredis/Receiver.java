package com.xperblueray.messagingredis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.CountDownLatch;

/**
 * Created by wuxiaobo on 2019/8/24
 *
 * @author wuxiaobo
 * @version 1.0
 * @date 2019/8/24 11:58
 */
public class Receiver {
    private static final Logger log = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch;

    @Autowired
    public Receiver(CountDownLatch latch) {
        this.latch = latch;
    }

    public void receiveMessage(String message) {
        log.info("Received <" + message + ">");
        latch.countDown();
    }
}

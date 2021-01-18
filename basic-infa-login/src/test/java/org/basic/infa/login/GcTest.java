package org.basic.infa.login;

import org.junit.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @autor qiubingyu
 * @date 2021/1/18
 * @name GcTest
 **/
public class GcTest {

    @Test
    public void test1() throws InterruptedException {
        for (;;){
            Thread.sleep(200);
            byte b[] = new byte[1<<20];
        }
    }

}

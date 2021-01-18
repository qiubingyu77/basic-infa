package org.basic.infa.login;

import org.junit.Test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @autor qiubingyu
 * @date 2021/1/18
 * @name CompletableFutureTest
 **/
public class CompletableFutureTest {
    @Test
    public void test1() throws ExecutionException, InterruptedException {
        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        integerCompletableFuture.get();
    }

}

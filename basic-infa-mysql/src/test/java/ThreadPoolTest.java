import org.junit.Test;

import java.util.concurrent.*;

/**
 * @autor qiubingyu
 * @ClassName ThreadPoolTest
 * @date 2021/1/17
 **/
public class ThreadPoolTest {
    @Test
    public void test2() throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ExecutorCompletionService completionService = new ExecutorCompletionService(executorService);
        completionService.submit(()->{
            Thread.sleep(15000);
            return 0;
        });
        Object o = completionService.take().get();
        System.out.println(0);
    }

    @Test
    public void test1() throws ExecutionException, InterruptedException {
        Integer integer = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 1;
        }).get();
        System.out.println(integer);
    }
}

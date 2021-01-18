import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.basic.infa.mysql.domain.TsUser;
import org.basic.infa.mysql.mapper.UserMapper;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.LockSupport;

/**
 * @autor qiubingyu
 * @ClassName MybatisPlusTest
 * @date 2021/1/16
 **/
public class MybatisPlusTest extends BaseTest{

    @Test
    public void test1(){
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        TsUser tsUser = userMapper.selectById("2");
        System.out.println(tsUser.getUserName());
        LockSupport.park();
    }

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


    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (;;){
            Thread.sleep(50);
            executorService.execute(()->{
                byte b[] = new byte[1 * 1024 * 1024];
            });
        }
    }
}

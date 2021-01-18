import org.basic.infa.mysql.Main;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @autor qiubingyu
 * @ClassName common.BaseTest
 * @date 2021/1/15
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Main.class},webEnvironment = SpringBootTest.WebEnvironment.NONE)
public abstract class BaseTest {
    @Autowired
    protected Environment environment;
    @Autowired
    protected ApplicationContext applicationContext;
}

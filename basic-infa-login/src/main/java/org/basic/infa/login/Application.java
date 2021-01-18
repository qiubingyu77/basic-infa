package org.basic.infa.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author qiubingyu
 * @ClassName Application
 * @date 2021/1/18
 **/
@SpringBootApplication(scanBasePackages = {"org.basic.infa.login"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}

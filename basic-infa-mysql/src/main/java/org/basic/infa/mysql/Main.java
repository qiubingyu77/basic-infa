package org.basic.infa.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @autor qiubingyu
 * @ClassName Main
 * @date 2021/1/16
 **/
@SpringBootApplication
@MapperScan(basePackages = {"org.basic.infa.mysql.mapper"})
public class Main {
    public static void main(String[] args) {
        new SpringApplicationBuilder().run(args);
    }
}

package org.basic.infa.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @autor qiubingyu
 * @ClassName MysqlAutoConfig
 * @date 2021/1/15
 **/
@Configuration
@MapperScan(basePackages = {"org.basic.infa.mysql.mapper"})
public class MysqlAutoConfig {
}

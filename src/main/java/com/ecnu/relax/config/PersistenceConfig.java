package com.ecnu.relax.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@MapperScan("com.ecnu.relax.mapper")
@EnableTransactionManagement
public class PersistenceConfig {

}
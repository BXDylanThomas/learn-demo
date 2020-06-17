package com.dylan.mybatisplusdruidview.config.mybatis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author baoxiang
 * @create 2020-06-15 11:22
 */
@Configuration
public class MyBatisAutoConfiguration {

    @Bean
    @ConditionalOnExpression("${mybatis.print.enable:true}")
    public MybatisSqlCompletePrintInterceptor mybatisSqlCompletePrintInterceptor() {
        return new MybatisSqlCompletePrintInterceptor();
    }
}
 
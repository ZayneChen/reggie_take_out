package com.itheima.reggie;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ZayneChen
 * @date 2022年07月17日 21:24
 */
@SpringBootApplication
@Slf4j
@EnableTransactionManagement
@ServletComponentScan
@EnableCaching // 开启Spring Cache注解方式的缓存功能
@MapperScan("com.itheima.reggie.mapper")
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class,args);
        log.info("项目启动成功！");
    }
}

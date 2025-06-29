package com.caillo.caillopicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@MapperScan("com.caillo.caillopicturebackend.mapper")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class CailloPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CailloPictureBackendApplication.class, args);
    }

}

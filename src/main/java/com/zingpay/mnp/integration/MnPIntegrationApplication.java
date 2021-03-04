package com.zingpay.mnp.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * @author Bilal Hassan on 01-Mar-21
 * @project mnp-integration-microservice
 */

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled = true)
@EnableFeignClients(basePackages = "com.zingpay.mnp.integration.feign")
@EnableResourceServer
public class MnPIntegrationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MnPIntegrationApplication.class, args);
    }
}

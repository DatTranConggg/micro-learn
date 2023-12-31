package com.dattran.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        // To inject bean from other packages
        scanBasePackages = {
                "com.dattran.customer",
                "com.dattran.amqp",
        }
)
@EnableEurekaClient // Enable eureka client
@EnableFeignClients(
        basePackages = "com.dattran.clients"
) // Enable feign client
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}

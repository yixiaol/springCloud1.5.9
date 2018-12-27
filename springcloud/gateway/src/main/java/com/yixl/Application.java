package com.yixl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * zuul 网关
 * 
 * 请求方式： http://127.0.0.1:8081/yixlapi/index
 * 
 * 启动两个同样的springboot 端口号不同， zuul 会自动做负载均衡。
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

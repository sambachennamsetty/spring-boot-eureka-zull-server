package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class SpringBootEurekaZullServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaZullServerApplication.class, args);
	}

}

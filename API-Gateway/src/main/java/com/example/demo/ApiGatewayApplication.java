package com.example.demo;

import org.springframework.boot.SpringApplication;
import com.example.demo.filter.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
	
	@Bean
	public preFilter preFilter() {
	    return new preFilter();
	}
	@Bean
	public postFilter postFilter() {
	    return new postFilter();
	}
	@Bean
	public errorFilter errorFilter() {
	    return new errorFilter();
	}
	@Bean
	public routeFilter routeFilter() {
	    return new routeFilter();
	}

}

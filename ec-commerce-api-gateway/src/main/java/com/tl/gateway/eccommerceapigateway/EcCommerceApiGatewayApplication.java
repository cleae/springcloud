package com.tl.gateway.eccommerceapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EcCommerceApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcCommerceApiGatewayApplication.class, args);//invalidate234
	}

}


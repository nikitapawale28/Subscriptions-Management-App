package com.Nikita.microservices.DBProject_zuul_api_gateway;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		System.out.println("inside gateway");
		System.out.println(builder);
        return builder.routes()
                .route("publications-service", r -> r
                    .path("/publications/**")
                    .uri("http://localhost:8200")
                )
                .route("customer-service", r -> r
                    .path("/customer/**")
                    .uri("http://localhost:8300")
                )
                .route("subscriptions-service", r -> r
                    .path("/subscription/**")
                    .uri("http://localhost:8100")
                )
                
                .build();
	}

}
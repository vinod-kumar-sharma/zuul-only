package com.kakawait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Thibaud Leprêtre
 */
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	/*@Bean
	UserInfoRestTemplateCustomizer userInfoRestTemplateCustomizer(SpringClientFactory springClientFactory) {
		return template -> {
			AccessTokenProviderChain accessTokenProviderChain = Stream 
					.of(new AuthorizationCodeAccessTokenProvider(), new ImplicitAccessTokenProvider(), new ResourceOwnerPasswordAccessTokenProvider(), new ClientCredentialsAccessTokenProvider())
					.peek(tp -> tp.setRequestFactory(new RibbonClientHttpRequestFactory(springClientFactory)))
					.collect(Collectors.collectingAndThen(Collectors.toList(), AccessTokenProviderChain::new));
			template.setAccessTokenProvider(accessTokenProviderChain);
		};
	}*/
}

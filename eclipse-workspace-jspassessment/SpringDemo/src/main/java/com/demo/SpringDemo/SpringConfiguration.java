package com.demo.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.demo.SpringDemo.library.CartComponent;
import com.demo.SpringDemo.library.ProductComponent;

@Configuration
@PropertySource(value= {"classpath:/application.properties"})
@ComponentScan(basePackages=("com.demo.SpringDemo"))
public class SpringConfiguration {
//	@Bean
//	public ProductComponent getProduct() {
//		return new ProductComponent();
//	}
//	@Bean
//	public CartComponent getCart() {
//		return new CartComponent();
//	}
}

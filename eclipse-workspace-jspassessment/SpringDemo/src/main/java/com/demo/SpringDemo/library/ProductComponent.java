package com.demo.SpringDemo.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(value="request")
public class ProductComponent {
	@Autowired
	CartComponent cart;
	@Value("${cname}")
	String cname;
//	public void setCart() {
//		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		cart = context.getBean(CartComponent.class); 
//	}
	public List<String> viewAddCart(String prd){
		return cart.addProduct(cname+":"+prd);
	}
}

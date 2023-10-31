package com.demo.SpringDemo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.SpringDemo.library.CartComponent;
import com.demo.SpringDemo.library.ProductComponent;
public class App {

  public static void main(String[] args) {  
	ProductComponent product,product2;
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	product = context.getBean(ProductComponent.class);
	product2 = context.getBean(ProductComponent.class);
	if(product==product2) {
    	System.out.println("Same Object");
    }
    else {
    	System.out.println("Different Object");
    }
//	product.setCart();
    Scanner sc = new Scanner(System.in);
    while(true) {
    	System.out.println("Enter product");
    	String item = sc.next();
    	if(item.equals("end")) {
    		System.out.println("Thank you!");
    		break;
    	}
    	System.out.println(product.viewAddCart(item));
    }
  }
}

package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
//	@GetMapping("/display")
//	public String displayProduct(Model model) {
//		Product prd = new Product(1,"Java",300);
//		model.addAttribute("product",prd);
//		return "displayProduct";
//	}
//	
//	@GetMapping("/displaylists")
//	public String displayProductLists(Model model) {
//		List<Product> productList = new ArrayList<Product>();
//		productList.add(new Product(1,"Java",300));
//		productList.add(new Product(2,"MySql",400));
//		model.addAttribute("productList",productList);
//		return "productLists";
//	}
	
	@Autowired
	ProductService service;
	@GetMapping("/display")
	public String displayProduct(Model model) {
		Product prd=service.getProductById(2);
		model.addAttribute("product", prd);
		return "displayProduct";
	}
	@GetMapping("/displaylists")
	public String displayProductList(Model model) {
		Iterable<Product> productList=service.getAllProducts();
		model.addAttribute("productList", productList);
		return "productLists";
	}
	
	@GetMapping("/addProduct")
	public ModelAndView addProduct() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("product",new Product());
		mv.setViewName("addProduct");
		return mv;
	}
	
	@PostMapping("/addProduct")
	@ResponseBody
	public String addProducts(Product prd){		
		return service.updateProducts(prd);
	}
	
	@GetMapping("user")
	public ModelAndView printUser() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("user","Admin");
		mv.setViewName("user");
		return mv;
	}
}

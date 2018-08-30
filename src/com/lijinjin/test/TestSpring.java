package com.lijinjin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lijinjin.pojo.Category;
import com.lijinjin.pojo.Product;
import com.lijinjin.service.ProductService;

public class TestSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(string);
		Category category=(Category) applicationContext.getBean("c");
		System.out.println(category.getName());
		
		Product product=(Product) applicationContext.getBean("p");
		System.out.println(product.getName());
		System.out.println(product.getCategory().getName());
		
		ProductService productService=(ProductService) applicationContext.getBean("s");
		productService.doSomeService();
	}

}

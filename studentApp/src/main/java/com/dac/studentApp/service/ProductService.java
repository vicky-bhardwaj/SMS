package com.dac.studentApp.service;


import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dac.studentApp.model.Product;

@Service
public class ProductService {

	@Autowired
	private Product prod;

	List<Product> products=new ArrayList<>();
		
	public ProductService() {
		products.add(new Product(101, "Iphone", 50000));
    	products.add( new Product(102, "Canon Camera", 70000));
    	products.add(new Product(103,"Shure Mic",10000));
    	
    	//products.add(prod);
	}
	public void addProduct(Product product) {
		
		products.add(product);
	}
    
    
    public List<Product> getProducts() {
    	
        return products;
    }



	public Product getProductById(int prodId) {
		return products.stream()
				.filter(p -> p.getProdId()==prodId)
				.findFirst().get();//orElse(new Product(0,"no item",0));
	}
	
	public void updateProduct(Product product) {
		int index =0;
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getProdId()==product.getProdId())
			{
				index=i;
			}
		}
		products.set(index, product);
		
	}
	public Product deleteProductById(int prodId) {
		int index =0;
		for(int i=0;i<products.size();i++)
		{
			if(products.get(i).getProdId()==prodId)
			{
				index=i;
			}
		}
		return products.remove(index);
		
	
	}
}

package main.java.org.bits.controller;

import java.util.List;

import main.java.org.bits.businessobject.ProductBO;
import main.java.org.bits.service.ProductsWarrantyService;

public class NewProductCreationHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public String handleRequest(String requestBody) {
		System.out.println("Input "+requestBody);
		ProductBO productBO=null;
		 saveProductInfo(productBO);
		 return "Product has been created";
    }
	
	private ProductsWarrantyService productsWarrantyService;

	public ProductsWarrantyService getProductsWarrantyService() {
		return productsWarrantyService;
	}

	public void setProductsWarrantyService(ProductsWarrantyService productsWarrantyService) {
		this.productsWarrantyService = productsWarrantyService;
	}
	
	public void saveProductInfo(ProductBO productBO) {
		productsWarrantyService.saveProductInfo(productBO);
	}
}

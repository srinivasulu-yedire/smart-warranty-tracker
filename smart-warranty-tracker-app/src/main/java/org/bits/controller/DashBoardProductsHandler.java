package main.java.org.bits.controller;

import java.util.List;

import main.java.org.bits.businessobject.ProductBO;
import main.java.org.bits.service.ProductsWarrantyService;

public class DashBoardProductsHandler {
	
	private ProductsWarrantyService productsWarrantyService;

	public ProductsWarrantyService getProductsWarrantyService() {
		return productsWarrantyService;
	}

	public void setProductsWarrantyService(ProductsWarrantyService productsWarrantyService) {
		this.productsWarrantyService = productsWarrantyService;
	}

	public static void main(String[] args) {
		System.out.println("DashBoardProductsHandler........");
	}

	public List<ProductBO> handleRequest(String requestBody) {
		System.out.println("Input "+requestBody);
		return retrieveProductsList();
    }
    
    public List<ProductBO> retrieveProductsList() {
        System.out.println("Inside retrieve products list");
		return productsWarrantyService.retrieveProductsList();
	}

}

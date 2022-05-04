package main.java.org.bits.controller;

import main.java.org.bits.businessobject.ProductBO;
import main.java.org.bits.service.ProductsWarrantyService;

public class UploadReceiptHandler {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	private ProductsWarrantyService productsWarrantyService;

	public ProductsWarrantyService getProductsWarrantyService() {
		return productsWarrantyService;
	}

	public void setProductsWarrantyService(ProductsWarrantyService productsWarrantyService) {
		this.productsWarrantyService = productsWarrantyService;
	}
	
	public void uploadProductReceipt(ProductBO productBO) {
		productsWarrantyService.uploadProductReceipt(productBO);
	}
}

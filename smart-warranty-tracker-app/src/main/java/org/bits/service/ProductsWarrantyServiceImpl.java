package main.java.org.bits.service;

import java.util.List;

import main.java.org.bits.businessobject.ProductBO;
import main.java.org.bits.dao.ProductsWarrantyDAO;

public class ProductsWarrantyServiceImpl implements ProductsWarrantyService {
	
	private ProductsWarrantyDAO productsWarrantyDAO;
	
	
	public ProductsWarrantyDAO getProductsWarrantyDAO() {
		return productsWarrantyDAO;
	}

	public void setProductsWarrantyDAO(ProductsWarrantyDAO productsWarrantyDAO) {
		this.productsWarrantyDAO = productsWarrantyDAO;
	}

	@Override
	public List<ProductBO> retrieveProductsList() {
		return productsWarrantyDAO.retrieveProductsList();
	}

	@Override
	public void saveProductInfo(ProductBO productBO) {
		productsWarrantyDAO.saveProductInfo(productBO);
	}

	@Override
	public void uploadProductReceipt(ProductBO productBO) {
		productsWarrantyDAO.uploadProductReceipt(productBO);
	}
	
	
}

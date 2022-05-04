/**
 * 
 */
package main.java.org.bits.dao;

import java.util.List;

import main.java.org.bits.businessobject.ProductBO;

/**
 * @author Srinivasulu Y
 *
 */
public interface ProductsWarrantyDAO {
	public List<ProductBO> retrieveProductsList();
	public void saveProductInfo(ProductBO productBO);
	public void uploadProductReceipt(ProductBO productBO);
}

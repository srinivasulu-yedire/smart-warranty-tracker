/**
 * 
 */
package main.java.org.bits.dao;

import java.util.ArrayList;
import java.util.List;

import main.java.org.bits.businessobject.ProductBO;

/**
 * @author Srinivasulu Y
 *
 */
public class ProductsWarrantyDAOImpl implements ProductsWarrantyDAO {

	@Override
	public List<ProductBO> retrieveProductsList() {
		
		List<ProductBO> list = new ArrayList<ProductBO>();
		ProductBO p =new ProductBO();
		p.setProductId("1");
		p.setProductName("Samsung AC");
		p.setProductDesc("Purchased from Bajaj Electronics with 1 yr warranty");
		p.setProductExpiry("01-01-2023");
		p.setProductCreated("");
		
		ProductBO p1 =new ProductBO();
		p1.setProductId("2");
		p1.setProductName("Samsung Fridge");
		p1.setProductDesc("Purchased from Reliance Electronics with 1 yr warranty");
		p1.setProductExpiry("05-06-2023");
		p1.setProductCreated("");
		list.add(p1);
		
		list.add(p);
		return list;
	}

	@Override
	public void saveProductInfo(ProductBO productBO) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uploadProductReceipt(ProductBO productBO) {
		// TODO Auto-generated method stub
		
	}

}

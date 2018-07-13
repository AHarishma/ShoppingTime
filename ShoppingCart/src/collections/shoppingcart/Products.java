package collections.shoppingcart;
import java.util.List;
import java.util.ArrayList;
public class Products {
	private final List<Product> products=new ArrayList<>();
	 public Products() {
		this.initStoreItems();
		
	}
	 public List<Product> getProducts()
	 {
		 return products;
	 }
	 
	 public void initStoreItems()
	 {
		String[] productNames= {"Chocolates","Juice","Ice Cream"};
		Double[] productPrice= {5.00d,20.00d,10.00d};
		Integer[] productStock= {6,2,1};	
		
		for(int i=0;i<productNames.length;i++)
		{
			this.products.add(new Product(i+1,productNames[i],productPrice[i],productStock[i]));
		}
	 }

}

package collections.shoppingcart;

import java.util.List;
import java.util.ArrayList;

public class Cart {
List<Product> cartItems=new ArrayList<>();
public void addProducttoCartByPID(int pid)
{
	Product product=getProductById(pid);
	addToCart(product);
}
public Product getProductById(int pid)
{
	Product product=null;
	List<Product> products=new Products().getProducts();
	for(Product prod:products) {
		if(prod.getPid()==pid)
			product=prod;
	}
	return product;
}
public void addToCart(Product product) {
cartItems.add(product);
}

public void removeProductByPID(int pid) {
	Product product=getProductById(pid);
	cartItems.remove(product);	
}
void printCartItems()
{   System.out.println("The Cart Items are:");
    System.out.println();
    System.out.println("Product Name");
    System.out.println();
	for(Product prod:cartItems)
	{   
		System.out.println(prod.getName());
	}
}
}

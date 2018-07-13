package collections.shoppingcart;

import java.util.List;

import java.util.Scanner;


public class UI {
	
	Cart cart = new Cart();
	private  int ch=0;
	
	public UI()
	{
	menu();	
	}
	
	public void startScreen()
	{
		System.out.println();
	    System.out.println();
	    System.out.println("1.Display store products");
	    System.out.println("2.Display cart");
	    System.out.println("0.Exit");
	    System.out.println();
	}
	
	public  void storeProductMenu()
	{ 
		System.out.println();
	    System.out.println();
		System.out.println("1.Add to Cart");
		System.out.println("2.Remove from Cart");
		System.out.println("0.Exit");
		System.out.println();
	}
	
	public void menu()
	{
		do {
			
			startScreen();
			System.out.println("To Choose from the given options, enter 1, 2 or 0");
			getUserInput();
			switch(ch)
			{
			case 1:
				displayStoreProduct();
				storeProductMenu();
				System.out.println("To Choose from the given options, enter 1, 2 or 0");
				getUserInput();
				innerChoice();
				break;
			case 2:
				showCart();
				break;
			case 0:
				System.out.println("Bye");
				System.exit(0); 
				break;
		    default:
		    	break;
		    }
		}while(ch!=0);
	}
	
		 private void innerChoice()
		 {   
			switch(ch)
			{
			case 1:
				addProductToCart();
				showCart();
				break;
			case 2:
				removeProductFromCart();
				break;
			  default:
				  break;
			}
		}
		 
		 
		 private  int getUserInput() throws NumberFormatException
		 {
			 Scanner input=new Scanner(System.in);
			 ch=Integer.parseInt(input.nextLine());
			 return ch;
		 }
		 
			
		 private void displayStoreProduct()
		 {
			 List<Product> products=new Products().getProducts();
			 System.out.println("Store Products are:");
			 System.out.println("Product Id         Product Name     Product Price     Product Stock");      
			 for(Product product : products)
			 {
				 System.out.println(product.getPid()+"    -               "+product.getName()+"               "
			                       +product.getPrice()+"               "+product.getStock());
			 } 
		 }
		 
		 
		 private void addProductToCart() {
			 System.out.println("Select the product to be added to the cart.Enter the pid");
			 int pid=getUserInput();
			 cart.addProducttoCartByPID(pid);
		 }
		 
		 private  void removeProductFromCart() {
			 System.out.println("Select the product to be removed from the cart.Enter the pid");
			 int pid=getUserInput();
			 cart.removeProductByPID(pid);
		 }
		 
		 private void showCart() {
			cart.printCartItems();
		 }
}

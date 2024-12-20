package Dec_11_ExceptionShoppingApplication;

public class ShoppingApplication 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(1, "Phone", 2000, 12);
		Product p2 = new Product(2, "COOKER", 1000, 15);
		Product p3 = new Product(3, "laptop", 5000, 10);
		
		ShoppingCart cart = new ShoppingCart(15);
		try{
			 cart.addToCart(1, p1);
	         cart.addToCart(2, p2);
	         cart.addToCart(5, p3);
		}
		catch(InsufficientQuantityException | InvalidProductException  e) 
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		double total = cart.calculateTotal();
        System.out.println("\nTotal value of items in the cart: ₹" + total);		
	}
}

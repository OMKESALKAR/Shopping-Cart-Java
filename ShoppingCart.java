package Dec_11_ExceptionShoppingApplication;
//BLC
public class ShoppingCart 
{
	Product[] cartItems;
	int itemCount;
	
	
	public ShoppingCart(int capacity)
	{
		cartItems = new Product[capacity];  
		itemCount = 0;
	}
	
	public void addToCart(int quantity, Product p) throws InsufficientQuantityException, InvalidProductException
	{
		if(p == null)
		{
			throw new InvalidProductException("Product not found");
		}
		else if(quantity > p.quantity)
		{
			throw new InsufficientQuantityException("Insufficient quantity for product: " + p.name);
		}
		else if(itemCount >= cartItems.length) 
		{
			throw new InvalidProductException("Cart is full. Cannot add more items");
		}
		else {
			cartItems[itemCount++] = p;
			p.decreaseQuantity(quantity);
			System.out.println("Added " + quantity + " units of " + p.name + " to the cart.");
            System.out.println("Cart items: " + itemCount + ", Remaining cart space: " + (cartItems.length - itemCount));
		}
		
	}
	
	public double calculateTotal()
	{
		double total = 0;
		
		for(Product p : cartItems)
		{
			if(p != null)
			{
				total += (p.quantity * p.price );				
			}
		}
		return total;
	}
}

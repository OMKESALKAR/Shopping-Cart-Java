package Dec_11_ExceptionShoppingApplication;
//BLC
public class Product 
{
	int id;
	String name;
	double price;
	int quantity;
	
	public Product(int id, String name, double price, int quantity)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;  
		this.quantity = quantity;
	}
	
	public void decreaseQuantity(int amount) throws InsufficientQuantityException
	{
		if(amount > this.quantity)
		{
			throw new InsufficientQuantityException("Insufficient Quantity");
		}
		else {
			this.quantity -= amount;			
		}
	}
	
}

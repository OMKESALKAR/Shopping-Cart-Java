package Dec_11_ExceptionShoppingApplication;

@SuppressWarnings("serial")
public class InvalidProductException extends RuntimeException
{
	public InvalidProductException()
	{
		
	}
	public InvalidProductException(String errorMessage) {
		super(errorMessage);
	}
	
}

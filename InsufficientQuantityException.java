package Dec_11_ExceptionShoppingApplication;

@SuppressWarnings("serial")
public class InsufficientQuantityException extends Exception
{
	public InsufficientQuantityException() {
		
	}

	public InsufficientQuantityException(String errorMessage) 
	{
		super(errorMessage);
	}
	
	
}

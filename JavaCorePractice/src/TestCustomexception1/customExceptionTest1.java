package TestCustomexception1;

class invalidAgeException extends Exception{
	
public invalidAgeException(String str) {
	
	
	//Calling the constructor of parent class Exception
	
	super(str);
		
	}
}

//Class that uses custom exception InvalidAgeException

public class customExceptionTest1 {
	
	
	///method to check the age
	
	static void validate(int age)throws invalidAgeException{
		if(age < 18) {
			
			
			throw new invalidAgeException("Age is not valid to marrage");
			
		}else {
			System.out.println("welcome to get marriage");
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		try {
			validate(88);
		}catch(invalidAgeException e) {
			
			System.out.println(e);
		}
		
		System.out.println("rest of the code");
	}
	
	

}

package exceptions;

public class NonNegative {
	
	public void nonnegative(int x){
		if (x < 0){
			new IllegalArgumentException();
		}
		/*
		 * Do something else...
		 */
	}

}

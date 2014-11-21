package returnValue;

import java.util.Random;

public class MyRandom {
	
	public int genRandom(){
		Random rand = new Random();
		return ((int) rand.nextDouble())*100;
	}

}

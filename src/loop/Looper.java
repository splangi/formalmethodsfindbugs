package loop;

public class Looper {
	
	public void method(){
		for (int i = 0; i < 10; i++){
			for (int j = 0; j < 10; i++)
				System.out.println("i*j: " + i*j);
		}
	}
	
	public void method2(){
		int i = 0;
		if (i == 10){
			return;
		}
		System.out.println("i: " + i);
		method2();
		i++;
	}
	
	public void method3(){
		int i = 0;
		while (i < 10){
			System.out.println("i: "+ i);
		}
	}
	
	public void method4(){
		// Interesting!
		int i = 0;
		int j = 2;
		while (i%j != 2){
			System.out.println("i: " + i);
			i++;
		}
	}

}

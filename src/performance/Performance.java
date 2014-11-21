package performance;

public class Performance {
	
	public void method(){
		String randstring = "tenTimesHello!";
		int i = 0;
		i = 0;
		while (i<10){
			randstring = randstring + randstring;
		}
	}

}

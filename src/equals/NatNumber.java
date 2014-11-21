package equals;

public class NatNumber implements Comparable<NatNumber>{
	
	int nominator;

	@Override
	public int compareTo(NatNumber arg0) {
		return Integer.compare(nominator, arg0.nominator);
	}

	@Override
	public boolean equals(Object arg0) {
		return ((NatNumber) arg0).nominator == nominator;
	}
	
	
	
	

}

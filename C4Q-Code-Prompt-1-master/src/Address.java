
/*Let's divide IPv4 Addresses into an array of 4 octets, or 8 bit groupings.
 * Hopefully this should make calculations easier, and there's the added bonus of not needing Java's Tokenize
 * Update: I was wrong, tokenize is still needed when handling the command line arguments*/

public class Address {
	//array size of oct is equal to 3, because of the notorious 0th index.
	protected int[] oct = new int[3];
	
	//4 argument constructor
	public Address(int a, int b, int c, int d){
		oct[0] = a;
		oct[1] = b;
		oct[2] = c;
		oct[3] = d;
	}
	
	//get methods, which I will definitely need
	public int getOct(int n){return oct[n];}
	
	//I don't think I'll need set methods, but I'll write them under this comment if I need to
	
} //end class IPv4

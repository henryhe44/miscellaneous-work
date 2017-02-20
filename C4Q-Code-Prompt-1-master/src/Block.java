/*Object Block is nearly identical to Object Address (hence the use of "extends"), 
 * except it now includes the number of bits that both the objects must share*/

public class Block extends Address{
	private int bit;
	
	public Block(int a, int b, int c, int d, int e){
		super(a,b,c,d);
		bit = e;
	}

	//get method for bits
	public int getBit(){return bit;}
	
} //end class IP_Block

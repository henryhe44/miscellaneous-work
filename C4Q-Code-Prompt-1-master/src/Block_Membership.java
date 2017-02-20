import java.util.*;

public class Block_Membership {
	
	/* Now that I've written the objects I need, I'll have to work on the function...
	 * What should it do? It should...
	 * #1: Take Block and Address as inputs
	 * #2: Convert both inputs into bit strings
	 * 		a) Create a vector object
	 * 		b) Convert Octet 1 into bits...
	 * 		c) Append converted bits to a vector object
	 * 		d) Repeat for all Octets
	 * 		e) Return array
	 * #3. Compare the first n bits of both bit string
	 * 		a) A for loop with a condition looping n times should suffice
	 * #4. Print "in block" if no discrepancies found, otherwise print "not in block"
	 * */
	
	/*I realize that vectors may not be the best choice when it comes to holding bit strings.
	 *This is mostly due to the issue of needing "filler 0's" when converting to binary.
	 *I'm starting to think maybe a Stack or linked list would be better.
	 *Since I'm running out of time, it's best if I go with vector and make some simplifying assumptions
	 *Assumptions:
	 *#1: There exists an append method where an element is added at the end of the array (i.e: vector.append(1) adds 1 to the end of the vector)
	 *#2: There exists a prepend method where an element is added at the beginning of the array (i.e: vector.prepend(2) adds 1 to the beginning of the vector)
	 **/
	
	
	//Object Block is an extension of Object Address, and thus it should work.
	public static void convert2Binary(Address address, Vector BitString){
		for(int i=0; i<4; i++){
			int n = address.getOct(i);
			int index = 0;
			int cap = i*8-1;
			//This while loop does the conversion from decimal to binary
			while (n>0){
				BitString.append(n%2);
				index++;
				n = n/2;
			}
			//This while loop adds in the filler 0's to ensure the right number of bits
			while( BitString.capacity()!=cap ){BitString.prepend(0);}
		}
	} //end convert2Binary function
	
	public static void Function(Block block, Address address) {
		Vector bitString_Address = new Vector();
		Vector bitString_Block = new Vector();
		convert2Binary(address, bitString_Address);
		convert2Binary(block, bitString_Block);
		
		int n = block.getBit();
		//Now to check if the bit strings are the same for the first n number of bits
		for(int i=0; i<n; i++){
			if ( bitString_Address.elementAt(i) != bitString_Block.elementAt(i) )
				System.out.println("not in block");
			else 
				System.out.println("in block");
		}
	} //end Function function
	
	//I'll have to end it here due to time constraint.
	//I have to say, this is a surprisingly enjoyable problem.
	public static void main(String[] args) {
	   } //end main
	
} //end class Block_Membership

package javacourse;
// shift operators

//Left Shift (<<): Multiplies the number by 2^n, where n is the number of positions shifted.

//Right Shift (>>): Divides the number by 2^n, preserving the sign for negative numbers.

//Unsigned Right Shift (>>>): Shifts the bits to the right and fills the leftmost bits with zeros, regardless of the sign.

public class Shift {
	
	    public static void main(String[] args) {
	        int a = 16;  // Binary: 0001 0000

	        System.out.println("Original value: " + a); // 16

	        int leftShift = a << 2;  // Shift left by 2
	        System.out.println("After left shift by 2: " + leftShift); // 64 (Binary: 0100 0000)

	        int rightShift = a >> 2;  // Shift right by 2
	        System.out.println("After right shift by 2: " + rightShift); // 4 (Binary: 0000 0100)

	        int unsignedRightShift = a >>> 2;  // Unsigned shift right by 2
	        System.out.println("After unsigned right shift by 2: " + unsignedRightShift); // 4
	    }
	}



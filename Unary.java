package javacourse;
// Summary of Unary Operators:

//Unary Plus (+): Indicates a positive number (often redundant).

//Unary Minus (-): Negates the value (changes the sign).

//Increment (++): Increases the value by 1.

//Decrement (--): Decreases the value by 1.

//Logical NOT (!): Negates a boolean value (true becomes false and vice versa).

//Bitwise NOT (~): Inverts all bits of the operand.
public class Unary {
	
	    public static void main(String[] args) {
	        int a = 5;
	        boolean flag = true;

	        // Unary Plus
	        System.out.println("+a = " + +a);  // 5 (no effect)

	        // Unary Minus
	        System.out.println("-a = " + -a);  // -5

	        // Prefix Increment
	        System.out.println("++a = " + ++a);  // 6

	        // Postfix Increment
	        System.out.println("a++ = " + a++);  // 6 (then a becomes 7)
	        System.out.println("a = " + a);  // 7

	        // Prefix Decrement
	        System.out.println("--a = " + --a);  // 6

	        // Postfix Decrement
	        System.out.println("a-- = " + a--);  // 6 (then a becomes 5)
	        System.out.println("a = " + a);  // 5

	        // Logical NOT
	        System.out.println("!flag = " + !flag);  // false

	        // Bitwise NOT
	        System.out.println("~a = " + ~a);  // -6
	    }
	}



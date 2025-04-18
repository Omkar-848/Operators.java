package javacourse;
//In Java, logical operators are used to combine multiple boolean expressions and evaluate them as true or false. 

//There are three main logical operators in Java:

//AND (&&): Returns true if both operands are true.

//OR (||): Returns true if at least one operand is true.

//NOT (!): Reverses the logical state of its operand (i.e., if the condition is true, it becomes false).

public class Logical {
	
	    public static void main(String[] args) {
	        boolean a = true;
	        boolean b = false;
	        
	        // AND operator
	        if (a && b) {
	            System.out.println("Both are true.");
	        } else {
	            System.out.println("At least one is false.");
	        }
	            
	            // OR operator
	            if (a || b) {
	                System.out.println("At least one is true.");
	            } else {
	                System.out.println("Both are false.");
	            }
	                
	                // NOT operator
	                if (!a) {
	                    System.out.println("a is false.");
	                } else {
	                    System.out.println("a is true.");
	                }
	    }
}
	        
	    
	



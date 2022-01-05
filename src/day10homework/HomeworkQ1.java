package day10homework;

public class HomeworkQ1 {
	
	public static void main (String [] args) {
		
		calculate (6, 3, '+' );
		
	}
	
	public static void calculate(double numOne, double numTwo, char mathOperationSign) {
		
		switch (mathOperationSign) {
		
		case '+':
			System.out.println(numOne + numTwo);
			break;
			
		case '-':
			System.out.println(numOne - numTwo);
			break;
		
		case '*':
			System.out.println(numOne * numTwo);
			break;
			
		case '/':
			System.out.println(numOne / numTwo);
			break;
			
		case '%':
			System.out.println(numOne / numTwo);
			break;
			
			default:
				System.out.println("Error");
				
		}
		
		
		
	}
	
	
	
	
	
	
	

}

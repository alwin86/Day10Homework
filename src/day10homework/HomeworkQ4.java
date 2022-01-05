package day10homework;

public class HomeworkQ4 {
	
	public static void main (String [] args) {
		
		getDoWhileLoopResult(7, 30) ;
			
		
	}
	
	public static void getDoWhileLoopResult (int minNum, int maxNum ) {
		
		do {
			
			System.out.println(minNum);
			minNum ++;
			
		} while ( minNum <= maxNum );
		
	}
	
	

}

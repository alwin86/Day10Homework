package day10homework;

public class HomeworkQ2 {
	
	public static void getGender (String[] args) {
		
		getGender('m');
		
		
	}
	
	public static void getGender (char gender) {
		
		String person;
		switch (gender) {
		
		case 'm':
		person = "Male";
		break;
		
		case 'M':
		person = "Male";
		break;
		
		case 'f':
		person = "Female";
		break;
		
		case 'F':
		person = "Female";
		break;
		
		default:
		person = "error";
		break;
		
		
		}
		
		System.out.println(person);
		
	}
	

}

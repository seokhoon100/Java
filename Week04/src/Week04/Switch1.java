package Week04;

public class Switch1 {
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A': case 'a': 
			System.out.println("A와 동급");
			break;
		case 'B':case 'b': 
			System.out.println("B와 동급");
			break;
		default:
			System.out.println("기타 동급");
		}
	}
}

package Week09;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("123456-123456", "홍길동", 6.1);
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		System.out.println(p1.height*Person.FEET_CONSTANT + "cm");
		
		p1.name = "진달래";
	}
}
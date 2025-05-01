package Week07;

public class PetEx {
	public static void main(String[] args) {
		
		Pet myPet = new Pet("바둑이", "강아지", 3);
		
		System.out.println("<애완동물 정보>");
		
		System.out.println("이름 : " + myPet.name);
		System.out.println("종류 : " + myPet.type);
		System.out.println("나이 : " + myPet.age + "살");
		
		//myPet.color = "흰색";
		
		System.out.println("=======================");
		
		Pet Pet1 = new Pet("초코", "고양이");
		
		System.out.println("<첫 번째 애완동물 정보>");
		
		System.out.println("이름 : " + Pet1.name);
		System.out.println("종류 : " + Pet1.type);
		System.out.println("나이 : " + Pet1.age + "살");
		System.out.println("색상 : " + Pet1.color);
		
		System.out.println("=======================");
		
		Pet Pet2 = new Pet("망치", "강아지", "흰색", 3);
		
		System.out.println("<두 번째 애완동물 정보>");
		
		System.out.println("이름 : " + Pet2.name);
		System.out.println("종류 : " + Pet2.type);
		System.out.println("나이 : " + Pet2.age + "살");
		System.out.println("색상 : " + Pet2.color);
		
	}
}


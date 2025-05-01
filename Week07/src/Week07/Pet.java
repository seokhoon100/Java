package Week07;

public class Pet {

	String  name;
	String  type;
	String  color;
	int 		age;
	
	Pet(String name, String type)
	{
		this.name = name;
		this.type = type;
		this.age = 0;
		this.color = "미정";
	}

	Pet(String name, String type, int age)
	{
		this.name = name;
		this.type = type;
		this.age = 0;
	}
	
	Pet(String name, String type, String color, int age)
	{
		this.name = name;
		this.type = type;
		this.color = color;
		this.age = age;
		
	}
}
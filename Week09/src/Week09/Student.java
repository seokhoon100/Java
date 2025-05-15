package Week09;

public class Student {
	String name;
	int goga;
	int yonga;
	int suhac;
	
	public Student(String name, int goga, int yonga, int suhac) {
		this.name = name;
		this.goga = goga;
		this.yonga = yonga;
		this.suhac = suhac;
	}
	
	public int getTotal() {
		return goga + yonga + suhac;
	}
	
	public double getAve() {
		return getTotal() / 3.0;
	}
	
	public void printResult() {
        System.out.printf("%s : 총점 %d점, 평균 %.1f점\n", name, getTotal(), getAve());
    }
	
}
class Circle {
	protected int radius;
	public Circle(int r) { radius = r;}
}

double getArea(int radius) {
	return 3.14 * radius * radius;
}

public class Pizza extends Circle {
    private String name;
    public Pizza(String name, int radius) {
        super(radius);
        this.name = name;
    }
    
public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza obj = new Pizza("Pepperoni", 20);
		System.out.println("피자 이름 : " + "Pepperoni" )
		System.out.println("피자의 면적 : " + obj.getArea());

	}

}

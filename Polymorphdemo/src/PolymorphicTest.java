
public class PolymorphicTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shape;
		Square s = new Square(7);
		Circle c =  new Circle(3.5);
		
		shape = s;
		shape.area();
		shape = c;
		shape.area();

	}

}

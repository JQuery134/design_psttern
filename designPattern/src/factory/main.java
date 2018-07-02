package factory;

public class main {
	
	public static void main(String[] args) {
		Shape square = ShapeFactory.getShape("Square");
		square.draw();
		Shape circle = ShapeFactory.getShape("Circle");
		circle.draw();
	}

}

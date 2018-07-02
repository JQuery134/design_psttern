package abstractFactory;

public class ShapeFactory {

	public Shape getShape(String type) {
		if (type.equals("Square")) {
			return new Square();
		} else if (type.equals("Circle")) {
			return new Circle();
		} else {
			return null;
		}
	}

}

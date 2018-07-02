package factory;

public class ShapeFactory {

	public static Shape getShape(String type) {
		if (type.equals("Square")) {
			return new Square();
		} else if (type.equals("Circle")) {
			return new Circle();
		} else {
			return null;
		}
	}

}

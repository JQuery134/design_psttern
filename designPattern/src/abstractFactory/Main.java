package abstractFactory;

public class Main {
	public static void main(String[] args) {
		//获取工厂创建者
		FactoryBuilder factoryBuilder=new FactoryBuilder();
		ColorFactory colorFactory = factoryBuilder.getCloColorFactory();
		ShapeFactory shapeFactory = factoryBuilder.getShapeFactory();
		Color black = colorFactory.getColor("Black");
		Color red = colorFactory.getColor("Red");
		black.draw();
		red.draw();
		
		Shape square = shapeFactory.getShape("Square");
		Shape circle = shapeFactory.getShape("Circle");
		square.draw();
		circle.draw();
		
	}
}

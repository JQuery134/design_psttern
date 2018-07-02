package abstractFactory;

/**
 * 相当于进行一次聚合，将所有的工厂类管理起来
 * @author 包华杰
 * 
 * 2018年7月2日
 */
public class FactoryBuilder extends AbstractFactory {

	@Override
	public ColorFactory getCloColorFactory() {
		return new ColorFactory();
	}

	@Override
	public ShapeFactory getShapeFactory() {
		return new ShapeFactory();
	}

}

package abstractFactory;

public class ColorFactory{

	public Color getColor(String type){
		if(type.equals("Black")){
			return new Black();
		}else if("Red".equals(type)){
			return new Red();
		}else{
			return null;
		}
	}
}

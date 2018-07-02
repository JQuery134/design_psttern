package singleton.hungry;

import factory.main;

/**
 * 饿汉式，线程安全
 * @author 包华杰
 * 
 * 2018年7月2日
 */
public class SingleObject {
	
	private static SingleObject instance=new SingleObject();
	
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(SingleObject.getInstance().toString());
	}

}

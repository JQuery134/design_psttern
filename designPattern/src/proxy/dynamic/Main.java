package proxy.dynamic;

public class Main {
	public static void main(String[] args) {
		//目标对象
		InterfaceUser target=new UserDao();
		//原始的类型
		System.out.println(target.getClass());
		//代理对象
		InterfaceUser proxyInstance =(InterfaceUser) new ProxyFactory(target).getProxyInstance();
		//内存中动态生成的代理对象.class com.sun.proxy.$Proxy0
		System.out.println(proxyInstance.getClass());
		proxyInstance.save();
		proxyInstance.delete();
	}
}

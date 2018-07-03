package proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	private Object target;

	public ProxyFactory(Object target) {
		super();
		this.target = target;
	}

	public Object getProxyInstance() {
		InvocationHandler handler = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) {
				Object value = null;
				try {
					System.out.println("开启事务");
					value = method.invoke(target, args);
					System.out.println("提交事务");
				} catch (IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					e.printStackTrace();
				}
				return value;
			}
		};
		Object proxyObj = Proxy.newProxyInstance(target.getClass()
				.getClassLoader(), target.getClass().getInterfaces(), handler);
		return proxyObj;
	}
}

package singleton.lazy;

/**
 * 懒汉式，线程安全
 * @author 包华杰
 * 
 * 2018年7月2日
 */
public class SingleObjectSynchronized {
	private static SingleObjectSynchronized instance;

	private SingleObjectSynchronized() {
	}

	public static synchronized SingleObjectSynchronized getInstance() {
		if (instance == null) {
			instance = new SingleObjectSynchronized();
			return instance;
		} else {
			return instance;
		}
	}

}

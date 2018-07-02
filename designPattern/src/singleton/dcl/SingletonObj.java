package singleton.dcl;

/**
 * 双检锁/双重校验锁（DCL，即 double-checked locking）
 * @author 包华杰
 * 
 * 2018年7月2日
 */
public class SingletonObj {

	private volatile static SingletonObj instance;
	
	private SingletonObj(){}
	
	public static SingletonObj getInstance(){
		if(instance==null){
			synchronized (SingletonObj.class) {
				if(instance==null){
					instance=new SingletonObj();
				}
			}
		}
		return instance;
	}
}

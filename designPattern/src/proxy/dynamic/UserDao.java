package proxy.dynamic;

/**
 * 
 * @author 包华杰
 * 
 * 2018年7月3日
 */
public class UserDao implements InterfaceUser {
	
	@Override
	public void save() {
		System.out.println("保存");
	}
	
	@Override
	public void delete() {
		System.out.println("删除");
	}
	

}

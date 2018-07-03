package proxy.staticproxy;

/**
 * 代理类
 * @author 包华杰
 * 
 * 2018年7月3日
 */
public class UserDaoProxy implements InterfaceUser {
	private UserDao userDao;
	

	public UserDaoProxy() {
		super();
	}

	public UserDaoProxy(UserDao userDao) {
		super();
		this.userDao = userDao;
	}



	@Override
	public void save() {
		System.out.println("事务开始");
		userDao.save();
		System.out.println("事务结束");
	}

}

package proxy.app;

import proxy.CglibProxy;
import proxy.ProxyDao;

public class RunCglibProxy {
	public static void main(String[] args) {
		ProxyDao target=new ProxyDao();
		ProxyDao proxy=(ProxyDao) new CglibProxy(target).getProxyInstance();
		proxy.test();
	}
}

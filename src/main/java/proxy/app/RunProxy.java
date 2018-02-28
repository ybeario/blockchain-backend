package proxy.app;

import proxy.DynamicProxy;
import proxy.StaticProxy;
import proxy.ProxyDaoInterface;
import proxy.impl.ProxyDaoImpl;

public class RunProxy {
	public static void main(String[] args) {
		//静态代理
		ProxyDaoInterface userDao=new ProxyDaoImpl();
		StaticProxy userProxy=new StaticProxy(userDao);
		userProxy.test();
		System.out.println("------------");
		//动态代理
		ProxyDaoInterface dynamicProxy=(ProxyDaoInterface) new DynamicProxy(userDao).getProxyInstance();
		dynamicProxy.test();
	}
}

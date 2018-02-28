package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
	private Object target;
	public DynamicProxy(Object target) {
		this.target=target;
	}
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("pre-proxy");
				Object returnValue=method.invoke(target, args);
				System.out.println("after-proxy");
				return returnValue;
			}
		});
		
	}
}

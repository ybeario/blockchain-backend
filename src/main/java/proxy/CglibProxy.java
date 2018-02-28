package proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{
	private Object target;
	public CglibProxy(Object target) {
		this.target=target;
	}
	   //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();

    }
	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("pre-cglib");
		Object returnValue=method.invoke(target, args);
		System.out.println("after-cglib");
		return returnValue;
	}

}

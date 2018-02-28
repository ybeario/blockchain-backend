package proxy;

public class StaticProxy implements ProxyDaoInterface {
	private ProxyDaoInterface target;
	public StaticProxy(ProxyDaoInterface userDaoInterface) {
		this.target=userDaoInterface;
	}
	@Override
	public void test() {
		System.out.println("pre-proxy");
		target.test();
		System.out.println("after-proxy");
	}

}

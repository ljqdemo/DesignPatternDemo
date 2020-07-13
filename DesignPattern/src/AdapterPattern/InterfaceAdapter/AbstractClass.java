package AdapterPattern.InterfaceAdapter;
/**
 * 抽象类，默认去实现Interface4接口
 * 实现接口的方法 可以是空实现，也可以是，默认的实现
 * 具体的实现由调用时去重写
 * 
 * 相当于一个适配器
 * @author 29226
 *
 */
public abstract class AbstractClass implements Interface4 {

	@Override
	public void method1() {
		
	}

	@Override
	public void method2() {
	
		
	}

	@Override
	public void method3() {
		
		
	}

	@Override
	public void method4() {
		
	}

}

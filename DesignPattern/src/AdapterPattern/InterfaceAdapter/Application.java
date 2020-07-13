package AdapterPattern.InterfaceAdapter;
/**
 * 应用类（调用类）
 * @author 29226
 *
 */
public class Application {
	public static void main(String[] args) {
		/**
		 * 以匿名内部类的方式去调用抽象类
		 * 重写要去调用你的方法
		 */
		System.out.println("接口适配器模式！");
		new AbstractClass() {

			@Override
			public void method1() {
			System.out.println("我要调用的方法1");
				super.method1();
			}

			@Override
			public void method2() {
				System.out.println("我要调用的方法2");
				super.method2();
			}
			
			
		}.method1();
	}

}

package singleton;
/**
 * 饿汉式单例模式（静态块）
 * 
 * @author 29226
 *
 */
public class SingeltonTests02 {
	public static void main(String[] args) {
		/**
		 * 此方式保证了每次创建的对象都是同一个
		 * 也就是只有一个对象实例
		 * 输出的结果为true 和相同hashcode
		 * 即 s 和s1是相等的是同一个对象实例
		 */
		
		Single2 s=Single2.getInstance();
		Single2 s1=Single2.getInstance();
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}



class Single2 {
	//第一步私有化构造方法
	private Single2() {
		
	}
	//第二步定义静态的私有的对象实例
	private static Single2 instance;
	//第三步在静态代码块中实例化对象
	static {
		instance=new Single2();
	}
	//第四步提供一个公共静态的方法返回对象实例
	public static  Single2 getInstance() {
		return instance;
	}
	
	
}
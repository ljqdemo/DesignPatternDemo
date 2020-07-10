package singleton;
/**
 * 饿汉式单例模式（静态常量）
 * 存在内存的浪费的问题
 * 即对象在实例化后我们开发的过程中却没有用到该对象
 * 所以此时造成了内存的浪费
 * @author 29226
 *
 */
public class SingeltonTests01 {
	public static void main(String[] args) {
		/**
		 * 此方式保证了每次创建的对象都是同一个
		 * 也就是只有一个对象实例
		 * 输出的结果为true 和相同hashcode
		 * 即 s 和s1是相等的是同一个对象实例
		 */
		
		Single s=Single.getInstance();
		Single s1=Single.getInstance();
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}



class Single{
	//第一步私有化构造方法
	private Single() {
		
	}
	//第二步定义静态的私有的对象实例
	private static Single instance=new Single();
	//第三步提供一个公共静态的方法返回对象实例
	public static  Single getInstance() {
		return instance;
	}
	
	
}
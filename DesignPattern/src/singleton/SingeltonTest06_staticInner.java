package singleton;
/**
 *静态内部类  （线程安全，效率也比较高）
 * 此方式不会造成内存的浪费
 * 推荐使用
 * 
 *此方式是利用JVM类加载时候是同步的从而实现的同步控制
 *利用了当前类的加载不会导致静态内部类的加载从而实现懒加载
 * @author 29226
 *
 */
public class SingeltonTest06_staticInner {
		public static void main(String[] args) {
			System.out.println("静态内部类！ 实现单例~");
			Single6 s=Single6.getInstance();
			Single6 s1=Single6.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single6{
	//私有化构造方法
	private Single6() {
	}
	//定义静态的内部类
	private static class Instance {
		//定义静态常量对象实例
		private static final Single6 instance =new Single6();
	}
	//提供一个静态的公共的方法
	public static  Single6 getInstance() {
		return Instance.instance;
	}
}
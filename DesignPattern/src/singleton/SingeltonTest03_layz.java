package singleton;
/**
 * 懒汉式 写法 1（线程不安全）
 * 此方式不会造成内存的浪费
 * 当一个线程进入if条件判断的时候此时instance为空
 * 线程 1创建 实例
 * 但在线程1new 还没有结束的时候 线程2也来到了此时if判断instance任然为空
 * 此时线程2也开始 new intance 
 * 这样就违背了单例模式  
 * 
 * @author 29226
 *
 */
public class SingeltonTest03_layz {
		public static void main(String[] args) {
			System.out.println("懒汉式方式1 线程不安全！");
			Single3 s=Single3.getInstance();
			Single3 s1=Single3.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single3{
	//私有化构造方法
	private Single3() {
	}
	//定义静态对象
	private static Single3 instance;
	//提供一个静态的公共的方法
	public static  Single3 getInstance() {
		if(instance==null) {
			instance=new Single3();
		}
		return instance;
	}
}
package singleton;
/**
 * 懒汉式 写法 2（线程安全）
 * 此方式不会造成内存的浪费
 * 但是效率低下  
 * 因为加了synchronized就使得每次调用getInstance方法的时候都会进行同步
 * 而同步问题只会出现在第一创建实例的时候，所以当第一次创建完实例后其实就不用再同步
 *所以导致了效率比较低下
 *
 *开发的时候不推荐使用次方式
 * 
 * 
 * @author 29226
 *
 */
public class SingeltonTest04_layz2 {
		public static void main(String[] args) {
			System.out.println("懒汉式方式2 线程安全！");
			Single4 s=Single4.getInstance();
			Single4 s1=Single4.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single4{
	//私有化构造方法
	private Single4() {
	}
	//定义静态对象
	private static  Single4 instance;
	//提供一个静态的公共的方法加入synchronized 解决线程安全问题
	public static  synchronized Single4 getInstance() {
		if(instance==null) {
			instance=new Single4();
		}
		return instance;
	}
}
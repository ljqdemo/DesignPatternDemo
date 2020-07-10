package singleton;
/**
 * 双重检查 方式  （线程安全，效率也比较高）
 * 此方式不会造成内存的浪费
 * 推荐使用
 * 
 * @author 29226
 *
 */
public class SingeltonTest05_doubleCheck1 {
		public static void main(String[] args) {
			System.out.println("双重检查！ 实现单例~");
			Single5 s=Single5.getInstance();
			Single5 s1=Single5.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single5{
	//私有化构造方法
	private Single5() {
	}
	/**
	 * 定义静态对象加volatile 关键字修饰保证每次都将intance 更新到主存中
	 */
	private static volatile Single5 instance;
	//提供一个静态的公共的方法
	public static  Single5 getInstance() {
		if(instance==null) {
			//加入同步代码块和双重检查解决线程安全的问题和懒加载
			synchronized(Single5.class){
				if(instance==null) {
					instance=new Single5();
				}
			}
			
		}
		return instance;
	}
}
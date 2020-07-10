package singleton;
/**
 * 枚举实现单例模式  （线程安全，效率高，同时也能实现反序列化）
 * 推荐化使用
 * @author 29226
 *
 */
public class SingletonTest07_enumerate {
	
	public static void main(String[] args) {
		Single7 i=Single7.INSTANCE;
		Single7 i2=Single7.INSTANCE;
		i.sayOk();
		System.out.println(i==i2);
		System.out.println(i.hashCode());
		System.out.println(i2.hashCode());
		
	}
	
	/**
	 * 定义一个枚举类型
	 * @author 29226
	 *
	 */
	enum  Single7{
			INSTANCE;//属性
		public void sayOk() {
			System.out.println("ok!");
		}
	}
	
}

package AdapterPattrern.classAdapter;
/**
 * 适配器模式的类适配模式
 * @author 29226
 *
 */
public class Application {
		public static void main(String[] args) {
			System.out.println("~~类适配模式~~~");
			Phone phone=new Phone(new Adapter220To5v());
			phone.Recharge();
		}
}

package AdapterPattrern.ObjectAdater;
/**
 * 适配器模式的类适配模式
 * @author 29226
 *
 */
public class Application {
		public static void main(String[] args) {
			System.out.println("~~对象适配模式~~~");
			Phone phone=new Phone(new Adapter220To5v(new Voltage220V()));
			phone.Recharge();
		}
}

package AdapterPattrern.classAdapter;
/**
 * ������ģʽ��������ģʽ
 * @author 29226
 *
 */
public class Application {
		public static void main(String[] args) {
			System.out.println("~~������ģʽ~~~");
			Phone phone=new Phone(new Adapter220To5v());
			phone.Recharge();
		}
}
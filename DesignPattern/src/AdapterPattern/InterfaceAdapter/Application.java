package AdapterPattern.InterfaceAdapter;
/**
 * Ӧ���ࣨ�����ࣩ
 * @author 29226
 *
 */
public class Application {
	public static void main(String[] args) {
		/**
		 * �������ڲ���ķ�ʽȥ���ó�����
		 * ��дҪȥ������ķ���
		 */
		System.out.println("�ӿ�������ģʽ��");
		new AbstractClass() {

			@Override
			public void method1() {
			System.out.println("��Ҫ���õķ���1");
				super.method1();
			}

			@Override
			public void method2() {
				System.out.println("��Ҫ���õķ���2");
				super.method2();
			}
			
			
		}.method1();
	}

}

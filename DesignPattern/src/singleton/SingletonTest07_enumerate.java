package singleton;
/**
 * ö��ʵ�ֵ���ģʽ  ���̰߳�ȫ��Ч�ʸߣ�ͬʱҲ��ʵ�ַ����л���
 * �Ƽ���ʹ��
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
	 * ����һ��ö������
	 * @author 29226
	 *
	 */
	enum  Single7{
			INSTANCE;//����
		public void sayOk() {
			System.out.println("ok!");
		}
	}
	
}

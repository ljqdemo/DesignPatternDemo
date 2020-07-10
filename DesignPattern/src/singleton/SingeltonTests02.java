package singleton;
/**
 * ����ʽ����ģʽ����̬�飩
 * 
 * @author 29226
 *
 */
public class SingeltonTests02 {
	public static void main(String[] args) {
		/**
		 * �˷�ʽ��֤��ÿ�δ����Ķ�����ͬһ��
		 * Ҳ����ֻ��һ������ʵ��
		 * ����Ľ��Ϊtrue ����ͬhashcode
		 * �� s ��s1����ȵ���ͬһ������ʵ��
		 */
		
		Single2 s=Single2.getInstance();
		Single2 s1=Single2.getInstance();
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}



class Single2 {
	//��һ��˽�л����췽��
	private Single2() {
		
	}
	//�ڶ������徲̬��˽�еĶ���ʵ��
	private static Single2 instance;
	//�������ھ�̬�������ʵ��������
	static {
		instance=new Single2();
	}
	//���Ĳ��ṩһ��������̬�ķ������ض���ʵ��
	public static  Single2 getInstance() {
		return instance;
	}
	
	
}
package singleton;
/**
 * ����ʽ д�� 2���̰߳�ȫ��
 * �˷�ʽ��������ڴ���˷�
 * ����Ч�ʵ���  
 * ��Ϊ����synchronized��ʹ��ÿ�ε���getInstance������ʱ�򶼻����ͬ��
 * ��ͬ������ֻ������ڵ�һ����ʵ����ʱ�����Ե���һ�δ�����ʵ������ʵ�Ͳ�����ͬ��
 *���Ե�����Ч�ʱȽϵ���
 *
 *������ʱ���Ƽ�ʹ�ôη�ʽ
 * 
 * 
 * @author 29226
 *
 */
public class SingeltonTest04_layz2 {
		public static void main(String[] args) {
			System.out.println("����ʽ��ʽ2 �̰߳�ȫ��");
			Single4 s=Single4.getInstance();
			Single4 s1=Single4.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single4{
	//˽�л����췽��
	private Single4() {
	}
	//���徲̬����
	private static  Single4 instance;
	//�ṩһ����̬�Ĺ����ķ�������synchronized ����̰߳�ȫ����
	public static  synchronized Single4 getInstance() {
		if(instance==null) {
			instance=new Single4();
		}
		return instance;
	}
}
package singleton;
/**
 * ����ʽ����ģʽ����̬������
 * �����ڴ���˷ѵ�����
 * ��������ʵ���������ǿ����Ĺ�����ȴû���õ��ö���
 * ���Դ�ʱ������ڴ���˷�
 * @author 29226
 *
 */
public class SingeltonTests01 {
	public static void main(String[] args) {
		/**
		 * �˷�ʽ��֤��ÿ�δ����Ķ�����ͬһ��
		 * Ҳ����ֻ��һ������ʵ��
		 * ����Ľ��Ϊtrue ����ͬhashcode
		 * �� s ��s1����ȵ���ͬһ������ʵ��
		 */
		
		Single s=Single.getInstance();
		Single s1=Single.getInstance();
		System.out.println(s==s1);
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
	}

}



class Single{
	//��һ��˽�л����췽��
	private Single() {
		
	}
	//�ڶ������徲̬��˽�еĶ���ʵ��
	private static Single instance=new Single();
	//�������ṩһ��������̬�ķ������ض���ʵ��
	public static  Single getInstance() {
		return instance;
	}
	
	
}
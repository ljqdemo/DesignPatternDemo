package singleton;
/**
 *��̬�ڲ���  ���̰߳�ȫ��Ч��Ҳ�Ƚϸߣ�
 * �˷�ʽ��������ڴ���˷�
 * �Ƽ�ʹ��
 * 
 *�˷�ʽ������JVM�����ʱ����ͬ���ĴӶ�ʵ�ֵ�ͬ������
 *�����˵�ǰ��ļ��ز��ᵼ�¾�̬�ڲ���ļ��شӶ�ʵ��������
 * @author 29226
 *
 */
public class SingeltonTest06_staticInner {
		public static void main(String[] args) {
			System.out.println("��̬�ڲ��࣡ ʵ�ֵ���~");
			Single6 s=Single6.getInstance();
			Single6 s1=Single6.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single6{
	//˽�л����췽��
	private Single6() {
	}
	//���徲̬���ڲ���
	private static class Instance {
		//���徲̬��������ʵ��
		private static final Single6 instance =new Single6();
	}
	//�ṩһ����̬�Ĺ����ķ���
	public static  Single6 getInstance() {
		return Instance.instance;
	}
}
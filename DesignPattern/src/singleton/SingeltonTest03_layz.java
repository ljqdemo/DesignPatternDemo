package singleton;
/**
 * ����ʽ д�� 1���̲߳���ȫ��
 * �˷�ʽ��������ڴ���˷�
 * ��һ���߳̽���if�����жϵ�ʱ���ʱinstanceΪ��
 * �߳� 1���� ʵ��
 * �����߳�1new ��û�н�����ʱ�� �߳�2Ҳ�����˴�ʱif�ж�instance��ȻΪ��
 * ��ʱ�߳�2Ҳ��ʼ new intance 
 * ������Υ���˵���ģʽ  
 * 
 * @author 29226
 *
 */
public class SingeltonTest03_layz {
		public static void main(String[] args) {
			System.out.println("����ʽ��ʽ1 �̲߳���ȫ��");
			Single3 s=Single3.getInstance();
			Single3 s1=Single3.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single3{
	//˽�л����췽��
	private Single3() {
	}
	//���徲̬����
	private static Single3 instance;
	//�ṩһ����̬�Ĺ����ķ���
	public static  Single3 getInstance() {
		if(instance==null) {
			instance=new Single3();
		}
		return instance;
	}
}
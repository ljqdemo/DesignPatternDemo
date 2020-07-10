package singleton;
/**
 * ˫�ؼ�� ��ʽ  ���̰߳�ȫ��Ч��Ҳ�Ƚϸߣ�
 * �˷�ʽ��������ڴ���˷�
 * �Ƽ�ʹ��
 * 
 * @author 29226
 *
 */
public class SingeltonTest05_doubleCheck1 {
		public static void main(String[] args) {
			System.out.println("˫�ؼ�飡 ʵ�ֵ���~");
			Single5 s=Single5.getInstance();
			Single5 s1=Single5.getInstance();
			System.out.println(s==s1);
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
		}
}
class Single5{
	//˽�л����췽��
	private Single5() {
	}
	/**
	 * ���徲̬�����volatile �ؼ������α�֤ÿ�ζ���intance ���µ�������
	 */
	private static volatile Single5 instance;
	//�ṩһ����̬�Ĺ����ķ���
	public static  Single5 getInstance() {
		if(instance==null) {
			//����ͬ��������˫�ؼ�����̰߳�ȫ�������������
			synchronized(Single5.class){
				if(instance==null) {
					instance=new Single5();
				}
			}
			
		}
		return instance;
	}
}
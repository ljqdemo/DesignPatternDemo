package ProtoType;
/**
 * ���ڵ�ҵ���ǿ�¡5������ ���ֽ�tom ����1 ��ɫ ��ɫ
 * 
 * @author 29226
 *
 */
public class DeepClientApplication {
		public static void main(String[] args) throws CloneNotSupportedException {
			
			/**
			 * ʹ�ô˷�ʽ��ԭ��ģʽ�������
			 * ��conle�����Ķ���sheep2,sheep3,sheep4��frind����
			 * ��sheep��friend�����ǲ���ͬһ��
			 */
			DeepSheep sheep=new DeepSheep("tom", "1", "��ɫ");
			sheep.setFriend(new QuotedClass("Jre"));
			System.out.println("ԭ��ģʽ���һ��");
				DeepSheep DeepSheeep2=(DeepSheep) sheep.clone();
				DeepSheep DeepSheeep3=(DeepSheep) sheep.clone();
				DeepSheep DeepSheeep4=(DeepSheep) sheep.clone();
				/**
				 * �������Խ���ֵ�Ĵ���
				 * �������Խ��������Ĵ���
				 */
				System.out.println(DeepSheeep2);
				System.out.println(DeepSheeep3);
				System.out.println(DeepSheeep4);
			System.out.println("�������Խ��������Ĵ��� ,Ϊ��ͬ����");
			System.out.println("sheep:"+sheep.getFriend().hashCode());
			System.out.println("sheep2:"+DeepSheeep2.getFriend().hashCode());
			System.out.println("sheep3:"+DeepSheeep3.getFriend().hashCode());
			System.out.println("sheep4:"+DeepSheeep4.getFriend().hashCode());
		
		System.out.println("ԭ��ģʽ�������");
		DeepSheep deepSheep5=DeepSheeep2.clone2();
		DeepSheep deepSheep6=DeepSheeep2.clone2();
		DeepSheep deepSheep7=DeepSheeep2.clone2();
		DeepSheep deepSheep8=DeepSheeep2.clone2();
		System.out.println(deepSheep5);
		System.out.println(deepSheep6);
		System.out.println(deepSheep7);
	System.out.println("�������Խ��������Ĵ��� ,Ϊ��ͬ����");
	System.out.println("sheep:"+sheep.getFriend().hashCode());
	System.out.println("sheep5:"+deepSheep5.getFriend().hashCode());
	System.out.println("sheep6:"+deepSheep6.getFriend().hashCode());
	System.out.println("sheep7:"+deepSheep7.getFriend().hashCode());
		}
}

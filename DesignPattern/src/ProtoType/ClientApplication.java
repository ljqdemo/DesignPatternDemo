package ProtoType;
/**
 * ���ڵ�ҵ���ǿ�¡5������ ���ֽ�tom ����1 ��ɫ ��ɫ
 * 
 * @author 29226
 *
 */
public class ClientApplication {
		public static void main(String[] args) throws CloneNotSupportedException {
			
			/**
			 * ʹ�ô˷�ʽ��ԭ��ģʽ��ǳ������
			 * ��conle�����Ķ���sheep2,sheep3,sheep4��frind����
			 * ��sheep��friend������ͬһ��
			 */
			Sheep sheep=new Sheep("tom", "1", "��ɫ");
			sheep.setFriend(new Sheep("Jre", "2", "��ɫ"));
			System.out.println("ԭ��ģʽ");
				Sheep sheep2=(Sheep) sheep.clone();
				Sheep sheep3=(Sheep) sheep.clone();
				Sheep sheep4=(Sheep) sheep.clone();
				/**
				 * �������Խ���ֵ�Ĵ���
				 * �������Խ��������Ĵ���
				 */
				System.out.println(sheep2);
				System.out.println(sheep3);
				System.out.println(sheep4);
			System.out.println("�������Խ��������Ĵ��� ,Ϊͬһ������");
			System.out.println("sheep:"+sheep.getFriend().hashCode());
			System.out.println("sheep2:"+sheep2.getFriend().hashCode());
			System.out.println("sheep3:"+sheep3.getFriend().hashCode());
			System.out.println("sheep4:"+sheep4.getFriend().hashCode());
		}
}

package opc.improve;
/**
 * ��ʽ���Ų��ó�����+���󷽷��ķ�ʽ�����˿���ԭ��
 * ��ǿ�˴������չ��
 * ÿ��������һ���Ե�ͼ�β���Ҫȥ�޸�ʹ�÷���ֻҪ����һ���µ���
 * @author 29226
 *
 */
public class opc2 {
	public static void main(String[] args) {
		GriphicEdeit ge=new GriphicEdeit();
		ge.drow(new Cirle());
		ge.drow(new othershap());
		ge.drow(new zfx());
	}

}
/**
 *��ͼ����
 * @author 29226
 *
 */
//�����  [ʹ�÷�]
class GriphicEdeit{
	public void drow(shap s) {
		s.drow();
	}
	
	
}
/**�Ľ�Ϊ��һ��������
 * ����һ������ķ���
 * ͼ���� �����ͼ�ζ�Ҫ�̳�����
 * @author 29226
 *
 */
 abstract class  shap{
	public abstract void drow();
}
 
 
//Բ
class Cirle extends shap {
	@Override
	public void drow() {
		System.out.println("���ƣ�Բ");
	}
	
}
//������
class zfx extends shap{

	@Override
	public void drow() {
		System.out.println("���ƣ�������");
	}

	
	
}
	//��������ͼ�� 1
	class othershap extends shap{
		@Override
		public void drow() {
		System.out.println("��������ͼ��");
		}	
	}
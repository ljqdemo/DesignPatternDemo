package ocp;
/**
 * ��������������һ��ҵ�񻭳���ͬͼ��
 * ����һ:
 * �����ķ�����Ҫ��չһ���µ�ͼ�ε�ʱ���޸ıȽ϶�
 * ����û�����ؿ���ԭ��
 * ����ԭ�����Ҫ��ʹ�÷����Թر��޸Ķ��ṩ������
 * @author 29226
 *
 */
public class opc1 {
	public static void main(String[] args) {
		GriphicEdeit ge=new GriphicEdeit();
		ge.drow(new Cirle());
		ge.drow(new zfx());
		ge.drow(new othershap());
	}

}
/**
 *��ͼ����
 * @author 29226
 *
 */
//�����  [ʹ�÷�]
class GriphicEdeit{
	
	public void drow(shap sp) {
		if(sp.type==1) {
			drwoCrile();
		}else if(sp.type==2) {
			dorowzfx();
		}
		//���ӵĴ���3
		else if(sp.type==3) {
			dorowOther();
		}
			
	}
	//���ӵĴ���2 
	private void dorowOther() {
		//������ͼ��
		System.out.println("���ƣ�����ͼ��");
		
	}

	private void drwoCrile() {
		System.out.println("���ƣ�Բ");
		
	}

	private void dorowzfx() {
		System.out.println("���ƣ�������");
		
	}
	
}
/**
 * ͼ���� �����ͼ�ζ�Ҫ�̳�����
 * @author 29226
 *
 */
class shap{
	//���ͱ�ʶ
	int type;
}
//Բ
class Cirle extends shap {

	public Cirle() {
		this.type=1;
	}
	
}
//������
class zfx extends shap{

	public zfx() {
		this.type=2;
	}
	
}
	//��������ͼ�� ��1��
	class othershap extends shap{

		public othershap() {
			this.type=3;
		}	
	}
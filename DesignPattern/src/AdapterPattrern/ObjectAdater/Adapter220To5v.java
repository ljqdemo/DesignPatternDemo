package AdapterPattrern.ObjectAdater;
/**
 * �������������
 * ������������ͬ���Ƕ���������ģʽ
 * ���ø��ӷ��� �ϳɸ���ԭ��ľۺϷ�ʽ
 * ��������Ķ���ۺϵ���ǰ�Ķ�������
 * ͨ�����췽������setter����������г�ʼ��
 * @author 29226
 *
 */
public class Adapter220To5v implements Adapter1 {
	//��������Ķ���ۺϵ���ǰ�Ķ�������
	private Voltage220V  volage;
	
	//ͨ�����췽������setter����������г�ʼ��
	public Adapter220To5v(Voltage220V volage) {
		this.volage= volage;
	}


	@Override
	public int out5V() {
		 int src=volage.getVoltage();
			System.out.println("����ǰ��voltage:"+ src);
			int dts=src/44;
			System.out.println("������voltage:"+ dts);
				return dts;
	}

}

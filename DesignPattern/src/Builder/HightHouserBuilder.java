package Builder;
/**
 * ���彨����
 * @author 29226
 *
 */
public class HightHouserBuilder extends HouserBuilder {

	@Override
	public void BuildBaisc() {
		this.house.setBasic("120��");
		System.out.println("��¥�ĵػ�  120��");
		
	}

	@Override
	public void BuildWall() {
		System.out.println("��¥��ǽ��  20cm");
		this.house.setWall("20cm");
	}

	@Override
	public void BuildTop() {
		this.house.setTop("��¥�ݶ�");
		System.out.println("�����¥�ķ���");
		
	}
	
}

package Builder;
/**
 * ���彨����
 * @author 29226
 *
 */
public class CommentHouserBuilder extends HouserBuilder {

	@Override
	public void BuildBaisc() {
		this.house.setBasic("5��");
		System.out.println("������ͨ���ӵĵػ�  5��");
		
	}

	@Override
	public void BuildWall() {
		System.out.println("������ͨ���ӵ�ǽ��  10cm");
		this.house.setWall("10cm");
	}

	@Override
	public void BuildTop() {
		this.house.setTop("��ͨ�ݶ�");
		System.out.println("������ͨ���ӵķ���");
		
	}
	
}

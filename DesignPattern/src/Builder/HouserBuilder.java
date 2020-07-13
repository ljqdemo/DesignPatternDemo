package Builder;
/**
 * ��������
 * @author 29226
 *
 */
public abstract class HouserBuilder {
	protected House house =new House();
	
	//����ػ�
	public abstract void BuildBaisc();
	//����ǽ��
	public abstract void BuildWall();
	//���췿��
	public abstract void BuildTop();
	
	//�Żز�Ʒ
	public House GetResult() {
		return house;
	}
			
}

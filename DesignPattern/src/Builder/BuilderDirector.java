package Builder;
/**
 * ָ����
 * �ۺ�һ������Ľ�����
 * ҵ��ľ�����ôʵ�� ��ָ����ָ��
 * @author 29226
 *
 */
public class BuilderDirector {
	private HouserBuilder builder=null;
	
	//���췿��
	public House createHouse() {
		builder.BuildBaisc();
		builder.BuildWall();
		builder.BuildTop();
		return builder.GetResult();
	}
	//���췽ʽ�ۺ�
	public BuilderDirector(HouserBuilder builder) {
		super();
		this.builder = builder;
	}
	//setter�ۺ�
	public HouserBuilder getBuilder() {
		return builder;
	}
	public void setBuilder(HouserBuilder builder) {
		this.builder = builder;
	}
	
	
	
}

package Builder;
/**
 * 指挥者
 * 聚合一个抽象的建造者
 * 业务的具体怎么实现 由指挥者指定
 * @author 29226
 *
 */
public class BuilderDirector {
	private HouserBuilder builder=null;
	
	//建造房子
	public House createHouse() {
		builder.BuildBaisc();
		builder.BuildWall();
		builder.BuildTop();
		return builder.GetResult();
	}
	//构造方式聚合
	public BuilderDirector(HouserBuilder builder) {
		super();
		this.builder = builder;
	}
	//setter聚合
	public HouserBuilder getBuilder() {
		return builder;
	}
	public void setBuilder(HouserBuilder builder) {
		this.builder = builder;
	}
	
	
	
}

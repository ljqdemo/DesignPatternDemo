package Builder;
/**
 * 具体建造者
 * @author 29226
 *
 */
public class CommentHouserBuilder extends HouserBuilder {

	@Override
	public void BuildBaisc() {
		this.house.setBasic("5米");
		System.out.println("建造普通房子的地基  5米");
		
	}

	@Override
	public void BuildWall() {
		System.out.println("建造普通房子的墙面  10cm");
		this.house.setWall("10cm");
	}

	@Override
	public void BuildTop() {
		this.house.setTop("普通屋顶");
		System.out.println("建造普通房子的房顶");
		
	}
	
}

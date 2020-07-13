package Builder;
/**
 * 具体建造者
 * @author 29226
 *
 */
public class HightHouserBuilder extends HouserBuilder {

	@Override
	public void BuildBaisc() {
		this.house.setBasic("120米");
		System.out.println("高楼的地基  120米");
		
	}

	@Override
	public void BuildWall() {
		System.out.println("高楼的墙面  20cm");
		this.house.setWall("20cm");
	}

	@Override
	public void BuildTop() {
		this.house.setTop("高楼屋顶");
		System.out.println("建造高楼的房顶");
		
	}
	
}

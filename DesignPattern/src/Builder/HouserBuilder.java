package Builder;
/**
 * 抽象建造者
 * @author 29226
 *
 */
public abstract class HouserBuilder {
	protected House house =new House();
	
	//建造地基
	public abstract void BuildBaisc();
	//建造墙面
	public abstract void BuildWall();
	//建造房顶
	public abstract void BuildTop();
	
	//放回产品
	public House GetResult() {
		return house;
	}
			
}

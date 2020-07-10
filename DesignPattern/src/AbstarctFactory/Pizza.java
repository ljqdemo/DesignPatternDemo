package AbstarctFactory;
/***
 * 模拟一个披萨制作到订购的过程
 * @author 29226
 *
 */
public abstract class Pizza {
	
	public Pizza(String name) {
		setName(name);
	}
	private String name;
	//工艺一
	public abstract void prepare();
	//工艺二
	public void bake() {
		System.out.println(name+"正在bake！");
	}
	//工艺三
	public void cut() {
		System.out.println(name+"正在cut！");
	}
	//工艺四
		public void box() {
			System.out.println(name+"正在box！");
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

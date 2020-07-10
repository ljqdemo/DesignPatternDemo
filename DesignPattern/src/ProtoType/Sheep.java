package ProtoType;
/**
 * 绵羊对象
 * 调用Object.clone()实现对象的复制
 * 实现Cloneable 接口
 * 用此方式的实现原型模式为浅拷贝
 * 即当前的对象的属性拷贝的时候
 * 基本数据类型和String是进行的值的传递
 * 而类对象和数组等是进行引用的传递(A克隆出B后，A里面的对象属性和B里面的对象属性是同一个)
 * @author 29226
 *
 */
public class Sheep implements Cloneable{
	private String name;
	private String age;
	private String color;
	
	private Sheep friend;//申明一个对象属性
	
	public Sheep getFriend() {
		return friend;
	}
	public void setFriend(Sheep friend) {
		this.friend = friend;
	}
	public Sheep(String name, String age, String color) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", friend=" + friend + "]";
	}
	/**
	 * 	重写clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep=null;
		sheep=(Sheep) super.clone();
		return sheep;
	}
	
	

}

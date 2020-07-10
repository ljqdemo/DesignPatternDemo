package ProtoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
public class DeepSheep implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String color;
	
	private QuotedClass  friend;//申明一个对象属性
	
	public QuotedClass getFriend() {
		return friend;
	}
	public void setFriend(QuotedClass friend) {
		this.friend = friend;
	}
	public DeepSheep(String name, String age, String color) {
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
		return "DeepSheep [name=" + name + ", age=" + age + ", color=" + color + ", friend=" + friend + "]";
	}
	
	
	/**深拷贝方式一:
	 * 	重写clone方法
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//通过clone将基本数据类型进行值传递
		DeepSheep sheep=null;
		sheep=(DeepSheep) super.clone();
		//单独的进行引用数据类型的处理
		QuotedClass newfriendClass=(QuotedClass) sheep.getFriend().clone();
		sheep.setFriend(newfriendClass);
		return sheep;
	}
	
	/**
	 * 深拷贝方式2：通过序列化和反序列化的方式去实现
	 * 
	 */
	public DeepSheep clone2() {
		ByteArrayInputStream bis=null;
		ByteArrayOutputStream bos=null;
		ObjectInputStream    ois=null;
		ObjectOutputStream   oos=null;
		DeepSheep dsheep=null;//克隆对象
		try {
				//序列化
				bos=new ByteArrayOutputStream();
				oos=new ObjectOutputStream(bos);	
				oos.writeObject(this);//将当前的对象以对象流的方式输出
				//反序列化
				bis=new ByteArrayInputStream(bos.toByteArray());
				ois=new ObjectInputStream(bis);
				 dsheep=(DeepSheep) ois.readObject();
				return dsheep;
		} catch (Exception e) {
				e.printStackTrace();
		}finally {
			try {
				bos.close();
				bis.close();
				oos.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		return dsheep;
	}
}

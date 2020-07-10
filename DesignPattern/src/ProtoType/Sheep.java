package ProtoType;
/**
 * �������
 * ����Object.clone()ʵ�ֶ���ĸ���
 * ʵ��Cloneable �ӿ�
 * �ô˷�ʽ��ʵ��ԭ��ģʽΪǳ����
 * ����ǰ�Ķ�������Կ�����ʱ��
 * �����������ͺ�String�ǽ��е�ֵ�Ĵ���
 * ��������������ǽ������õĴ���(A��¡��B��A����Ķ������Ժ�B����Ķ���������ͬһ��)
 * @author 29226
 *
 */
public class Sheep implements Cloneable{
	private String name;
	private String age;
	private String color;
	
	private Sheep friend;//����һ����������
	
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
	 * 	��дclone����
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Sheep sheep=null;
		sheep=(Sheep) super.clone();
		return sheep;
	}
	
	

}

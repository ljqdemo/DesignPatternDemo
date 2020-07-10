package ProtoType;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

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
public class DeepSheep implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String age;
	private String color;
	
	private QuotedClass  friend;//����һ����������
	
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
	
	
	/**�����ʽһ:
	 * 	��дclone����
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//ͨ��clone�������������ͽ���ֵ����
		DeepSheep sheep=null;
		sheep=(DeepSheep) super.clone();
		//�����Ľ��������������͵Ĵ���
		QuotedClass newfriendClass=(QuotedClass) sheep.getFriend().clone();
		sheep.setFriend(newfriendClass);
		return sheep;
	}
	
	/**
	 * �����ʽ2��ͨ�����л��ͷ����л��ķ�ʽȥʵ��
	 * 
	 */
	public DeepSheep clone2() {
		ByteArrayInputStream bis=null;
		ByteArrayOutputStream bos=null;
		ObjectInputStream    ois=null;
		ObjectOutputStream   oos=null;
		DeepSheep dsheep=null;//��¡����
		try {
				//���л�
				bos=new ByteArrayOutputStream();
				oos=new ObjectOutputStream(bos);	
				oos.writeObject(this);//����ǰ�Ķ����Զ������ķ�ʽ���
				//�����л�
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

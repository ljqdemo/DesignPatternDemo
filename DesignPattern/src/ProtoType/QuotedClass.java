package ProtoType;

import java.io.Serializable;

/**
 * 被引用的对象也要实现序列化接口和Colonable 接口
 * @author 29226
 *
 */
public class QuotedClass implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	
	public QuotedClass(String name) {
		super();
		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}

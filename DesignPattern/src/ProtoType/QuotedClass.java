package ProtoType;

import java.io.Serializable;

/**
 * �����õĶ���ҲҪʵ�����л��ӿں�Colonable �ӿ�
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

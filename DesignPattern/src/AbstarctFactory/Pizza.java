package AbstarctFactory;
/***
 * ģ��һ�����������������Ĺ���
 * @author 29226
 *
 */
public abstract class Pizza {
	
	public Pizza(String name) {
		setName(name);
	}
	private String name;
	//����һ
	public abstract void prepare();
	//���ն�
	public void bake() {
		System.out.println(name+"����bake��");
	}
	//������
	public void cut() {
		System.out.println(name+"����cut��");
	}
	//������
		public void box() {
			System.out.println(name+"����box��");
		}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

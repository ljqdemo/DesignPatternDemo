package AdapterPattrern.ObjectAdater;

public class Phone {
	
	
	private  Adapter1 adapter;
	
	
	public Phone(Adapter1 adapter) {
		super();
		this.adapter = adapter;
	}


	//�ֻ��ĳ��ķ���
	public void Recharge() {
		if(adapter.out5V()==5) {
			System.out.println("��ѹΪ5V���Գ��");
		}else {
			System.out.println("��ѹ��ƥ�䲻�ܳ��");
		}
	} 

}

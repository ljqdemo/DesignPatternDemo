package AdapterPattrern.ObjectAdater;

public class Phone {
	
	
	private  Adapter1 adapter;
	
	
	public Phone(Adapter1 adapter) {
		super();
		this.adapter = adapter;
	}


	//手机的充电的方法
	public void Recharge() {
		if(adapter.out5V()==5) {
			System.out.println("电压为5V可以充电");
		}else {
			System.out.println("电压不匹配不能充电");
		}
	} 

}

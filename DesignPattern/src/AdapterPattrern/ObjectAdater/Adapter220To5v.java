package AdapterPattrern.ObjectAdater;
/**
 * 具体的适配器类
 * 与类适配器不同的是对象适配器模式
 * 采用更加符合 合成复用原则的聚合方式
 * 将被适配的对象聚合到当前的对象中来
 * 通过构造方法或者setter方法对其进行初始化
 * @author 29226
 *
 */
public class Adapter220To5v implements Adapter1 {
	//将被适配的对象聚合到当前的对象中来
	private Voltage220V  volage;
	
	//通过构造方法或者setter方法对其进行初始化
	public Adapter220To5v(Voltage220V volage) {
		this.volage= volage;
	}


	@Override
	public int out5V() {
		 int src=volage.getVoltage();
			System.out.println("适配前的voltage:"+ src);
			int dts=src/44;
			System.out.println("适配后的voltage:"+ dts);
				return dts;
	}

}

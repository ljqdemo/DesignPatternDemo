package AdapterPattrern.ObjectAdater;
/**
 * 220v的电压
 * 是被适配的类
 * @author 29226
 *
 */
public class Voltage220V {
	int Voltage=0;//电压
	public int getVoltage() {
		Voltage=220;
		System.out.println("输出电压："+Voltage);
		return Voltage;
	}
}

package AdapterPattrern.classAdapter;

public class Adapter220To5v extends Voltage220V implements Adapter1 {

	@Override
	public int out5V() {
		 int src=getVoltage();
			System.out.println("����ǰ��voltage:"+ src);
			int dts=src/44;
			System.out.println("������voltage:"+ dts);
				return dts;
	}

}

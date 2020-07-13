package AdapterPattrern.classAdapter;

public class Adapter220To5v extends Voltage220V implements Adapter1 {

	@Override
	public int out5V() {
		 int src=getVoltage();
			System.out.println("适配前的voltage:"+ src);
			int dts=src/44;
			System.out.println("适配后的voltage:"+ dts);
				return dts;
	}

}

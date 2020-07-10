package com.yc.singleresponsiblity;
/***
 * 方式二虽然解决了问题 遵守了单一指责的问题
 * 但是开销比较大==>方式三
 * @author 29226
 *
 */
public class SingleResponsibility2 {
	
	public static void main(String[] args) {
		RoadVehicle  rvehicel =new RoadVehicle();
		rvehicel.run("汽车！");
		rvehicel.run("摩托车！");
		AirVehicle airvehicel=new AirVehicle();
		airvehicel.run("飞机！");

}

}
class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在路上跑！");
		
	}
}
class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在天上跑！");
		
	}
}
class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在水里跑！");
		
	}
}
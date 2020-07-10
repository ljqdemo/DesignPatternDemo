package com.yc.singleresponsiblity;
/**
 * 此方法同样解决了问题
 * 虽然在类的层面上没有遵守单一指责原则
 * 但是在方法层面上遵守了单一指责原则
 * 而且在开销上更少！
 * @author 29226
 *
 */
public class SingleResonsibility3 {
	
	public static void main(String[] args) {
		Vehicle2  vehicel =new Vehicle2();
		vehicel.runRoad("汽车！");
		
		vehicel.runRoad("摩托车！");
		vehicel.runAir("飞机！");
		vehicel.runWater("轮船！");
	}

}
class Vehicle2{
	public void runRoad(String vehicle) {
		System.out.println(vehicle+"在路上跑！");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+"在天上跑！");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+"在水里跑！");
	}
}
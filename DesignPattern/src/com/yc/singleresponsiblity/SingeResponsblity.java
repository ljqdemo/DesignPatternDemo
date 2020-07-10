package com.yc.singleresponsiblity;

public class SingeResponsblity {
	public static void main(String[] args) {
		Vehicle  vehicel =new Vehicle();
		vehicel.run("汽车！");
		vehicel.run("摩托车！");
		vehicel.run("飞机！");
	}
}
/**
 * 这种方式出现了飞机在路上跑的bug
 * 一个类负责了多个的业务
 * @author 29226
 *
 */
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"在路上跑！");
		
	}
}
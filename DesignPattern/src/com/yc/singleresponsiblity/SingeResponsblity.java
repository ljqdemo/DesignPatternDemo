package com.yc.singleresponsiblity;

public class SingeResponsblity {
	public static void main(String[] args) {
		Vehicle  vehicel =new Vehicle();
		vehicel.run("������");
		vehicel.run("Ħ�г���");
		vehicel.run("�ɻ���");
	}
}
/**
 * ���ַ�ʽ�����˷ɻ���·���ܵ�bug
 * һ���ฺ���˶����ҵ��
 * @author 29226
 *
 */
class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"��·���ܣ�");
		
	}
}
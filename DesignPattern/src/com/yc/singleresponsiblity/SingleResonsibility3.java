package com.yc.singleresponsiblity;
/**
 * �˷���ͬ�����������
 * ��Ȼ����Ĳ�����û�����ص�һָ��ԭ��
 * �����ڷ��������������˵�һָ��ԭ��
 * �����ڿ����ϸ��٣�
 * @author 29226
 *
 */
public class SingleResonsibility3 {
	
	public static void main(String[] args) {
		Vehicle2  vehicel =new Vehicle2();
		vehicel.runRoad("������");
		
		vehicel.runRoad("Ħ�г���");
		vehicel.runAir("�ɻ���");
		vehicel.runWater("�ִ���");
	}

}
class Vehicle2{
	public void runRoad(String vehicle) {
		System.out.println(vehicle+"��·���ܣ�");
	}
	public void runAir(String vehicle) {
		System.out.println(vehicle+"�������ܣ�");
	}
	public void runWater(String vehicle) {
		System.out.println(vehicle+"��ˮ���ܣ�");
	}
}
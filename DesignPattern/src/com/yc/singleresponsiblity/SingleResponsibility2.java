package com.yc.singleresponsiblity;
/***
 * ��ʽ����Ȼ��������� �����˵�һָ�������
 * ���ǿ����Ƚϴ�==>��ʽ��
 * @author 29226
 *
 */
public class SingleResponsibility2 {
	
	public static void main(String[] args) {
		RoadVehicle  rvehicel =new RoadVehicle();
		rvehicel.run("������");
		rvehicel.run("Ħ�г���");
		AirVehicle airvehicel=new AirVehicle();
		airvehicel.run("�ɻ���");

}

}
class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"��·���ܣ�");
		
	}
}
class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"�������ܣ�");
		
	}
}
class WaterVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle+"��ˮ���ܣ�");
		
	}
}
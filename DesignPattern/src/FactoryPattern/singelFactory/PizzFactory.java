package FactoryPattern.singelFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PizzFactory {
		
	public  static Pizza getPizza( ) {
		Pizza pizza=null;
		String type="";
		while(true) {
				type=getType();
				if(type.equals("Chicken")) {
					pizza=new ChickenPizza("��������");
					pizza.prepare();
					pizza.bake();
					pizza.cut();
					pizza.box();		
				}else if(type.equals("Prawn")) {
					pizza=new ChickenPizza("��Ϻ����");
					pizza.prepare();
					pizza.bake();
					pizza.cut();
					pizza.box();
				}else {
					System.out.println("����ʧ��!");
					break;
				}
				
			}
		return pizza;
		
	}
	
	public static String getType() {
		System.out.println("������Ҫ������Pizza:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name="";
		try {
			 name=br.readLine();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return name;
	}
}

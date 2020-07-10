package FactoryMethon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LDOrderPizza extends OrderPizza {

	LDOrderPizza (){
		
	}
	
	@Override
	public Pizza CreatePizza() {
		Pizza pizza=null;
		String type=getType();
		if(type.equals("chichen")) {
			pizza=new LDChichenPizza();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}else if(type.equals("prawn")) {
			pizza =new LDParwnPizza2();
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}else {
			System.out.println("无此产品！");
		}
		
		
		return pizza;
	}
	
	public static String getType() {
		System.out.println("请输入要订购的Pizza:");
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

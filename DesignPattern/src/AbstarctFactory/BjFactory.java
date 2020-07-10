package AbstarctFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BjFactory implements AbstractFactory {

	@Override
	public Pizza CreatePizza() {
			Pizza pizza=null;
		
		while(true) {
			String type=getType();
			if(type.equals("chicken")) {
				pizza=new BJChichenPizza();
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else if(type.equals("prawn")) {
				pizza =new BJParwnPizza();
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("�޴˲�Ʒ��");
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

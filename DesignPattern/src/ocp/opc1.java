package ocp;
/**
 * 我们现在又这样一个业务画出不同图形
 * 方法一:
 * 这样的方法当要拓展一个新的图形的时候修改比较多
 * 而且没有遵守开闭原则
 * 开闭原则就是要对使用方而言关闭修改对提供方开放
 * @author 29226
 *
 */
public class opc1 {
	public static void main(String[] args) {
		GriphicEdeit ge=new GriphicEdeit();
		ge.drow(new Cirle());
		ge.drow(new zfx());
		ge.drow(new othershap());
	}

}
/**
 *画图的类
 * @author 29226
 *
 */
//这个是  [使用方]
class GriphicEdeit{
	
	public void drow(shap sp) {
		if(sp.type==1) {
			drwoCrile();
		}else if(sp.type==2) {
			dorowzfx();
		}
		//增加的代码3
		else if(sp.type==3) {
			dorowOther();
		}
			
	}
	//增加的代码2 
	private void dorowOther() {
		//画其他图形
		System.out.println("绘制：其他图形");
		
	}

	private void drwoCrile() {
		System.out.println("绘制：圆");
		
	}

	private void dorowzfx() {
		System.out.println("绘制：正方形");
		
	}
	
}
/**
 * 图形类 具体的图形都要继承自它
 * @author 29226
 *
 */
class shap{
	//类型标识
	int type;
}
//圆
class Cirle extends shap {

	public Cirle() {
		this.type=1;
	}
	
}
//正方形
class zfx extends shap{

	public zfx() {
		this.type=2;
	}
	
}
	//增加其他图形 【1】
	class othershap extends shap{

		public othershap() {
			this.type=3;
		}	
	}
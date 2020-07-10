package opc.improve;
/**
 * 方式二才采用抽象类+抽象方法的方式遵守了开闭原则
 * 增强了代码的拓展性
 * 每次新增加一个性的图形不需要去修改使用方而只要增加一个新的类
 * @author 29226
 *
 */
public class opc2 {
	public static void main(String[] args) {
		GriphicEdeit ge=new GriphicEdeit();
		ge.drow(new Cirle());
		ge.drow(new othershap());
		ge.drow(new zfx());
	}

}
/**
 *画图的类
 * @author 29226
 *
 */
//这个是  [使用方]
class GriphicEdeit{
	public void drow(shap s) {
		s.drow();
	}
	
	
}
/**改进为以一个抽象类
 * 定义一个抽象的方法
 * 图形类 具体的图形都要继承自它
 * @author 29226
 *
 */
 abstract class  shap{
	public abstract void drow();
}
 
 
//圆
class Cirle extends shap {
	@Override
	public void drow() {
		System.out.println("绘制：圆");
	}
	
}
//正方形
class zfx extends shap{

	@Override
	public void drow() {
		System.out.println("绘制：正方形");
	}

	
	
}
	//增加其他图形 1
	class othershap extends shap{
		@Override
		public void drow() {
		System.out.println("绘制其他图形");
		}	
	}
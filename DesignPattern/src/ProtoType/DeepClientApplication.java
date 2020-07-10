package ProtoType;
/**
 * 现在的业务是克隆5个绵阳 名字叫tom 年龄1 颜色 白色
 * 
 * @author 29226
 *
 */
public class DeepClientApplication {
		public static void main(String[] args) throws CloneNotSupportedException {
			
			/**
			 * 使用此方式的原型模式是深拷贝的
			 * 即conle出来的对象sheep2,sheep3,sheep4的frind对象
			 * 与sheep的friend对象是不是同一个
			 */
			DeepSheep sheep=new DeepSheep("tom", "1", "白色");
			sheep.setFriend(new QuotedClass("Jre"));
			System.out.println("原型模式深拷贝一：");
				DeepSheep DeepSheeep2=(DeepSheep) sheep.clone();
				DeepSheep DeepSheeep3=(DeepSheep) sheep.clone();
				DeepSheep DeepSheeep4=(DeepSheep) sheep.clone();
				/**
				 * 基本属性进行值的传递
				 * 对象属性进行索引的传递
				 */
				System.out.println(DeepSheeep2);
				System.out.println(DeepSheeep3);
				System.out.println(DeepSheeep4);
			System.out.println("对象属性进行索引的传递 ,为不同对象");
			System.out.println("sheep:"+sheep.getFriend().hashCode());
			System.out.println("sheep2:"+DeepSheeep2.getFriend().hashCode());
			System.out.println("sheep3:"+DeepSheeep3.getFriend().hashCode());
			System.out.println("sheep4:"+DeepSheeep4.getFriend().hashCode());
		
		System.out.println("原型模式深拷贝二：");
		DeepSheep deepSheep5=DeepSheeep2.clone2();
		DeepSheep deepSheep6=DeepSheeep2.clone2();
		DeepSheep deepSheep7=DeepSheeep2.clone2();
		DeepSheep deepSheep8=DeepSheeep2.clone2();
		System.out.println(deepSheep5);
		System.out.println(deepSheep6);
		System.out.println(deepSheep7);
	System.out.println("对象属性进行索引的传递 ,为不同对象");
	System.out.println("sheep:"+sheep.getFriend().hashCode());
	System.out.println("sheep5:"+deepSheep5.getFriend().hashCode());
	System.out.println("sheep6:"+deepSheep6.getFriend().hashCode());
	System.out.println("sheep7:"+deepSheep7.getFriend().hashCode());
		}
}

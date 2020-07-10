package ProtoType;
/**
 * 现在的业务是克隆5个绵阳 名字叫tom 年龄1 颜色 白色
 * 
 * @author 29226
 *
 */
public class ClientApplication {
		public static void main(String[] args) throws CloneNotSupportedException {
			
			/**
			 * 使用此方式的原型模式是浅拷贝的
			 * 即conle出来的对象sheep2,sheep3,sheep4的frind对象
			 * 与sheep的friend对象是同一个
			 */
			Sheep sheep=new Sheep("tom", "1", "白色");
			sheep.setFriend(new Sheep("Jre", "2", "黑色"));
			System.out.println("原型模式");
				Sheep sheep2=(Sheep) sheep.clone();
				Sheep sheep3=(Sheep) sheep.clone();
				Sheep sheep4=(Sheep) sheep.clone();
				/**
				 * 基本属性进行值的传递
				 * 对象属性进行索引的传递
				 */
				System.out.println(sheep2);
				System.out.println(sheep3);
				System.out.println(sheep4);
			System.out.println("对象属性进行索引的传递 ,为同一个对象");
			System.out.println("sheep:"+sheep.getFriend().hashCode());
			System.out.println("sheep2:"+sheep2.getFriend().hashCode());
			System.out.println("sheep3:"+sheep3.getFriend().hashCode());
			System.out.println("sheep4:"+sheep4.getFriend().hashCode());
		}
}

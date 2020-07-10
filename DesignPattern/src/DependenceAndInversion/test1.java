package DependenceAndInversion;
/**
 * 现在又这样一个发消息的业务
 * 人来接受各种不同的消息
 * 分析:这种方式虽然简单容易实现 但是程序的拓展性不好
 * 当我要换一种方式接手消息的时候此时要通过重载的方式去实现
 *
 * @author 29226
 *
 */


public class test1 {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.resive(new Email());
	}

		 
}
class Email{
	public String say() {
		return "Emai is saying !";
	}
}

class Person{
	public void resive(Email email) {
		System.out.println(email.say());
	}
}

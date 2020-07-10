package DependenceAndInversion;
/**
 * 对test的改进
 * 通过接口依赖的方式
 *  遵守依赖倒置的原则
 *  这样做使得我们的程序在拓张的时候不用去修改具体的Person类
 *  而只要去修改接口，和添加接口的实现类
 *  程序的弹性合伸缩性更强
 * 
 *
 * @author 29226
 *
 */
public class test2 {
	
	public static void main(String[] args) {
		Person2 p=new Person2();
		p.resive(new Email2());
		p.resive(new WX());
	}

}

//发消息接口
interface SendMsg{
	public String send();
}

class Email2 implements SendMsg{

	@Override
	public String send() {
		return "Email is sending: hello";
	}
	
}
class WX implements SendMsg{

	@Override
	public String send() {
		return "WX is sending: hello";
	}
	
}
class Person2{
	public void resive(SendMsg s) {
		System.out.println(s.send());
	}
}
package DependenceAndInversion;
/**
 * ��test�ĸĽ�
 * ͨ���ӿ������ķ�ʽ
 *  �����������õ�ԭ��
 *  ������ʹ�����ǵĳ��������ŵ�ʱ����ȥ�޸ľ����Person��
 *  ��ֻҪȥ�޸Ľӿڣ�����ӽӿڵ�ʵ����
 *  ����ĵ��Ժ������Ը�ǿ
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

//����Ϣ�ӿ�
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
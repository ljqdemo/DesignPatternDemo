package DependenceAndInversion;
/**
 * ����������һ������Ϣ��ҵ��
 * �������ܸ��ֲ�ͬ����Ϣ
 * ����:���ַ�ʽ��Ȼ������ʵ�� ���ǳ������չ�Բ���
 * ����Ҫ��һ�ַ�ʽ������Ϣ��ʱ���ʱҪͨ�����صķ�ʽȥʵ��
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

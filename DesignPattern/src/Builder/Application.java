package Builder;

public class Application {
	public static void main(String[] args) {
		CommentHouserBuilder builder=new CommentHouserBuilder();
		HightHouserBuilder builder2=new HightHouserBuilder();
		BuilderDirector d=new BuilderDirector(builder2);
		d.createHouse();
		
		System.out.println("======JDKÔ´Âë·ÖÎö=========");
		StringBuilder stringBuilder=new StringBuilder("Hello  JDK");
		System.out.println(stringBuilder);
	}
}

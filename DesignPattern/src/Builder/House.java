package Builder;
//��Ʒ
public class House {
	private String Basic;//�ػ�
	private String Wall  ;//ǽ
	private String top; //����
	
	@Override
	public String toString() {
		return "House [Basic=" + Basic + ", Wall=" + Wall + ", top=" + top + "]";
	}
	public String getBasic() {
		return Basic;
	}
	public void setBasic(String basic) {
		Basic = basic;
	}
	public String getWall() {
		return Wall;
	}
	public void setWall(String wall) {
		Wall = wall;
	}
	public String getTop() {
		return top;
	}
	public void setTop(String top) {
		this.top = top;
	}
	
}

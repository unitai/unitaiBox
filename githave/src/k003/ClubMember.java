package k003;

public class ClubMember extends Student{
	ClubMember(String x, int y, String z, String a,String b) {
		super(x, y, z, a);
		club=b;
	}

	String club; //クラブ名

	@Override
	public void print(){
		super.print();
		System.out.println("クラブ名:"+club);
	}
}

package k003;

public class Teacher extends Person{
	Teacher(String x, int y, String z,String a) {
		super(x, y, z);
		depertment=a;
	}

	String depertment; //学科

	@Override
	public void print(){
		super.print();
		System.out.println("学科："+depertment);
	}

}

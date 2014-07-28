package k003;

public class Student extends Person{
	Student(String x, int y, String z, String a) {
		super(x, y, z);
		clazz=a;
	}

	String clazz; //クラス名

	@Override
	public void print(){
		super.print();
		System.out.println("クラス名:"+clazz);
	}

}
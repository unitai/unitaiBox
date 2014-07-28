package k003;

public class Person {
	String name;
	int age;
	String addres;

	public void print(){
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
		System.out.println("住所："+addres);
	}

	Person(String x,int y,String z){
		name =x;
		age = y;
		addres =z;
	}

}



package k003;
import java.util.ArrayList;

public class Riyou {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();

		persons.add(new Person("中島寿", 19, "インド"));
		persons.add(new Student("明智光秀",54,"美濃","1G1"));
		persons.add(new Teacher("豊臣秀吉",61,"尾張","ヒト科"));
		persons.add(new ClubMember("真田信繁",48,"信濃" ,"1G1","真田部"));
		
		for(Person person : persons){
			person.print();
			System.out.println();
		}

	}

}

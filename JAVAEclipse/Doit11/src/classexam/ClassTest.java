package classexam;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class pClass3 = Class.forName("java.lang.String");
		System.out.println(pClass3.getName());
		
		Person p = new Person();
		
		Class pClass = Class.forName("classexam.Person");
		
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p);
		System.out.println(p2);
	}

}

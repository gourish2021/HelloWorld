package inheritance1;

public class Hello {

	public static void main(String[] args) {
		
		Person john =new Person();
		System.out.println(john);
		
		
	Person pooja = new Person("pooja", 25,"FEmale");
	System.out.println(pooja);
	
	pooja setAge(30);
	System.out.println();

	}

}

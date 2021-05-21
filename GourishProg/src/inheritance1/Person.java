package inheritance1;

public class Person {
	private String name ;
	private int age;
	private String gender;
	
	
 public Person() {
		this.name = name ="john deo";
		this.age = age=25;
		this.gender = "male";
		
	}

public Person(String name, int age, String gender) {
	this.name = name;
	this.age = age;
	this.gender = gender;
}

public boolean setAge(int age) {
	if(age >= 0 && <= 100) {
	this.age = age;
	return true;
}
	return false;

public String getName() {
		return name;
	}
public int getAge() {
	return age;
}



public  String getGender() {
		return gender;
	}

@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
}

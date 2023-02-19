class Parent {
	String name;
	int age;
	
	Parent(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Hello " + name + ". You are " + age + " years old");
	}
}

class Child extends Parent{
	int grade;
	
	Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}	
	
	void display() {
		super.display();
		System.out.println(name + " is in grade " + grade);
	}
}


public class test  {
	public static void main(String[] args) {
		Parent p1 = new Parent("Karen", 42);
		p1.display();
		
		Child c1 = new Child("Ron", 12, 5);
		c1.display();
	}
}

class Employee {
	void display() {
		System.out.println("Name of class is Employee.");
	}

    void calcSalary() {
        System.out.println("Salary of Employee is 10000");
    }
}

class Engineer extends Employee {
    void calcSalary(){ 
         System.out.println("Salary of Engineer is 20000");
    }

} 

public class Day7_2_Ex5_LMS {
	public static void main(String args[]) {
	     Engineer e = new Engineer();
	     e.display();
	     e.calcSalary();
	}

}

/*
Name of class is Employee.
Salary of Engineer is 20000
*/
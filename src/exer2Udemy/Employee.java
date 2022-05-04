package exer2Udemy;

public class Employee {
	String name;
	double grossSalary;
	double tax;




	

	public double netSalary() {
		return grossSalary - tax;
	}

	public void increaseSalary(double percentage) {
		grossSalary+=this.grossSalary*percentage/100;
		
	}
	
	public String toString() {
		return  this.name + ", $ " + netSalary();
	}

}

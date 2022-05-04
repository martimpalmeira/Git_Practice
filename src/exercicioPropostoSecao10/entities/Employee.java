package exercicioPropostoSecao10.entities;

public class Employee {
	private String name;
	private String id;
	private double salary;

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void increaseSalary(double salary) {
		this.salary += salary;
	}

	public String toString() {
		return this.id + ", " + this.name + ", " + this.salary;
	}

	public String getId() {
		return id;
	}
}

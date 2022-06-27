package exercSecao13.exerc1.entities;

import java.util.ArrayList;

public class Worker {

	private String name;

	private WorkerLevel level;

	private Double baseSalary;
	
	private Department department;

	private ArrayList<HourContract> contracts;

	public Worker() {

	}
	
	

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
		contracts = new ArrayList<HourContract>();
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	

	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}

	@SuppressWarnings("deprecation")
	public Double income(Integer year, Integer month) {
		Double income = this.baseSalary;

		for (HourContract contract : this.contracts) {
			if (contract.getDate().getYear() == year && contract.getDate().getMonth() == month) {
				income += contract.totalValue();
			}
		}

		return income;
	}

}

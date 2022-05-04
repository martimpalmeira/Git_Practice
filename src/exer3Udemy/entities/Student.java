package exer3Udemy.entities;

public class Student {
	private String name;
	private double testGrade1;
	private double testGrade2;
	private double testGrade3;
	
	public double calculateFinalGrade() {
		return testGrade1 + testGrade2 + testGrade3;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setTestGrade1(double testGrade1) {
		this.testGrade1 = testGrade1;
	}

	public void setTestGrade2(double testGrade2) {
		this.testGrade2 = testGrade2;
	}

	public void setTestGrade3(double testGrade3) {
		this.testGrade3 = testGrade3;
	}

	public boolean didPass() {
		if(calculateFinalGrade()>=60) {
			return true;
		}else {
			return false;
		}
	}
	
	public double missingPoints() {
		return 60 - calculateFinalGrade();
	}
}

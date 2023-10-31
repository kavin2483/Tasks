package HLinheritance;

public class Employee extends Person 
{
	private float salary;
	private String dept;
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", dept=" + dept + ", getSalary()=" + getSalary() + ", getDept()="
				+ getDept() + ", getName()=" + getName() + ", getCity()=" + getCity() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

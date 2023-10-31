package HLinheritance;

public class Student extends Employee
{
	private float percentage;
	private String cls;
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getCls() {
		return cls;
	}
	public void setCls(String cls) {
		this.cls = cls;
	}
	@Override
	public String toString() {
		return "Student [percentage=" + percentage + ", cls=" + cls + ", getPercentage()=" + getPercentage()
				+ ", getCls()=" + getCls() + ", getSalary()=" + getSalary() + ", getDept()=" + getDept()
				+ ", toString()=" + super.toString() + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}

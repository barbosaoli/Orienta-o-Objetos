package model;

/**
 * Estender(Heran�a) ao Empregado da classe pai(Person)
 * @author Lucas & Gustavo
 * @version 1.0 (Abril 2022)
 */
public class Employee extends Person {
	private double salary;
	private String address;

	/**
	 * Constructor de Employee
	 * @param name
	 * @param address
	 * @param salary
	 * @param cPF
	 * @param numID
	 * @param numTel
	 */
	public Employee(String name,String address, double salary,String cPF, int numID,Telefone numTel) {
		super(name, numID, cPF, numTel);
		this.salary = salary;
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalario(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	} 

	
	
}
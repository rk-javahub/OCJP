package Demo;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Employee1 {
	private long id;
	private int age;
	private String name;
	private double salary;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class ListOfObjectArrayDemo {

	public static void main(String[] args) {
		Employee1 e1 = new Employee1();
		e1.setId(1);
		e1.setAge(27);
		e1.setName("Rohit");
		e1.setSalary(50000);

		Employee1 e2 = new Employee1();
		e2.setId(2);
		e2.setAge(26);
		e2.setName("Sachin");
		e2.setSalary(40000);

		Object[] obj = new Object[10];
		obj[1] = e1;
		obj[2] = e2;

		List<Object[]> employeeObjects = new ArrayList<Object[]>();
		employeeObjects.add(obj);

		List<Employee1> employees = new ArrayList<Employee1>();

		// Under construction
		for (Object[] employeeObject : employeeObjects) {
			Employee1 employee = new Employee1();
			long id = ((BigInteger) employeeObject[0]).longValue();
			int age = (int) employeeObject[1];
			String name = (String) employeeObject[2];
			float salary = (float) employeeObject[3];
			employee.setId(id);
			employee.setName(name);
			employee.setAge(age);
			employee.setSalary(salary);
			employees.add(employee);
		}
		System.out.println(employees);

	}

}

package Demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class Employee {
	private int empId;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public int hashCode() {
		System.out.println("In hashcode");
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		return true;
	}

}

class Department {
	private int deptId;
	private String deptName;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}

public class TestCollection {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpId(1);
		emp1.setEmpName("Rohit");

		Department dept = new Department();
		dept.setDeptId(123456);
		dept.setDeptName("Development");

		Employee emp2 = new Employee();
		emp1.setEmpId(22);
		emp1.setEmpName("Sachin");

		Department dept1 = new Department();
		dept.setDeptId(123455);
		dept.setDeptName("Poduction");

		Map<Employee, Department> hm = new HashMap<Employee, Department>();
		hm.put(emp1, dept);
		hm.put(emp2, dept1);

		Set<?> s = hm.entrySet();

		for (Entry<Employee, Department> entry : hm.entrySet()) {

			Employee e = entry.getKey();
			Department d = entry.getValue();
			System.out.println(e.getEmpId() + "---" + e.getEmpName());
			System.out.println(d.getDeptId() + "---" + d.getDeptName());

			System.out.println(" ");

		}

	}

}

/**
 * 
 */
package com.awcsoftware.employee.dto;

/**
 * @author Pratik
 *
 */
public class Employee {
	private int eid;
	private String ename;
	private float esalary;
	private Address address;
	public Employee() {
	}
	public Employee(int eid, String ename, float esalary,Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.address=address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + Float.floatToIntBits(esalary);
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
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (Float.floatToIntBits(esalary) != Float.floatToIntBits(other.esalary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + "]";
	}
		
}

package com.awcsoftware.employee.dto;

public class Address {
	private String houseNo;
	private String locality;
	private long pincode;
	public Address() {
	}
	public Address(String houseNo, String locality, long pincode) {
		super();
		System.out.println("Address Cons.");
		this.houseNo = houseNo;
		this.locality = locality;
		this.pincode = pincode;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((houseNo == null) ? 0 : houseNo.hashCode());
		result = prime * result + ((locality == null) ? 0 : locality.hashCode());
		result = prime * result + (int) (pincode ^ (pincode >>> 32));
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
		Address other = (Address) obj;
		if (houseNo == null) {
			if (other.houseNo != null)
				return false;
		} else if (!houseNo.equals(other.houseNo))
			return false;
		if (locality == null) {
			if (other.locality != null)
				return false;
		} else if (!locality.equals(other.locality))
			return false;
		if (pincode != other.pincode)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", pincode=" + pincode + "]";
	}
	
}

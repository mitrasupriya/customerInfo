package com.customer.customerInfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	private String cust_Code;
	private String cust_Name;
	private char cust_City;
	private String working_Area;
	private String cust_Country;
	private Integer grade;
	private Long opening_Amt;
	private Long receive_Amt;
	private Long payment_Amt;
	private Long outstanding_Amt;
	private String agent_Code;
	
	public Customer() {
		
	}
	public String getCust_Code() {
		return cust_Code;
	}
	public void setCust_Code(String cust_Code) {
		this.cust_Code = cust_Code;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public char getCust_City() {
		return cust_City;
	}
	public void setCust_City(char cust_City) {
		this.cust_City = cust_City;
	}
	public String getWorking_Area() {
		return working_Area;
	}
	public void setWorking_Area(String working_Area) {
		this.working_Area = working_Area;
	}
	public String getCust_Country() {
		return cust_Country;
	}
	public void setCust_Country(String cust_Country) {
		this.cust_Country = cust_Country;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Long getOpening_Amt() {
		return opening_Amt;
	}
	public void setOpening_Amt(Long opening_Amt) {
		this.opening_Amt = opening_Amt;
	}
	public Long getReceive_Amt() {
		return receive_Amt;
	}
	public void setReceive_Amt(Long receive_Amt) {
		this.receive_Amt = receive_Amt;
	}
	public Long getPayment_Amt() {
		return payment_Amt;
	}
	public void setPayment_Amt(Long payment_Amt) {
		this.payment_Amt = payment_Amt;
	}
	public Long getOutstanding_Amt() {
		return outstanding_Amt;
	}
	public void setOutstanding_Amt(Long outstanding_Amt) {
		this.outstanding_Amt = outstanding_Amt;
	}
	public String getAgent_Code() {
		return agent_Code;
	}
	public void setAgent_Code(String agent_Code) {
		this.agent_Code = agent_Code;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((agent_Code == null) ? 0 : agent_Code.hashCode());
		result = prime * result + cust_City;
		result = prime * result + ((cust_Code == null) ? 0 : cust_Code.hashCode());
		result = prime * result + ((cust_Country == null) ? 0 : cust_Country.hashCode());
		result = prime * result + ((cust_Name == null) ? 0 : cust_Name.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((opening_Amt == null) ? 0 : opening_Amt.hashCode());
		result = prime * result + ((outstanding_Amt == null) ? 0 : outstanding_Amt.hashCode());
		result = prime * result + ((payment_Amt == null) ? 0 : payment_Amt.hashCode());
		result = prime * result + ((receive_Amt == null) ? 0 : receive_Amt.hashCode());
		result = prime * result + ((working_Area == null) ? 0 : working_Area.hashCode());
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
		Customer other = (Customer) obj;
		if (agent_Code == null) {
			if (other.agent_Code != null)
				return false;
		} else if (!agent_Code.equals(other.agent_Code))
			return false;
		if (cust_City != other.cust_City)
			return false;
		if (cust_Code == null) {
			if (other.cust_Code != null)
				return false;
		} else if (!cust_Code.equals(other.cust_Code))
			return false;
		if (cust_Country == null) {
			if (other.cust_Country != null)
				return false;
		} else if (!cust_Country.equals(other.cust_Country))
			return false;
		if (cust_Name == null) {
			if (other.cust_Name != null)
				return false;
		} else if (!cust_Name.equals(other.cust_Name))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (opening_Amt == null) {
			if (other.opening_Amt != null)
				return false;
		} else if (!opening_Amt.equals(other.opening_Amt))
			return false;
		if (outstanding_Amt == null) {
			if (other.outstanding_Amt != null)
				return false;
		} else if (!outstanding_Amt.equals(other.outstanding_Amt))
			return false;
		if (payment_Amt == null) {
			if (other.payment_Amt != null)
				return false;
		} else if (!payment_Amt.equals(other.payment_Amt))
			return false;
		if (receive_Amt == null) {
			if (other.receive_Amt != null)
				return false;
		} else if (!receive_Amt.equals(other.receive_Amt))
			return false;
		if (working_Area == null) {
			if (other.working_Area != null)
				return false;
		} else if (!working_Area.equals(other.working_Area))
			return false;
		return true;
	}
	
	
}

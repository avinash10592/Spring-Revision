package com.practice.api;

public class Product {

	int pid;
	String pname;
	double price;
	double tax;
	double finalprice;

	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}

}

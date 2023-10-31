package day6;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;

import day3.Pizza;

public class Bill {
	private int billNo;
	private String custName;
	private Date date;
	private int total;
	private Vector<Pizza> pizza;
	public Bill(int billNo, String custName, Date date, int total, Vector<Pizza> pizza) {
		super();
		this.billNo = billNo;
		this.custName = custName;
		this.date = date;
		this.total = total;
		this.pizza = pizza;
	}
	public int getBillNo() {
		return billNo;
	}
	public String getCustName() {
		return custName;
	}
	public Date getDate() {
		return date;
	}
	public int getTotal() {
		return total;
	}
	public Vector<Pizza> getPizza() {
		return pizza;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void setPizza(Vector<Pizza> pizza) {
		this.pizza = pizza;
	}
//	public void getCost() {
//		int total1 = pizza.stream(
//	}
	public String toString() {
		SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
		String date1 = ft.format(date);
		return "Bill No: "+billNo+"\nDate: "+date1+"\nCustomer Name: "
				+custName+"\nPizza: "+pizza+"\nTotal: "+total;
	}
}

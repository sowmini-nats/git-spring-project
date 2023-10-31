package day4;

import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Bill {
	private int billNo;
	private String custName; 
	private Date date; 
	private int total; 
	private String[] items;
	public Bill(int billNo, String custName, Date date, int total, String[] items) {
		this.billNo = billNo;
		this.custName = custName;
		this.date = date;
		this.total = total;
		this.items = items;
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
	public String[] getItems() {
		return items;
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
	public void setItems(String[] items) {
		this.items = items;
	}
	public String toString() {
		SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
		String date1 = ft.format(date);
		return "Bill No: "+billNo+"\nDate: "+date1+"\nCustomer Name: "
				+custName+"\nItems: "+Arrays.toString(items)+"\nTotal: "+total;
	}
	
}

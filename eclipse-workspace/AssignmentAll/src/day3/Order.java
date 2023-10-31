package day3;

import java.text.SimpleDateFormat;
import java.util.Date;
import pizzahut.Deliverable;

public class Order implements Deliverable{
	private int orderNo ;
	private Date orderDate;
	private int cost;
	private String custName;
	private String custAddress;
	private int approxDistance;
	Order(int orderNo, Date orderDate, int cost, String custName, String custAddress, int approxDistance) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.cost = cost;
		this.custName = custName;
		this.custAddress = custAddress;
		this.approxDistance = approxDistance;
	}
	@Override
	public boolean delivery() {
		// TODO Auto-generated method stub
		boolean check = false;
		if(approxDistance<=deliveryAreaLimit)
			check= true;
		else 
			System.out.println("Home delivery not available for this distance");
		return check;
	}
	public String toString() {
		SimpleDateFormat ft = new SimpleDateFormat ("dd-MM-yyyy");
		String date = ft.format(orderDate);
		return "Order No.: "+orderNo+"\nOrder Date: "+date+"\nOrder cost: "+cost+"\nCustomer Name: "+custName
				+"\nCustomer Address: "+custAddress+"\nDistance: "+approxDistance;
	}
	
	
}

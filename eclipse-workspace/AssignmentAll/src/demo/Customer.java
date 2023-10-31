package demo;

public class Customer {
	private int custNo; 		
	private String custName;
	private String custAddr; 
	private static int billNo;
	static {
		billNo=0;
	}
	void init(){
		custNo=1;
		custName="Ram";
		custAddr="Chennai";
	}
	Customer(){
		custNo=0;
		custName="unknown";
		custAddr="unknown";
		billNo++;
	}
	Customer(int custNo,String custName, String custAddr){
		this.custNo=custNo;
		this.custName=custName;
		this.custAddr=custAddr;
		billNo++;
	}
	public static void printBillNo() {
		System.out.println("Bill Number: "+billNo);
	}
	public void display1() {
		System.out.println("custNo: "+custNo+"\ncustName: "+custName+"\ncustAddr: "+custAddr);
	}
	public int getCustNo() {
		return custNo;
	}
	public String getCustName() {
		return custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public String toString() {
		return "custNo: "+custNo+"\tcustName: "+custName+"\tcustAddr: "+custAddr;
	}
	
}


 
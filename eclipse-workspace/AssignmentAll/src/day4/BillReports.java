package day4;

public class BillReports{
	private Bill bills[] = new Bill[3];
	public void addBill(Bill b) {
		for(int i=0;i<3;i++) {
			if(bills[i]==null) {
				bills[i]=b;
				break;
			}
		}
	}
	public boolean updateBill(int billNo,int newTotal) {
		boolean valid = false;
		for(int i=0;i<3;i++) {
			if(bills[i].getBillNo()==billNo) {
				bills[i].setTotal(newTotal);
				valid = true;
			}
		}
		return valid;
	}
	public Bill[] getBills() {
		return bills;
		//return an array of type Bill
	}
	public Bill searchBill(int billNo)throws BillNotFoundException {
		for(int i=0;i<3;i++) {
			if(bills[i].getBillNo()==billNo) {
				return bills[i];
			}
		}
		throw new BillNotFoundException("Bill number "+billNo+" is not found.");
	}
}

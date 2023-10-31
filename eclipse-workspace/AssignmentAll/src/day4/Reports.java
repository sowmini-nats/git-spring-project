package day4;

import java.util.Scanner;
import java.util.Date;

public class Reports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		BillReports br = new BillReports();
		for(int i=0;i<3;i++) {
			Date date = new Date();
			System.out.println("Enter bill number:");
			int billNo = sc.nextInt();
			System.out.println("Enter customer name:");
			String custName = sc.next();
			System.out.println("Enter bill amount:");
			int total = sc.nextInt();
			System.out.println("Enter total no.of.items:");
			int size = sc.nextInt();
			System.out.println("Enter item names:");
			String[] items = new String[size];
			for(int j=0;j<size;j++) {
				items[j] = sc.next();
			}
			Bill b = new Bill(billNo,custName,date,total,items);
			br.addBill(b);
		}
		System.out.println("--------------");
		System.out.println("List of bills:\n");
		for(Bill bill:br.getBills()) {
			System.out.println(bill);
			System.out.println("\n");
		}
		System.out.println("--------------");
		System.out.println("Enter the bill number to be updated:");
		int billNo1=sc.nextInt();
		System.out.println("Enter the total amount to be updated:");
		int total2 = sc.nextInt();
		if(br.updateBill(billNo1, total2)) {
			System.out.println("\nBill updated successfully.\nUpdated bill details:");
			try {
				System.out.println(br.searchBill(billNo1));
			} catch (BillNotFoundException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("Bill updation failed");
		}
		System.out.println("--------------");
		System.out.println("Enter bill number to search for bill details:");
		int search = sc.nextInt();
		try {
			System.out.println(br.searchBill(search));
		} catch (BillNotFoundException e) {
			e.printStackTrace();
		}
	}

}
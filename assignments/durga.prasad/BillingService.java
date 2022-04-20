package training.sample.storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BillingService {

	List<Item> items = new ArrayList<>();
	Map<String, Bill> bill = new HashMap<>();
	Scanner sc = new Scanner(System.in);

	public void initItems() {
		items.add(new Item(1, "Idly", 10));
		items.add(new Item(2, "Vada", 15));
		items.add(new Item(3, "Pongal", 20));
		items.add(new Item(4, "Dosa", 25));
	}

	public static void main(String[] args) {

		BillingService bs = new BillingService();
		bs.initItems();
		System.out.println("Welcome to Hotel Java.");
		System.out.println("1. prepare bill");
		System.out.println("2. print bill");
		System.out.println("Please enter your option:");
		int option = bs.sc.nextInt();
		switch (option) {
		case 1:
			bs.prepareBill();
			break;
		case 2:
			bs.printBill();
			break;
		default:
			System.out.println("Invalid option");
			System.exit(0);
			break;
		}
	}

	private void printBill() {

	}

	private void prepareBill() {
		System.out.println("Enter Customer Name");
		String customerName = sc.next();
		System.out.println("1. Enter item");
		System.out.println("2. End");
		int option = sc.nextInt();
		System.out.println("ItemId\tItemNm\tCost");
		for (Item item : items) {
			System.out.println(item);
		}
		if (option == 1) {
			System.out.println("Enter item(id) to add: ");
			int itemId = sc.nextInt();
			if(!items.contains(itemId)) {
				System.out.println("Invalid Option!!!");
			}else {
				System.out.println("Enter Quantity: ");
				int quantity = sc.nextInt();
				Bill bill = new Bill()
			}
		}
	}
}

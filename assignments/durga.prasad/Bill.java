package training.sample.storage;

import java.util.List;

public class Bill {
	private int billId;
	private String customerName;
	private List<Item> items;
	private double amount;
	private double gst;
	private double total;
	private String status;

	public Bill() {
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getGst() {
		return gst;
	}

	public double getTotal() {
		return total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}

package training.sample.storage;

public class Item {
	private int itemId;
	private String itemNm;
	private double cost;

	public Item() {
	}

	public Item(int itemId, String itemNm, double cost) {
		super();
		this.itemId = itemId;
		this.itemNm = itemNm;
		this.cost = cost;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return itemId + "\t" + itemNm + "\t" + cost;
	}

}
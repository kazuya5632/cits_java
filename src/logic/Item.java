
package logic;

public class Item {
	private int code;
	private String name;
	private int price;

	@Override
	public boolean equals(Object obj) {
		// TODO 自動生成されたメソッド・スタブ
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "code:" + code + " name:" + name + " price:" + price;
	}

	public Item() {
		super();
	}

	public Item(int code, String name, int price) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}

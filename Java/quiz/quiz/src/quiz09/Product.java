package  quiz09;

/**
 * 상품의 공통 속성을 담는 부모 클래스
 */
public class Product {
	private String name;
	private int price;

	public Product() {}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
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

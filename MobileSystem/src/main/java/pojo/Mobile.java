package pojo;

public class Mobile {
	
	private int id,price,quantity;
	private String name, description;
	
	public Mobile() {
		
	}
	
	public Mobile(int id, String name, int price, int quantity, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}

	
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", price=" + price + ", quantity=" + quantity + ", name=" + name + ", description="
				+ description + "]";
	}
	
	

}
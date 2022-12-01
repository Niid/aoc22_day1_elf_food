package objects;

import java.util.ArrayList;

public class Elf {
	ArrayList<FoodItem> foodItems;

	public Elf() {
		super();
	}
	
	public Elf(ArrayList<FoodItem> foodItems) {
		super();
		this.foodItems = foodItems;
	}

	public ArrayList<FoodItem> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(ArrayList<FoodItem> foodItems) {
		this.foodItems = foodItems;
	}
	
}

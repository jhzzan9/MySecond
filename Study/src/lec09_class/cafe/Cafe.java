package lec09_class.cafe;

import java.util.ArrayList;

public class Cafe {
	private String name;		// 가게 이름
	private ArrayList<Coffee> coffeeList;
	
	public Cafe() {
		
	}
	
	public Cafe(String name, ArrayList<Coffee> coffeeList) {
		this.name = name;
		this.coffeeList = coffeeList;
	}
	
	public void addCoffee(Coffee coffee) {
		coffeeList.add(coffee);
	}
	
	public int indexOfCoffee(String name) {
		for(int i = 0; i < coffeeList.size(); i++) {
			if(coffeeList.get(i).getName().equals(name)){
				return i;
			}
		}
		return -1;
	}
	
	public Coffee getCoffee(int index) {
		return coffeeList.get(index);
	}
	
	public void showCoffeeList() {
		for(Coffee cf : coffeeList) {
			System.out.println(cf);
		}
	}
	
	public Cafe(String name) {
		this.name = name;
		this.coffeeList = new ArrayList<Coffee>();
	}

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", coffList=" + coffeeList + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Coffee> getCoffList() {
		return coffeeList;
	}

	public void setCoffList(ArrayList<Coffee> coffList) {
		this.coffeeList = coffList;
	}
}

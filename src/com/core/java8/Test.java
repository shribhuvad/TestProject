package com.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// filter1();
		// minMax();
	}

	private static void filter1() {
		List<Product> productsList = new ArrayList<Product>();
		productsList.add(new Product(1, "HP Laptop", 25000f));
		productsList.add(new Product(2, "Dell Laptop", 30000f));
		productsList.add(new Product(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product(4, "Sony Laptop", 28000f));
		productsList.add(new Product(5, "Apple Laptop", 90000f));

		List<Float> lst = productsList.stream().filter(p -> (p.price > 3000.0)).map(p -> p.price)
				.collect(Collectors.toList());

		Double avg = productsList.stream().filter(p -> (p.price > 3000.0)).map(p -> p.price)
				.collect(Collectors.averagingDouble(i -> i));

		Optional<Object> lst2 = productsList.stream().filter(p -> (p.price > 3000.0)).findFirst().map(p -> p.price);

		System.out.println(lst);

		Float sum = productsList.stream().map(p -> p.price).reduce(0.0f, ((a, b) -> a + b));

		float sumn = productsList.stream().map(p -> p.price).reduce(0.0f, ((a, b) -> a + b));

		System.out.println(sum);

		double sums = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println(sums);

		Product productA = productsList.stream().max((p1, p2) -> p1.price < p2.price ? 1 : -1).get();

		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 30000)
				.map(product -> product.price).collect(Collectors.toSet());

		Map<Integer, String> productPriceListMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

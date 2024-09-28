package com.core.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {
		filter1();
		// minMax();
	}

	private static void minMax() {
		List<Product> productsList = getList();

		Product productA = productsList.stream().max((p1, p2) -> p1.price > p2.price ? 1 : -1).get();

		Product productA1 = productsList.stream().max((Comparator.comparing(Product::getPrice))).get();

		System.out.println("MAX PRODUCT:" + productA);

		Product productb = productsList.stream().collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)))
				.orElse(null);

		System.out.println("MAX PRODUCT:" + productb);

	}

	private static void filter1() {
		List<Product> productsList = getList();

		List<Float> lst = productsList.stream().filter(p -> (p.price > 3.0)).map(p -> p.price)
				.collect(Collectors.toList());

		productsList.stream().filter(p -> (p.price > 3.0)).map(p -> p.price).findAny();

		Double avg = productsList.stream().filter(p -> (p.price > 3.0)).map(p -> p.price)
				.collect(Collectors.averagingDouble(i -> i));

		Optional<Object> lst2 = productsList.stream().filter(p -> (p.price > 3.0)).findFirst().map(p -> p.price);

		System.out.println(lst);

		Float sum = productsList.stream().map(p -> p.price).reduce(0.0f, (a, b) -> a + b);

		float sumn = productsList.stream().map(p -> p.price).reduce(0.0f, ((a, b) -> a + b));
		double sumn2 = productsList.stream().map(p -> p.price).collect(Collectors.summingDouble(s -> s));
		System.out.println("summingDouble" + sumn2);

		System.out.println(sum);

		double sums = productsList.stream().collect(Collectors.summingDouble(p -> p.price));
		System.out.println(sums);

		Set<Float> productPriceList = productsList.stream().filter(product -> product.price < 3)
				.map(product -> product.price).collect(Collectors.toSet());
		System.out.println("productPriceList:" + productPriceList);
		Map<Integer, String> productPriceListMap = productsList.stream()
				.collect(Collectors.toMap(p -> p.id, p -> p.name));
		System.out.println("productPriceListMap:" + productPriceListMap);

		// practice

		productsList.stream().collect(Collectors.groupingBy(s -> s.getId(), Collectors.counting()));

	}

	private static List<Product> getList() {
		List<Product> productsList = new ArrayList<>();
		productsList.add(new Product(1, "HP Laptop", 1));
		productsList.add(new Product(2, "Dell Laptop", 2));
		productsList.add(new Product(3, "Lenevo Laptop", 3));
		productsList.add(new Product(6, "MI Laptop", 8));
		productsList.add(new Product(4, "Sony Laptop", 1));
		productsList.add(new Product(5, "Apple Laptop", 5));
		return productsList;
	}

	void print(Object obj) {

		System.out.println(obj.getClass().getName());
	}
}

class Product {
	int id;
	String name;
	float price;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}

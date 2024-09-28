package com.core.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {

		example1();
		// example2();

	}

	private static void example2() {
		String array[] = { "Geeks", "forGeeks", "Geeks", "forGeeks", "A computer Portal", "shri", "SHRI" };

		Map<String, Long> map = Arrays.asList(array).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Arrays.asList(array).stream().sorted(Comparator.reverseOrder());
		System.out.println(map);
	}

	private static void example1() {
		// TODO Auto-generated method stub
		BlogPost obj = null;
		obj = getBlogPost(BlogPostType.NEWS, 10);
		List<BlogPost> posts = new ArrayList<>();
		posts.add(obj);
		obj = getBlogPost(BlogPostType.NEWS, 9);
		posts.add(obj);
		obj = getBlogPost(BlogPostType.REVIEW, 11);
		posts.add(obj);

		System.out.println(posts);
		Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
				.collect(Collectors.groupingBy(p -> p.getType()));

//		Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
//				.collect(Collectors.groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));

		Map<BlogPostType, Double> averageLikesPerType = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.averagingInt(BlogPost::getLikes)));
		Map<BlogPostType, Long> count = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.counting()));

		Map<Object, Integer> averageLikesPerAuth = posts.stream()
				.collect(Collectors.groupingBy(s -> s.getAuthor(), Collectors.summingInt(s -> s.getLikes())));

		Map<Object, Optional<BlogPost>> maxLikes = posts.stream().collect(
				Collectors.groupingBy(s -> s.getType(), Collectors.maxBy(Comparator.comparing(s -> s.getLikes()))));
		;

		System.out.println("postsPerType" + postsPerType);
		System.out.println("averageLikesPerType" + averageLikesPerType);
		System.out.println("averageLikesPerAuth" + averageLikesPerAuth);
		System.out.println("maxLikes" + maxLikes);
		System.out.println("count" + count);

		posts.stream().sorted(Comparator.comparing(BlogPost::getType, Comparator.reverseOrder()));

		posts.stream().sorted(Comparator.comparing(BlogPost::getType, Comparator.reverseOrder()));

	}

	private static BlogPost getBlogPost(BlogPostType type, int like) {
		BlogPost obj = new BlogPost();
		obj.setType(type);
		obj.setAuthor("LKLK");
		obj.setLikes(like);
		return obj;
	}

}

//class Tuple {
//	BlogPostType type;
//	String author;
//
//	public Tuple(BlogPostType type, String author) {
//		super();
//		this.type = type;
//		this.author = author;
//	}
//
//}

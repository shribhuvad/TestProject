package com.core.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlogPost obj = null;
		obj = getBlogPost(BlogPostType.NEWS, 10);
		List<BlogPost> posts = new ArrayList<>();
		posts.add(obj);
		obj = getBlogPost(BlogPostType.NEWS, 9);
		posts.add(obj);
		obj = getBlogPost(BlogPostType.REVIEW, 11);
		posts.add(obj);

		Map<BlogPostType, List<BlogPost>> postsPerType = posts.stream()
				.collect(Collectors.groupingBy(p -> p.getType()));

//		Map<Tuple, List<BlogPost>> postsPerTypeAndAuthor = posts.stream()
//				.collect(Collectors.groupingBy(post -> new Tuple(post.getType(), post.getAuthor())));

		Map<BlogPostType, Double> averageLikesPerType = posts.stream()
				.collect(Collectors.groupingBy(BlogPost::getType, Collectors.averagingInt(BlogPost::getLikes)));

		Map<Object, Integer> averageLikesPerAuth = posts.stream()
				.collect(Collectors.groupingBy(s -> s.getAuthor(), Collectors.summingInt(s -> s.getLikes())));

		Map<Object, Optional<BlogPost>> maxLikes = posts.stream().collect(
				Collectors.groupingBy(s -> s.getType(), Collectors.maxBy(Comparator.comparing(s -> s.getLikes()))));
		;

		System.out.println(postsPerType);
		System.out.println(averageLikesPerType);
		System.out.println(averageLikesPerAuth);
		System.out.println(maxLikes);
	}

	private static BlogPost getBlogPost(BlogPostType type, int like) {
		BlogPost obj = new BlogPost();
		obj.setType(type);
		obj.setAuthor("LKLK");
		obj.setLikes(like);
		return obj;
	}

}

class BlogPost {
	String title;
	String author;
	BlogPostType type;
	int likes;

	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", author=" + author + ", type=" + type + ", likes=" + likes + "]";
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public BlogPostType getType() {
		return type;
	}

	public int getLikes() {
		return likes;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setType(BlogPostType type) {
		this.type = type;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

}

enum BlogPostType {
	NEWS, REVIEW, GUIDE
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

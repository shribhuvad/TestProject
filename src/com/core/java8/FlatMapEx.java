package com.core.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {

	public static void main(String[] args) {
		List<Example> listobj = getList();

		List<String> list = listobj.stream().flatMap(s -> s.getPosts().stream().map(m -> m.getAuthor()))
				.collect(Collectors.toList());

		System.out.println(list);

	}

	private static List<Example> getList() {
		BlogPost obj = null;
		obj = getBlogPost(BlogPostType.NEWS, 10, "atyz");
		List<BlogPost> posts = new ArrayList<>();
		posts.add(obj);
		obj = getBlogPost(BlogPostType.NEWS, 9, "daf");
		posts.add(obj);
		obj = getBlogPost(BlogPostType.REVIEW, 11, "rfrds");
		posts.add(obj);

		List<Example> exampleList = new ArrayList<>();

		Example exam = new Example();
		exam.setPosts(posts);
		exam.setName("name");
		exampleList.add(exam);

		return exampleList;
	}

	private static BlogPost getBlogPost(BlogPostType type, int like, String authr) {
		BlogPost obj = new BlogPost();
		obj.setType(type);
		obj.setAuthor(authr);
		obj.setLikes(like);
		return obj;
	}

}

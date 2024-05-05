package com.core.java8;

import java.util.ArrayList;
import java.util.List;

public class Example {

	List<BlogPost> posts = new ArrayList<>();
	String name;

	public List<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

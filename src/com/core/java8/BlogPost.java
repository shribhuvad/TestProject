package com.core.java8;

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

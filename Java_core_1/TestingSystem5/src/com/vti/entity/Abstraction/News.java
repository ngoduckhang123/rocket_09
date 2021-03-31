package com.vti.entity.Abstraction;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private float averageRate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	@Override
	public void display() {
		System.out.println("id" + id);
		System.out.println("title" + title);
		System.out.println("publishDate" + publishDate);
		System.out.println("author" + author);
		System.out.println("content" + content);
		System.out.println("averageRate" + averageRate);

	}

	@Override
	public float calculate(int[] rate) {
		int tong = 0;
		for (int i = 0; i < rate.length; i++) {
			tong += rate[i];
		}
		averageRate = tong / rate.length;
		return averageRate;
	}

	public void insertNews() {
		// TODO Auto-generated method stub
		
	}

}

package com.backend;

public class News {
	int id;
	String title;
	String publishDate;
	String author;
	String content;
	float averageRate;

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String gettitle() {
		return title;
	}

	public void settitle() {
		this.title = title;
	}

	public String getpublishDate() {
		return publishDate;
	}

	public void setpublishDate() {
		this.publishDate = publishDate;
	}

	public String getauthor() {
		return author;
	}

	public void setauthor() {
		this.author = author;
	}

	public float getaverageRate() {
		return averageRate;
	}

	public void Display() {
		System.out.println(title);
		System.out.println(publishDate);
		System.out.println(author);
		System.out.println(content);
		System.out.println(averageRate);
	}

public void Calculate() {
	int[] Rates = new int[3];
	Rates[0]=
}

}

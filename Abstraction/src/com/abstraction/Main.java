package com.abstraction;

public class Main {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(500,200);
		rec.resizeWidth(100);
		rec.resizeHeight(200);
		rec.printSize();
	}

}

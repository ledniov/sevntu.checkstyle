package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable2 
{
	private int x; // no warning here as we have getter and setter - class become a kind of a data container
	private int y; // same as above, but with 'this' keyword

	public void setX(int x) {
		this.x = x;
	}

	public void getX() {
		return x;
	}

	void setY(int y) {
		this.y = y;
	}

	int getY() {
		return this.y;
	}

	int doX() {
		int x = 5; // instance variable hiding will be catched by another check
		return x * 3;
	}
}
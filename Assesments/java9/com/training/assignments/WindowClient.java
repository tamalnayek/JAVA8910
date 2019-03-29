package com.training.assignments;

public class WindowClient {
	public static void main(String[] args) {
		IWindow window1 = new Hall();
		window1.open();
		window1.grillSize(10, 20);
		window1.close();

		System.out.println("-----------------------------------------------");
		IWindow window2 = new Room();
		window2.open();
		window2.grillSize(10, 20);
		window2.close();
	}
}

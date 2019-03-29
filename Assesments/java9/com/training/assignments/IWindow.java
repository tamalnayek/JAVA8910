package com.training.assignments;

public interface IWindow {
	public void open();

	public void close();

	public default void grillSize(int length, int breadth) {
		grillLength(length);
		grillBreadth(breadth);
	}

	private void grillLength(int length) {
		if (length == 0) {
			System.out.println("Every Room / Hall shall have grill with standard length");
		} else {
			System.out.println("Every Room / Hall shall have grill with  length" + length);
		}
	}

	private void grillBreadth(int breadth) {
		if (breadth == 0) {
			System.out.println("Every Room / Hall shall have grill standard breadth ");
		} else {
			System.out.println("Every Room / Hall shall have grill with breadth " + breadth);
		}
	}
}

class Room implements IWindow {

	@Override
	public void open() {

		System.out.println("Room Door Opens ");
	}

	@Override
	public void close() {
		System.out.println("Room Door closes ");
	}

}

class Hall implements IWindow {

	@Override
	public void open() {
		System.out.println("Hall door opens ");
	}

	@Override
	public void close() {
		System.out.println("Hall door closes ");
	}
}
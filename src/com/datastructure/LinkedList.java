package com.datastructure;

/**
 * @author shrinivas 09/05/2024
 *
 */
/**
 * @author admin
 *
 */
class Node {
	int data;
	Node next;

	public Node(int data) {
		super();
		this.data = data;
	}

}

/**
 * @author admin
 *
 */
public class LinkedList {

	Node node = null;
	Node head = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList obj = new LinkedList();
		obj.add(10);
		obj.add(11);
		obj.add(13);
		obj.print(obj);
		obj.remove(11);
		obj.print(obj);
		obj.addAtIndex(0, 30);
		obj.print(obj);

	}

	private void addAtIndex(int index, int data) {
		int count = 0;
		Node current = head;
		Node node = new Node(data);
		if (index == 0) {
			node.next = head.next;
			head = node;

		}
		while (current.next != null && count < index - 1) {
			current = current.next;
			count++;

		}
		if (count == index - 1) {

			node.next = current.next.next;
			current.next = node;

		}

	}

	private void remove(int data) {
		Node current = head;
		while (current.next != null && current.next.data != data) {
			current = current.next;

		}
		if (current.next.data == data) {
			current.next = current.next.next;
		}
	}

	private void print(LinkedList obj) {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;

		}
		System.out.println();
	}

	private void add(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;

			}
			current.next = node;

		}

	}

}

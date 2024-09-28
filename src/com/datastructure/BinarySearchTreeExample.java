package com.datastructure;

public class BinarySearchTreeExample {

	public static void main(String args[]) {

		System.out.println("START");
		BinarySearchTree obj = new BinarySearchTree();

		obj.insert(10);
		obj.insert(12);
		obj.insert(8);
		obj.insert(11);
		obj.inorder();
	}

}

class BinarySearchTree {

	Nodes root;

	public void insert(int data) {

		root = insertRecord(root, data);

	}

	private Nodes insertRecord(Nodes roots, int data) {
		if (roots == null) {

			roots = new Nodes(data);

		} else if (data < roots.data) {

			roots.left = insertRecord(roots.left, data);
		} else if (data > roots.data) {

			roots.right = insertRecord(roots.right, data);
		}
		return roots;
	}

	void inorder() {
		inorderRecord(root);
	}

	private void inorderRecord(Nodes root) {
		if (root != null) {

			inorderRecord(root.left);
			System.out.println(root.data + " ");
			inorderRecord(root.right);

		}
	}

}

class Nodes {

	Nodes left;
	Nodes right;
	int data;

	public Nodes(int data) {
		super();
		this.data = data;
	}

}
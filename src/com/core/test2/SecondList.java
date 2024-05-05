package com.core.test2;

import java.util.ArrayList;

public class SecondList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList patrn1 = new ArrayList();
		patrn1.add(1);
		patrn1.add(5);
		patrn1.add(3);
		patrn1.add(4);
		patrn1.add(2);

		SecondList obj = new SecondList();
		obj.check(patrn1);

	}

	void check(ArrayList firstuser) {

		ArrayList patrn1 = new ArrayList();
		patrn1.add(1);
		patrn1.add(2);
		patrn1.add(3);

		ArrayList patrn2 = new ArrayList();
		patrn2.add(4);
		patrn2.add(5);
		patrn2.add(6);



		ArrayList patrn9 = new ArrayList();

		patrn9.add(patrn2);
		patrn9.add(patrn1);

		System.out.println(firstuser);

		for (int i = 0; i < patrn9.size(); i++) {
			ArrayList temp = ((ArrayList) patrn9.get(i));

			System.out.println(firstuser + " " + temp + "  " + firstuser.containsAll(temp));
			if (firstuser.containsAll(temp)) {
				System.out.println("true");

			}

		}
	}

}

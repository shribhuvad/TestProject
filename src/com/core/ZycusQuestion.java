package com.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class ZycusQuestion {

	public static void main(String args[]) {

		twoDimensionArrayFind();
		// findMaxSequentialSum();

	}

	private static void findMaxSequentialSum() {
		// TODO Auto-generated method stub
		LinkedList<Integer> values = new LinkedList<Integer>();
		int a[] = { 100, -6, 5, -1, 8, -6, -9, 6 };

		for (int i    = 0; i < a.length; i++) {

			values.add(a[i]);
			for (int j = i + 1; j < a.length; j++) {

				values.add(values.getLast() + a[j]);

			}

		}
		Collections.sort(values);
		System.out.println(values);
		System.out.println(values.getLast());// output 106

	}

	private static void twoDimensionArrayFind() {
		
		int ary[][]=new int[4][4];
		
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				ary[i][j]=i+j;
			}
			
		}
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary.length; j++) {
				System.out.print(ary[i][j]+"  ");
			}
			System.out.println();
		}
		
		int sampleary[][]=new int[2][2];
		for (int i = 0; i < sampleary.length; i++) {
			for (int j = 0; j < sampleary.length; j++) {
				sampleary[i][j]=i+j;
			}
			
		} 
		
		System.out.println("sample array --->");
		for (int i = 0; i < sampleary.length; i++) {
			for (int j = 0; j < sampleary.length; j++) {
				System.out.print(sampleary[i][j]+" ");
			}
			System.out.println();
		} 
	
		
		for (int i = 0; i < ary.length; i++) {
		{
		
		for (int i2 = 0; i2 < ary.length; i2++) {
			
			for (int j = 0,j3=0; j < sampleary.length&&j3<2; j++,j3++) {
				
			for (int j2 = 0; j2 < sampleary.length; j2++) {
				
			 for(int t=1;t<2;t++) {
				
		//	while()
			{
				//if ary[i][i2]==sampleary[j][j2];
				
			}
				 
				 
			
			 }
			}
			}
			}
		
		}
			}
		
		
		
	}
}

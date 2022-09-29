package com.groots_pie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Class_of_groots_pie {

	public static void main(String[] args) {
		int[] sweetness =new int[5];
		
		
		int length=sweetness.length;
		int desired_sweetness;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the sweetness values of the available pie's");
		for(int i=0;i<length;i++) {
		
			sweetness[i]=sc.nextInt();
		}
		
		System.out.println("enter the groots desired sweetness value");
		desired_sweetness=sc.nextInt();
		Arrays.sort(sweetness);
	
		
		for(int i=0;i<=length-1;i++) {
		
			for(int j=0;j<length;j++) {
				
				if(sweetness[i]+sweetness[j]==desired_sweetness) {
					
					System.out.println("pie at:"+i+" and "+j+" are groot's pie's with desired sweetness level");
				}
				
			}
		}
		
	}

}

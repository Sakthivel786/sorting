package practise;

import java.util.Arrays;

public class stron {
	public static void main(String[] args) {
	
		int[]a= {6,2,3,7,5};
		System.out.println("before sorting: "+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("after sorting: "+Arrays.toString(a));
	}
}
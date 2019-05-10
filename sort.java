package 数组;

import java.util.Scanner;

public class 冒泡排序 {
	public static void main(String[] args){
      Scanner sr =new Scanner(System.in);
      System.out.println("请输入数组元素");
      int a=sr.nextInt();
      int b=sr.nextInt();
      int c=sr.nextInt();
      int d=sr.nextInt();
      int e=sr.nextInt();
      int [] arr= {a,b,c,d,e};
       System.out.print("排序前的数组：");
        bl(arr);
        px(arr);
        System.out.print("排序后的数组：");
        bl(arr);
	}
	public static void bl(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");			
		}
		System.out.println();
	}
	public static void px(int [] arr) {
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			System.out.print("第"+(i+1)+"轮排序的数组：");
			bl(arr);
		}
	}
}

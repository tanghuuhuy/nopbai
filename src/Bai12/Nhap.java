package Bai12;

import java.util.Scanner;

public class Nhap {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	    int a= sc.nextInt();
	    if(a>=90) {
	    	 System.out.println(" hs loai a");
	}else if(a>=80 &&a<90) {
		 System.out.println(" hs loai b");
	}else if(a >=70 && a <80) {
		 System.out.println(" hs loai c ");
	}else {
		 System.out.println(" hs loai d ");
	}
}
}

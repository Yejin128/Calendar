package calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a,b;
		String s1, s2;
		s1=sc.next();
		s2=sc.next();
		
		System.out.println(s1+", "+s2);
		a=Integer.parseInt(s1);
		b=Integer.parseInt(s2);
		System.out.println("두 수의 합은 "+(a+b)+"입니다.");
		sc.close();


	}

}

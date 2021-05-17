package calendar;

import java.util.Scanner;

public class Prompt {
	
	
	public void runPrompt() {
		
			//입력받은 월의 최대 일수 출력
			Scanner sc=new Scanner(System.in);
			Calendar cal = new Calendar();
			
			int month,year;
			
			while(true) {
			System.out.println("년도를 입력하세요");
			System.out.print("YEAR> ");
			year=sc.nextInt();
			
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			month=sc.nextInt();
			
			if(month == -1) {
				break;
			}
			if(month>12) {
				continue;
			}
			System.out.printf("%d월은 %d일까지 있습니다. \n",month,cal.getMaxDaysOfMonth(year, month));
			cal.printCalendar(year, month);
			}
			
			sc.close();
		
		
	}
	public static void main(String[] args) {
	
		Prompt pr= new Prompt();
			pr.runPrompt();
		
	}
	



}

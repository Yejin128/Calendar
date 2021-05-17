package calendar;

import java.util.Scanner;

public class Prompt {
	
	public int parseDay(String week) {
		if(week=="su") return 0;
		else if(week.equals("mo")) return 1;
		else if(week.equals("tu")) return 2;
		else if(week.equals("we")) return 3;
		else if(week.equals("th")) return 4;
		else if(week.equals("fr")) return 5;
		else if(week.equals("sa")) return 6;
		else return 0;

		
	}
	
	
	public void runPrompt() {
		
			//입력받은 월의 최대 일수 출력
			Scanner sc=new Scanner(System.in);
			Calendar cal = new Calendar();
			
			int month,year;
			
			while(true) {
			System.out.println("년도를 입력하세요. (exit: -1)");
			System.out.print("YEAR> ");
			year=sc.nextInt();
			if(year==-1) break;
			
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			month=sc.nextInt();
			
		
		
			if(month>12 || month<1) {
				System.out.print("다시입력해주세요.");
				continue;
			}
			cal.printCalendar(year, month);
			}
		
		
	}
	public static void main(String[] args) {
	
		Prompt pr= new Prompt();
			pr.runPrompt();
		
	}
	



}

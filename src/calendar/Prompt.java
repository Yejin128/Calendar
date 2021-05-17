package calendar;

import java.text.ParseException;
import java.util.Scanner;


public class Prompt {
	
	public void printMenu() {
		System.out.println("+--------------------+");
		System.out.println("| 1. 일정등록");
		System.out.println("| 2. 일정 검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+--------------------+");


		
	}
	
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
	
	
	public void runPrompt() throws java.text.ParseException  {
		
			printMenu();
			
		
			//입력받은 월의 최대 일수 출력
			Scanner sc=new Scanner(System.in);
			Calendar cal = new Calendar();
			
			while(true) {
			
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print(">");

			String cmd=sc.next();
			if(cmd.equals("1")) cmdRegister(sc,cal);
			else if(cmd.equals("2")) cmdSearch(sc, cal);
			else if (cmd.equals("3")) cmdCal(sc, cal);
			else if (cmd.equals("h")) printMenu();
			else if (cmd.equals("q")) break;
			}
			
			sc.close();
			
	}
	
	private void cmdSearch(Scanner s, Calendar c) {
		System.out.println("[일정 검색]");
		System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
        String date = s.next();
        String plan="";
        try {
			plan=c.searchPlan(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("실정 검색 중 오류가 발생했습니다."); 
		}
        System.out.println(plan);
		
		
	}

	private void cmdRegister(Scanner s, Calendar c) throws java.text.ParseException {
        System.out.println("[새 일정 등록]");
        System.out.println("날짜를 입력해 주세요 (yyyy-MM-dd).");
        String date = s.next();
        String text = "";
        s.nextLine(); //ignore one newline
        System.out.println("일정을 입력해 주세요.");

        text = s.nextLine();

        c.registerPlan(date, text);
    }
	
	private void cmdCal(Scanner sc, Calendar c) {
		int month=1,year=2017;
		
		while(true) {

			System.out.println("년도를 입력하세요.");
			System.out.print("YEAR> ");
			year=sc.nextInt();
			if(year==-1) break;
			
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
			month=sc.nextInt();
			
		
		
			if(month>12 || month<1) {
				System.out.print("잘못된 입력입니다.");
				return;
			}
			c.printCalendar(year, month);
			}
	}
	
	public static void main(String[] args) throws ParseException {
	
		Prompt pr= new Prompt();
			pr.runPrompt();
		
	}
	



}

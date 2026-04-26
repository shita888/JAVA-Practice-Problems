import java.util.Scanner;
public class Dayconversion{
	public static void main(String args[]){
   	
	Scanner sc = new Scanner(System.in);
	int Tday;
	Tday = sc.nextInt();
        
        int year = Tday/365;
	int remaining = Tday%365;
	int month = remaining/30;
	int day = month % 30;

      System.out.println("Year: "+year);
	System.out.println("Month: "+month);
	System.out.println("Day: "+day);
}
}

	
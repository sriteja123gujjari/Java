import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int Leap = sc.nextInt();

        if(Leap%400==0 || (Leap%4==0 && Leap % 100!=0))
        {
            System.out.println("It's leap year");

        }
        else{
            System.out.println("it's not a leap year");
        }

    }
    
}

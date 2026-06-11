import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter used units: ");
        int unit= sc.nextInt();
        int rate;
        int finalBill;

        if(unit<=100){
            rate=0;
        } else if (unit <=200) {
            rate=1;

        } else if (unit<=400) {
            rate=2;

        }
        else{
            rate=4;
        }
        finalBill=unit*rate;
        System.out.println("Units you used this month: "+unit + "units");
        System.out.println("Your bill amount is: "+finalBill);
        sc.close();

    }

}

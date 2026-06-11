import java.util.Scanner;
public class ECommerce {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your bill amount: ");
        int purchaseAmount = sc.nextInt();

        int discount=0;
        int finalBill;
        if(purchaseAmount>=5000){
      discount = 40;
        } else if (purchaseAmount>=4000) {
           discount =30;
        }
        else{
            discount=0;
        }
        int discountAmount =purchaseAmount*discount/100;
        finalBill=purchaseAmount-discountAmount;
        System.out.println("Purchase Amount: ₹" + purchaseAmount);
        System.out.println("Discount Percentage: " + discount + "%");
        System.out.println("Discount Amount: ₹" + discountAmount);
        System.out.println("Final Bill Amount: ₹" + finalBill);

sc.close();
    }
}

package JavaOOPS;
import java.util.Scanner;
public class JavaPracticeOOPS {
    public static <Char> void main(String[] args){
        int aTotalQuantity = 100;
        int bTotalQuantity = 100;
        int cTotalQuantity = 100;

        int aBuyed=0;
        int bBuyed=0;
        int cBuyed=0;

        int aPrice = 2;
        int bPrice = 3;
        int cPrice = 5;

        int aTotalPrice = 0;
        int bTotalPrice = 0;
        int cTotalPrice = 0;

        Scanner sc = new Scanner(System.in);
        String s = "Y";
        while((aBuyed<=100 || bBuyed<=100 || cBuyed<=100) && s.equals("Y")){
            System.out.println("Enter no. of a want");
            int a = sc.nextInt();
            if(a<=aTotalQuantity){
                aBuyed+=a;
                aTotalQuantity-=a;
            }else{
                System.out.println("Product a is Out of Stock");
            }

            System.out.println("Enter no. of b want");
            int b = sc.nextInt();
            if(b<=bTotalQuantity){
                bBuyed+=b;
                bTotalQuantity-=b;
            }else{
                System.out.println("Product b is Out of Stock");
            }

            System.out.println("Enter no. of c want");
            int c = sc.nextInt();
            if(c<=cTotalQuantity){
                cBuyed+=c;
                cTotalQuantity-=c;
            }else{
                System.out.println("Product c is Out of Stock");
            }

            System.out.println("Do you want to continue Shopping? Y, N");
            s = sc.next();
            if(s.equals("N")){
                break;
            }
        }
        aTotalPrice = aBuyed* aPrice;
        bTotalPrice = bBuyed* bPrice;
        cTotalPrice = cBuyed* cPrice;

        System.out.println(aTotalPrice);
        System.out.println(bTotalPrice);
        System.out.println(cTotalPrice);
    }
}

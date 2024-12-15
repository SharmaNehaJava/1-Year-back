public class pattern {
    public static void main (String[] args){
//        System.out.println("Enter the number of row you want");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 5;
//        pattern1(n);
//        pattern2(n);
//        pattern3(n);
//        pattern4(n);
//        pattern5(n);
//        pattern6(n);
//        pattern7(n);
//        pattern8(n);
//        pattern9(n);
//        pattern10(n);
//        pattern11(n);
//        pattern12(n);
//        hollowRectangle(4,5);
//        invertedTriangle(4);
//        zeroOne(4);
//        butterfly(8);
//        solidRhombus(5);
        isocelesNumberTriangle(5);
    }
    public static void isocelesNumberTriangle(int row){
        for(int i=1;i<=row;i++){
//            spaces
            for(int j=row-i;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void solidRhombus(int row){
        for(int i=0;i<row;i++){
//            spaces
            for(int j=row-i-1;j>=0;j--){
                System.out.print(" ");
            }
//            stars print
            for(int j=0;j<row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void butterfly(int row){
//        upper half
        for(int i=0; i<=row/2;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=row-(i*2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//      lower half
        for(int i=row/2-1; i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<=row-(i*2);j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void zeroOne(int row){
//        int val=1;
//        for(int i=0;i<row;i++){
//            int temp=val;
//            for(int j=0;j<=i;j++){
//                if(val==0){
//                    System.out.print("0");
//                    val=1;
//                }else{
//                    System.out.print("1");
//                    val=0;
//                }
//            }
//            System.out.println();
//            if(temp==0){
//                val=1;
//            }else{
//                val=0;
//            }

//        from observation, 0 is at odd sum of the row and the col , similarly 1 at the even sum

        for(int i=0;i<row;i++){
            for(int j=0;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void invertedTriangle(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRectangle(int row, int col){
        for(int i=0; i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 || j==0  || i==row-1 || j==col-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    static void pattern1(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern2(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern3(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern4(int n){
        for(int row =1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }

    }

    static void pattern5(int n){
        for(int row = 1; row< 2*n; row++){
            int c = row>n? 2*n-row:row;
            for(int col=1; col<=c; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern6(int n){
        for(int row = 1; row<= n; row++){
            for(int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern7(int n){
        for(int row = 1; row<= n; row++){
            for(int s=1; s<=row-1; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern8(int n){
        for(int row = 1; row<= n; row++){
            for(int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern9(int n){
        for(int row = 1; row<= n; row++){
            for(int s=1; s<=row-1; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=2*(n-row)+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    static void pattern10(int n){
        for(int row = 1; row<= n; row++){
            for(int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern11(int n){
        for(int row = 1; row<= n; row++){
            for(int s=1; s<=row-1; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void pattern12(int n){
        for(int row = 0; row< 2*n; row++){
            int sp= row>n? 2*n-row-1 :row;
            for(int s=0; s<sp; s++){
                System.out.print(" ");
            }
            for(int col=0; col<n-sp; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static class Linked_list {
        public static void main(String[] args) {
            String s = "dvdf";
            int n = lengthOfLongestSubstring(s);
            System.out.println(n);
        }
        public static int lengthOfLongestSubstring(String s) {
            int max=0;
            int count=0;
            int i=0;
    //        for(int i=0; i<s.length(); i++){
            while(i<s.length()){
                int temp =i-1;
                boolean b= true;
                while(temp>=0){
                    if(s.charAt(i)== s.charAt(temp)){
                        b = false;
                        i=temp+1;
                    }else{
                        i--;
                    }
                    temp--;
                }
                if(b== true){
                    count++;
                }else{
                    count=1;
                }
                if(count>max){
                    max = count;
                }
            }
            return max;
        }
    }
}

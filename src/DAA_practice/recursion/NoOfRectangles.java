package DAA_practice.recursion;

public class NoOfRectangles {
    public static void main(String[] args) {
        int[][] rectangles = {{5,8},{3,9},{5,12},{16,5}};
        int ans = countGoodRectangles(rectangles);
        System.out.println(ans);
    }
    public static int countGoodRectangles(int[][] rectangles) {
        int[] n=new int[rectangles.length];
        int count=0;
        int j=0;
        for(int i=0; i<rectangles.length; i++){
            if(rectangles[i][0]> rectangles[i][1]){
                n[j] = rectangles[i][1];

            }else{
                n[j] = rectangles[i][0];
            }
            j++;
        }
        int max =n[0];
        for(int i=1; i<n.length; i++){
            if(max<n[i]){
                max = n[i];
            }
        }
        for(int e: n){
            if(e == max){
                count++;
            }
        }
        return count;
    }
}

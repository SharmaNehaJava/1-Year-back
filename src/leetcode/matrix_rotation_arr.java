//
//import java.util.*;
//public class matrix_rotation_arr {
//    public static void main(String[] args) {
//        int[][] mat = {{0,1},{1,0}};
//        int[][] target = {{1,0},{0,1};
//            findRotation(mat, target);
//    }
//
//    public boolean findRotation(int[][] mat, int[][] target) {
//        boolean b = false;
//        for(int i=mat.length; i>0; i++){
//            for(int j=0; j<mat[i].length; j++){
//                if(mat[i][j] == target[i-mat.length-1][j]  ){
//                    b = true;
//                }
//            }
//        }
//        return b;
//    }
//}

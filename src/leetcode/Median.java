package leetcode; /*Given two arrays num1 and num2 of size m and n respectively,
 return the median of the two sorted arrays.*/

//         Given Data: 3, 5, 4, 1, 8, 6, 9
//         total no. of elements = 7
//         Mean =  (3 +5 + 4 + 1 + 8 + 6 + 9)/7    =    5. 14
//
//         To find median:
//         Step 1: Arrange the given set of data in ascending order
//         So, it becomes: 1, 3, 4, 5, 6, 8, 9
//
//         Step 2: Since the number of data is odd, take the middle value
//         So, the middle value of the given data is 5.
//                          if(number of elements were even)
//         median = average of middle two elements


import java.util.*;
public class Median {
    public static void main(String[] args) {
        int[] num1 ={ 3, 5, 4, 1, 8, 6, 9};
        int[] num2 ={1, 3, 4, 2, 6, 5, 8, 7};

        System.out.println(Arrays.toString(sort(num1)));


    }

    static int[] sort(int[] num){
        int max= 0;
        for(int i=0; i<num.length; i++){
           for(int j=1; j<num.length-i;j++){
               if(num[j]>num[max]){
                   max=j;
               }
           }
           int temp= num[max];
           num[max]= num[num.length-i-1];
           num[num.length-i-1] = temp;
        }
        return num;
    }
}

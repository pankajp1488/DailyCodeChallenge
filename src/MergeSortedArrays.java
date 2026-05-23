import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int []num1 ,int m ,int[] num2,int n){

        for(int i=0; i<n; i++){
            num1[m + i] = num2[i];
        }
        Arrays.sort(num1);
    }

    public static void main (String [] args ){
        int [] num1 = {1,2,3,0,0,0};
        int m = 3;

        int [] num2 = {3,5,6};
        int n = 3;

        merge(num1,m,num2,n);

        System.out.println(Arrays.toString(num1));
    }
}

public class ArrayExample {

    public static void main (String [] args){
        int arr[] = {10,20,30,40,50} ;

        arr[1] = 25; //replaces  index 1 value

        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

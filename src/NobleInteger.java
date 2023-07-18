import java.util.Arrays;
import java.util.Scanner;

public class NobleInteger {
    static int Noble(int arr[]){
        Arrays.sort(arr);
        int count=0;
        int j=1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==j)
            {
                count++;
            }
            j++;


        }
        return count==0?-1:count;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int array[]=new int[size];
        for (int i=0;i<size;i++){
            array[i]= scan.nextInt();
        }
        System.out.println(Noble(array));
    }
}

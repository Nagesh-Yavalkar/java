import java.util.Arrays;

public class fixedsize {
    public static void main(String[] args) {
        int arr[] = new int[]{2,3,4,4};
        System.out.println(arr);
        
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Arrays.fill(arr,5);
          for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(arr);
    }
}
/*
output is 
[I@7ad041f3
2
3
4
4
5
5
5
5
[I@7ad041f3
here value only replaced */

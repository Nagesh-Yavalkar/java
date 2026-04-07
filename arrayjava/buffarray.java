import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buffarray {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter your array size :");
        int size = Integer.parseInt(br.readLine());
      
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            System.out.println(" Enter your "+i+" element :");
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0;i<size;i++){
            System.out.println(" The array element is :"+arr[i]);
        }
    }
}


/* output :
Enter your array size :
3
 Enter your 0 element :
1
 Enter your 1 element :
2
 Enter your 2 element :
3
 The array element is :1
 The array element is :2
 The array element is :3 
 Here print array using Bufferreader  */
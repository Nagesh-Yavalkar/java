import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class doublearr {
        public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your first array size : ");
            int size1 = Integer.parseInt(br.readLine());
            System.out.println("Enter your second array size : ");
            int size2 = Integer.parseInt(br.readLine());
            int arr1[] = new int[size1];
            int arr2[] = new int[size2];
            for(int i=0;i<size1 ;i++){
                System.out.println("Enter your "+i+ " th elment of first array  :  ");
                arr1[i] = Integer.parseInt(br.readLine());
            }
             for(int i=0;i<size1 ;i++){
                System.out.println("Enter your "+i+ " th elment of second array :  ");
                arr2[i] = Integer.parseInt(br.readLine());
            }
             for(int i=0;i<size1 ;i++){
                System.out.println("Enter your first array elment is :  " +arr1[i]);
                
            }  for(int i=0;i<size1 ;i++){
                System.out.println("Enter your second array elment is :  " +arr2[i]);
                
            }
            
        }


        /*
        output : 
        Enter your first array size : 
3
Enter your second array size : 
3
Enter your 0 th array elment :  
1
Enter your 1 th array elment :  
2
Enter your 2 th array elment :  
3
Enter your 0 th array elment :  
9
Enter your 1 th array elment :  
8
Enter your 2 th array elment :  
7
Enter your first array elment is :  [I@58644d46
Enter your first array elment is :  [I@58644d46
Enter your first array elment is :  [I@58644d46
Enter your second array elment is :  [I@18b4aac2
Enter your second array elment is :  [I@18b4aac2
Enter your second array elment is :  [I@18b4aac2
PS D:\java2026\Array> javac doublearr.java
PS D:\java2026\Array> java doublearr      
Enter your first array size : 
3
Enter your second array size : 
3
Enter your 0 th elment of first array  :  
1
Enter your 1 th elment of first array  :  
2
Enter your 2 th elment of first array  :  
3
Enter your 0 th elment of second array :  
9
Enter your 1 th elment of second array :  
8
Enter your 2 th elment of second array :  
7
Enter your first array elment is :  1
Enter your first array elment is :  2
Enter your first array elment is :  3
Enter your second array elment is :  9
Enter your second array elment is :  8
Enter your second array elment is :  7 
using Bufferreader */
}

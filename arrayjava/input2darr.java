import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class input2darr {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your row size : ");
        int row = Integer.parseInt(br.readLine());
        System.out.println("Enter your column size :");
        int col = Integer.parseInt(br.readLine());
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println("Enter your array Elment : ");
                arr[i][j]= Integer.parseInt(br.readLine());
            }
        }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              System.out.print(" "+arr[i][j]);
                
            }System.out.println();
        }


    }
}

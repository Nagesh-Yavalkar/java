import java.util.Scanner;

public class arr2d {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row size : ");
        int row = sc.nextInt();
        System.out.println("Enter your column size :");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i = 0;i<row;i++){
           
            for(int j = 0;j<col;j++){
                 System.out.println("Enter your elment :");
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                System.out.print(" "+arr[i][j]);
            }System.out.println();
        }

    }
}
/*output 
Enter your row size : 
2
Enter your column size :
2
Enter your elment :
1
Enter your elment :
2
Enter your elment :
2
Enter your elment :
2
 1 2
 2 2 */

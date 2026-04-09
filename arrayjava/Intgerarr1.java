public class Intgerarr1 {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4};
        Integer arr1[] = new Integer[]{3,2,4,5,5};
        System.out.println(arr);
        System.out.println(arr1);

    }
}
/*output 
here you can observ that for integer cache creates object
[I@7ad041f3
[Ljava.lang.Integer;@251a69d7
for int - I and Integer cache - L */
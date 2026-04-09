public class methbyte {
    public static void main(String[] args) {
        int arr[] = {1,2,4};
        int arr1[] = new int[]{1,2,4};
        int arr2[] = new int[3];
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);
        Integer arr3[] = {1,2,4};
        Integer arr4[] = new Integer[]{1,2,4};
        Integer arr5[] = new Integer[3];
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
    }
}
/* output :
[I@2c7b84de
[I@3fee733d
[I@5acf9800
[Ljava.lang.Integer;@4617c264
[Ljava.lang.Integer;@36baf30c
[Ljava.lang.Integer;@7a81197d


see byte code : javap -c methbyte
internally byte code is same for first 3 same newarray
and for Integer also same same anewarray

*/

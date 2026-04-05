public class arrclass {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1,2,3,4,3};
        int arr1[] = new int[]{3,5,6,4,3};
        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(System.identityHashCode(arr1));
        System.out.println(System.identityHashCode(arr));
        int x = 5;
        Integer  y = 5;
        System.out.println(System.identityHashCode(x));
        System.out.println(System.identityHashCode(y));
    }
}
/*
output 
[Ljava.lang.Integer;@2c7b84de
[I@3fee733d
1072591677
746292446
1523554304
1523554304 
last two line give same hashcode because int in range of integer cache */
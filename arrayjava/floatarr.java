public class floatarr {
    public static void main(String[] args) {
        int arr1[] = new int[]{2,3,43,3};
        Integer arr2[] = new Integer[]{4,5,56,34};
        float arr[] = new float[]{3.3f,3.4f,8.89f};
        char arr3[] = new char[]{'d','d','g','f'};

        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr);
        System.out.println(arr3);
    }
}

/* output is :
[I@7ad041f3
[Ljava.lang.Integer;@251a69d7
[F@7344699f
Here you can observe that for int - I 
for Integer - L and for float - F 
🔹 Why This Strange Output Comes?

Output:

[I@7ad041f3
[Ljava.lang.Integer;@251a69d7
[F@7344699f

This is NOT random. It follows a format:

[ type @ hashcode
🔹 Breakdown of Output Format
✅ General Structure
[TYPE@HASHCODE
Part	Meaning
[	It is an array
TYPE	Data type of array
@	separator
HASHCODE	memory reference (hexadecimal)
🔹 Case 1: int[]
[I@7ad041f3
Meaning:
[ → array
I → int type
@7ad041f3 → memory reference

👉 I comes from JVM type codes:

Type	Code
int	I
float	F
double	D
char	C
boolean	Z
🔹 Case 2: Integer[]
[Ljava.lang.Integer;@251a69d7
Meaning:
[ → array
L → Object type (class)
java.lang.Integer → full class name
; → end of class name
@251a69d7 → memory reference

👉 L means:

This is an array of objects, not primitive

🔹 Case 3: float[]
[F@7344699f
Meaning:
[ → array
F → float type
@7344699f → memory reference
🔥 Important Difference
Array Type	Output Format
Primitive (int[], float[])	[I, [F
Object (Integer[])	[L<classname>;
🔹 Why Does This Happen?

Because:

System.out.println(arr);

Internally calls:

arr.toString();

And array’s default toString() is:
👉 class name + hashcode

🔹 How to Print Actual Values

Use:

import java.util.Arrays;

System.out.println(Arrays.toString(arr1));
System.out.println(Arrays.toString(arr2));
System.out.println(Arrays.toString(arr));

👉 Output:

[2, 3, 43, 3]
[4, 5, 56, 34]
[3.3, 3.4, 8.89]
🔥 Final Concept (Very Important)

✔ Arrays are objects in Java
✔ Printing array directly → gives type + hashcode
✔ Primitive arrays use type codes (I, F, etc.)
✔ Object arrays use L<classname>;

💡 Easy Memory Trick

👉 I → int
👉 F → float
👉 L → class (Like “Library object”)*/

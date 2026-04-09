public class Integerarr {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{1,2,3,129};
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
/*
output 
🔹 Important Concept: Integer Cache

In Java, the Integer cache stores values from -128 to 127 only.

This cache is used when you create Integer objects using:

Integer x = 100;   // uses cache
🔹 Your Code
Integer arr[] = new Integer[]{1,2,3,129};

Here’s what happens:

1, 2, 3 → taken from Integer cache
129 → NOT in cache, so Java creates a new Integer object in heap memory
🔹 Key Point

👉 Array does NOT store values in cache
👉 Array stores references to Integer objects

So internally:

Value	Stored Where
1	Integer Cache
2	Integer Cache
3	Integer Cache
129	New object in Heap
🔹 Why 129 still works?

Because:

Cache is just an optimization, not a limit
Java can create Integer objects outside cache anytime */
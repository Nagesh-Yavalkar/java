public class arrerr2 {
    public static void main(String[] args) {
        int arr[][] = new int[][3];
        
    }
}
/*
output :
PS D:\java2026\Array> javac arrerr2.java
arrerr2.java:3: error: ']' expected
        int arr[][] = new int[][3];
           
        🔹 Why This Error Occurs

In Java, when you create a multi-dimensional array, you must follow a rule:

👉 First dimension size must be specified

🔥 Rule (Very Important)

✔ Allowed:

new int[rows][columns];
new int[rows][];

❌ NOT allowed:

new int[][columns];   // ❌ ERROR
🔹 What Your Code Means (Conceptually)
new int[][3];

👉 You are telling Java:

“I don’t know how many rows I need” ❓
“But each row has 3 columns” ✔

👉 JVM gets confused:

“How many rows should I create?” 🤔

So it gives error.*/
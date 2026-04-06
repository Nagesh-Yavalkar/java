public class arrerr5 {
    public static void main(String[] args) {
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
    }
}
/* output 
arrerr5.java:3: error: ']' expected
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
                                ^
arrerr5.java:3: error: not a statement
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
                                    ^
arrerr5.java:3: error: ';' expected
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
                                     ^
arrerr5.java:3: error: illegal start of expression
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
                                          ^
arrerr5.java:3: error: not a statement
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
                                            ^
arrerr5.java:3: error: ';' expected
        int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
        🔴 तुमचा Code
int arr[][] = new int[][3]{{1,2,3},{2,3,4}};
🔴 Error का येतो?

तुमच्या code मध्ये syntax चुकीचा आहे ❌

👉 Java मध्ये array initialize करताना दोन वेगवेगळे styles असतात, आणि तुम्ही ते mix केले आहेत

🔹 Java मधले 2 Valid Ways
✅ 1. Direct Initialization (without new)
int arr[][] = {{1,2,3},{2,3,4}};
✅ 2. Using new keyword
int arr[][] = new int[][]{{1,2,3},{2,3,4}};
🔴 तुमची चूक कुठे आहे?
new int[][3]{{1,2,3},{2,3,4}};*/
class demo {
    static int x =10;           // this is static variable which store in static block in method area
                                
}
// see bytecode javap -c demo
/*class demo {
  static int x;

  demo();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  static {};
    Code:
       0: bipush        10
       2: putstatic     #7                  // Field x:I
       5: return
}*/
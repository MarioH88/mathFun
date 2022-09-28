class MathFunction {

    public static String  mathFunction( int num1,int num2, int num3)
    {

    if(num1 + num2 == num3){

        if(num1 * num2 == num3){
            return "+*";
        }

        return "+";
    }
    if(num1*num2 == num3) {
        return  "*";
    }

    if(num1-num2 == num3) {
            return  "-";
        }
    if(num1/num2 == num3) {
            return  "/";
        }

    return  "None";

    }


    /**
     * @param args
     */
    public static void main(String[] args) {

        String ans;
        String a;
        String c;
        String d;
        String e;
        String b;
        ans =  mathFunction(2,2,3);
        a =  mathFunction(2,2,4);
        b =  mathFunction(3,-3,-9);
        c =  mathFunction(1,2,-1);
        d =  mathFunction(3,3,1);
        e =  mathFunction(7,1,11);
        
      System.out.println( ans );
      System.out.println( a );
      System.out.println( b );
      System.out.println( c );
      System.out.println( d );
      System.out.println( e );

    }
}
public class MathConstants {
    static final double PI = 3.14159;
    static final double E = 2.71828;

   public static void calculateCircleArea(double r){
       System.out.println(PI*r*r);
   }
   public static void calculateCircumference(double r){
       System.out.println(2*PI*r);
   }
   public static void calculateExponentialGrowth(double initialValue, double rate, double time){
       System.out.println(initialValue*Math.pow(E,rate*time));
   }
}

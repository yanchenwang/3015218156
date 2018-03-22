package ComputerPractice1;

public class triangleProblem {
    public static String triangleshape(int a,int b, int c){
       if(a+b>c&&a+c>b&&b+c>a){
    	   if(a == b && a == c && b == c){
               return "equilateral";
           }
           else if(a == b || a == c || b == c){
               return "isosceles";
           }
           else{
               return "scalene";
           }
       }else{
    	   return "That is not a triangle!";
       }
    }
}

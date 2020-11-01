

public class demoifelse{
    public static void main(String[] args) {

        //Example for if...else condition

        int num1 = 5 ;
        if ( num1 % 2 == 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        //Example for if...eseif....condition


        int a = 4 ;
        int b = 13 ;
        int c = 18 ;
        if ((a>b) && (a>c)){  //curly braces can be removed if it contain only one line..
            System.out.printf("%d is the largest number",a);
        }
        else if ((b>a) && (b>c)) {
            System.out.printf("%d is the largest number",b);
        }
        else 
            System.out.printf("%d is the largest number\n",c);
    }
}
public class ternary {
    public static void main(String[] args) {
        // simply its a replacement for if...else 
        int i = 1 , j = 5 ; 
        j = i == 1 ? 6 : 7 ;  //  j = (condition) ? (if true) : (if false)......here i==1 gives true hence  6 is passed in j....
        System.out.println(j);

        // lets test the program for biggest of three numbers..

        int a=12,b=34,c=52;
        int largest=(a>b?(a>c?a:c):(b>c)?b:c);

        /*here the first condition is if a > b if this is true then check if a is greater then c
        if condition is false the check if b is greater than c...
        */

        System.out.println(largest +" is the biggest number of all");

        //ternary operator is more than just replaement for if...else..conditional operator


        Object obj1,obj2;

        if(true){
            obj1=new Integer (10);
        }
        else
            
            obj1=new Double(15.0);

        System.out.println(obj1 + "\t by if...else...");

        obj2= true ? new Integer(10) : new Double(15.0);

        System.out.println(obj2 + "\tby ternary operator "); 
        
        /*ternary operator checks the data size of both the datatype of 
        both the values => then uses the datatype which is the largest...*/

    }
}

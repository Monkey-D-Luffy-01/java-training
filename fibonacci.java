import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int k,a=1,b=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter and number you want to write the fibonacci of");
        int n=sc.nextInt();
        k=n;
        System.out.println();//space character.................
        System.out.print("1 1 ");//stating by printing 1 1..
        while(k<=n)
        {
            k=a+b;
            if(k>=n)
                break;
            System.out.print( k + " "); //print the new character a+b ........
            a=b;  //reassigning the value of a and b for further adding.....
            b=k;
        }
        System.out.printf("\n\n");//space character.........
    }
    
}

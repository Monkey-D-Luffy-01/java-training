import java.util.Scanner;

public class perfectno {
    public static void main(String[] args) {
        //perfect no: 6 -> 1 + 2 + 3 = 6                       ( 1 , 2 , 3 are the factors of 6 )
        // 28 ->  1 + 2 + 4 + 7 + 14 = 28                  ( 1 , 2 , 4 , 7 , 14  are the factors of 28 )
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the number you want to check if perfect : ");
        n=sc.nextInt();
        if  (isperfect(n))
            System.out.println("The number "+ n+ " is perfect");
        else 
            System.out.println("The number " + n + " is not perfect");
    }
    public static boolean isperfect(int n) {
        int m=n,perfect=0;
        for(int i=1;i<n;i++)
        {
            if (m%i==0)
                perfect=perfect+i;
        }
        if (n==perfect)
            return true;
        return false;
        
    }
}

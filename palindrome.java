import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n,temp,pal;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number you want to check the palindrome of : ");
        n=sc.nextInt();
        int m=n;
        pal=0;
        do
        {   
            temp=m%10;
            pal=pal*10+temp; 
            m=m/10;

        }while(m!=0);
        if (pal==n){
            System.out.println(n + " is a palindrome ");
        }
        else 
            System.out.println(n + " is not a palindrome ");
    }
    
}

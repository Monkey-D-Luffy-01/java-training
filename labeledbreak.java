public class labeledbreak{
    public static void main(String[] args) {
        ravi:
        for(int j=0;j<=4;j++){
            for (int i=0; i<=4;i++)
            {
            if(j==3)
                break ravi; //unlabeled break statement 
            System.out.print("* ");
            }
        System.out.println(" ");
        
        }
    }
}